package com.example.demo.services;

import com.example.demo.models.TheCity;

import java.util.List;

public interface ICityService {
    List<TheCity> findAll();
    TheCity findOne(Long id);
    TheCity createCity(TheCity theCity);
    TheCity delete(Long id);
    List<TheCity> findAllByCountry_Id(Long id);
}
