package com.example.demo.services.Impl;

import com.example.demo.models.Country;
import com.example.demo.repositories.ICountryRepository;
import com.example.demo.services.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements ICountryService {
    @Autowired
    private ICountryRepository countryRepository;
    @Override
    public List<Country> findAll() {
        return (List<Country>) countryRepository.findAll();
    }

    @Override
    public Country findOne(Long id) {
        return countryRepository.findById(id).orElse(null);
    }

    @Override
    public Country createCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country delete(Long id) {
        Country country = countryRepository.findById(id).orElse(null);
        countryRepository.delete(country);
        return country;
    }
}
