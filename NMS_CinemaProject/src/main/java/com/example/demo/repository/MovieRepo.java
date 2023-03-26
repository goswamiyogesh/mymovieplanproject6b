package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.example.demo.model.Movie;

public interface MovieRepo extends JpaRepository<Movie, Integer>{
	@Query("select m from Movie m where m.title LIKE %?1%")
    public List<Movie> findBykeyword(String keyword);
}
