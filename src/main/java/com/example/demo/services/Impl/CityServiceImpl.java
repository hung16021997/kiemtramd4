package com.example.demo.services.Impl;

import com.example.demo.models.TheCity;
import com.example.demo.repositories.ICityRepository;
import com.example.demo.services.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements ICityService {
    @Autowired
    private ICityRepository cityRepository;
    @Override
    public List<TheCity> findAll() {
        return (List<TheCity>) cityRepository.findAll();
    }

    @Override
    public TheCity findOne(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    @Override
    public TheCity createCity(TheCity theCity) {
        return cityRepository.save(theCity);
    }

    @Override
    public TheCity delete(Long id) {
        TheCity city = cityRepository.findById(id).orElse(null);
        cityRepository.delete(city);
        return city;
    }

    @Override
    public List<TheCity> findAllByCountry_Id(Long id) {
        return cityRepository.findAllByCountry_Id(id);
    }
}
