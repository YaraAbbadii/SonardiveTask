package com.example.solardiveTask.service;

import com.example.solardiveTask.dto.CompanyDto;
import com.example.solardiveTask.entity.Company;
import com.example.solardiveTask.mapper.CompanyMapper;
import com.example.solardiveTask.repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    private final CompanyMapper companyMapper;
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyMapper companyMapper, CompanyRepository companyRepository) {
        this.companyMapper = companyMapper;
        this.companyRepository = companyRepository;
    }

    public CompanyDto getCompanyById(int id) {
        Company company = companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Company with id " + id + " not found"));
        return companyMapper.toCompanyDto(company);
    }
}
