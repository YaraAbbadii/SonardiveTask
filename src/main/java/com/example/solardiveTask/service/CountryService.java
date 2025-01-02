package com.example.solardiveTask.service;

import com.example.solardiveTask.dto.CountryDto;
import com.example.solardiveTask.entity.Country;
import com.example.solardiveTask.mapper.CountryMapper;
import com.example.solardiveTask.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    @Autowired
    public CountryService(CountryRepository countryRepository, CountryMapper countryMapper) {
        this.countryRepository = countryRepository;
        this.countryMapper = countryMapper;
    }

    public CountryDto getCountryDtoById(int id) {
        Country country = countryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Country not found"));
        return countryMapper.toCountryDto(country);
    }

    public String getName(String isoCode) {
        return "name of " + isoCode;
    }
}


