package quru.qa.country.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import quru.qa.country.data.CountryRepository;
import quru.qa.country.model.Country;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public List<Country> allCountries() {
        return countryRepository.findAll().stream().map(
                        entity -> new Country(
                                entity.getName(),
                                entity.getCode(),
                                entity.getDate()))
                .toList();
    }
}