package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.FoodItem;

public interface FoodItemRepo extends JpaRepository<FoodItem, Integer> {
@Query("select f from FoodItem f where CONCAT(f.name,f.price) LIKE %?1%")
public List<FoodItem> search(String keyword);
}
