package com.example.solardiveTask.mapper;

import com.example.solardiveTask.dto.CompanyDto;
import com.example.solardiveTask.entity.Company;
import com.example.solardiveTask.entity.Country;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyMapperTest {

    private final CompanyMapper companyMapper = Mappers.getMapper(CompanyMapper.class);

    @Test
    void testToCompanyDto() {
        Country country = new Country(1, "US");

        Company company = new Company(1, "Tech Corp", country);

        CompanyDto companyDto = companyMapper.toCompanyDto(company);

        assertEquals(1, companyDto.id());
        assertEquals("Tech Corp", companyDto.name());
        assertEquals(1, companyDto.country().id());
        assertEquals("US", companyDto.country().isoCode());
    }
}
