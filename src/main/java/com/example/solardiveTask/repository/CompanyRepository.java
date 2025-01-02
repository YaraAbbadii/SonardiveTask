package com.example.solardiveTask.repository;

import com.example.solardiveTask.entity.Company;
import com.example.solardiveTask.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
    List<Company> findByCountry(Country country);

    List<Company> findByName(String name);
    List<Company> findByCountryAndName(Country country, String name);
}
