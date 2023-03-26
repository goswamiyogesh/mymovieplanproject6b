package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.OrderTable;

public interface OrderRepo extends JpaRepository<OrderTable, Integer>{

}
