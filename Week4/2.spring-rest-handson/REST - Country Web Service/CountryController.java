package com.example.springrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("IN", "India"));
        countries.add(new Country("US", "United States"));
        countries.add(new Country("JP", "Japan"));
        return countries;
    }
}

