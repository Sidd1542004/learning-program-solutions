package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> searchByContainingText(String text) {
        return countryRepository.findByNameContaining(text);
    }

    @Transactional
    public List<Country> searchByContainingTextSorted(String text) {
        return countryRepository.findByNameContainingOrderByNameAsc(text);
    }

    @Transactional
    public List<Country> searchByStartingLetter(String prefix) {
        return countryRepository.findByNameStartingWith(prefix);
    }
}