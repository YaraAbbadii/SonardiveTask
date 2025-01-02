package com.example.solardiveTask.repository;

import com.example.solardiveTask.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
