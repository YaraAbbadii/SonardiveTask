package com.example.solardiveTask.mapper;

import com.example.solardiveTask.dto.CompanyDto;
import com.example.solardiveTask.entity.Company;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = CountryMapper.class)
public interface CompanyMapper {

    @Mapping(source = "country", target = "country")
    CompanyDto toCompanyDto(Company company);
}
