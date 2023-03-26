package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Theatre;

public interface TheatreRepo extends JpaRepository<Theatre, Integer>{

}
