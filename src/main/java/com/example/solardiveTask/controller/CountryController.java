package com.example.solardiveTask.controller;

import com.example.solardiveTask.dto.CountryDto;
import com.example.solardiveTask.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }


    @GetMapping("/country/{id}")
    public ResponseEntity<CountryDto> getCountry(@PathVariable int id) {
        CountryDto countryDto = countryService.getCountryDtoById(id);
        return ResponseEntity.ok(countryDto);
    }

}
