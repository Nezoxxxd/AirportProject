package com.example.server.repo;

import com.example.server.models.Gender;
import com.example.server.models.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GenderRepo extends CrudRepository<Gender, String> {
    List<Gender> findAll();
}