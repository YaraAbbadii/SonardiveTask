package com.example.solardiveTask.mapper;

import com.example.solardiveTask.dto.CountryDto;
import com.example.solardiveTask.entity.Country;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountryMapperTest {

    private final CountryMapper countryMapper = Mappers.getMapper(CountryMapper.class);

    @Test
    void testToCountryDto() {

        Country country = new Country();
        country.setId(1);
        country.setIsoCode("US");

        CountryDto countryDto = countryMapper.toCountryDto(country);

        assertEquals(country.getId(), countryDto.id());
        assertEquals(country.getIsoCode(), countryDto.isoCode());
    }
}
