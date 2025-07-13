package com.example.springrest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    private List<Country> countries = new ArrayList<>();

    public CountryController() {
        countries.add(new Country("IN", "India"));
        countries.add(new Country("US", "United States"));
        countries.add(new Country("JP", "Japan"));
    }
//    @GetMapping("/countries")
//    public List<Country> getAllCountries() {
//        return countries;
//    }

    @GetMapping("/countries/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        for (Country country : countries) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Country not found"); // You’ll handle proper 404 error in a later task
    }
}
