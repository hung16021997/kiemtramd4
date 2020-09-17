package com.example.demo.services;

import com.example.demo.models.Country;

import java.util.List;

public interface ICountryService {
    List<Country> findAll();
    Country findOne(Long id);
    Country createCountry(Country country);
    Country delete(Long id);
}
