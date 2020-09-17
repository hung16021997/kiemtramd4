package com.example.demo.repositories;

import com.example.demo.models.TheCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICityRepository extends CrudRepository<TheCity,Long> {
    List<TheCity> findAllByCountry_Id(Long id);
}
