package quru.qa.country.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import quru.qa.country.model.Country;
import quru.qa.country.service.CountryService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/country")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping("/all")
    List<Country> allCountries() {
        return countryService.allCountries();
    }

    @PostMapping("/add")
    Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }

    @PatchMapping("/update/{id}")
    Country updateCountry(@PathVariable("id") UUID id, @RequestBody Country country) {
        return countryService.updateCountryName(id, country);
    }
}
