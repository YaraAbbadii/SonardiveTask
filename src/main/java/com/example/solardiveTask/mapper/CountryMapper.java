package com.example.solardiveTask.mapper;

import com.example.solardiveTask.dto.CountryDto;
import com.example.solardiveTask.entity.Country;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CountryMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "isoCode", target = "isoCode")
    CountryDto toCountryDto(Country country);
}