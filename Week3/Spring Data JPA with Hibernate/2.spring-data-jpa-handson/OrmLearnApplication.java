package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);
        testSearchContaining();
        testSearchContainingSorted();
        testSearchStartingWith();
    }

    private static void testSearchContaining() {
        LOGGER.info("Start testSearchContaining");
        List<Country> countries = countryService.searchByContainingText("ou");
        countries.forEach(c -> LOGGER.debug("Country: {}", c));
        LOGGER.info("End testSearchContaining");
    }

    private static void testSearchContainingSorted() {
        LOGGER.info("Start testSearchContainingSorted");
        List<Country> countries = countryService.searchByContainingTextSorted("ou");
        countries.forEach(c -> LOGGER.debug("Sorted Country: {}", c));
        LOGGER.info("End testSearchContainingSorted");
    }

    private static void testSearchStartingWith() {
        LOGGER.info("Start testSearchStartingWith");
        List<Country> countries = countryService.searchByStartingLetter("Z");
        countries.forEach(c -> LOGGER.debug("Country starting with Z: {}", c));
        LOGGER.info("End testSearchStartingWith");
    }
}