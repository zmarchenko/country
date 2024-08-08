package quru.qa.country.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import quru.qa.country.data.CountryEntity;
import quru.qa.country.data.CountryRepository;
import quru.qa.country.mapper.CountryMapper;
import quru.qa.country.model.Country;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    public List<Country> allCountries() {
        return countryRepository.findAll().stream()
                .map(countryMapper::toModel)
                .toList();
    }

    public Country addCountry(Country country) {
        CountryEntity entity = countryMapper.toEntity(country);
        entity = countryRepository.save(entity);
        return countryMapper.toModel(entity);
    }

    @Transactional
    public Country updateCountryName(UUID id, Country country) {
        CountryEntity entity = countryRepository.getReferenceById(id);
        entity.setName(country.name());
        entity = countryRepository.save(entity);
        return countryMapper.toModel(entity);
    }

}