package quru.qa.country.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import quru.qa.country.data.CountryRepository;
import quru.qa.country.mapper.CountryMapper;
import quru.qa.country.model.Country;

import java.util.List;

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

}