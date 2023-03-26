package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepo;

@Service
public class MovieDAO {
	@Autowired
MovieRepo mrepo;
	
	//insert movie
	public Movie insert(Movie a) {
		return mrepo.save(a);
	}
	
	//list of movie
		public List<Movie> getall(){
			return mrepo.findAll();
		}
		//delete Movie
		public String delete(Movie a) {
			mrepo.delete(a);
			return "Deleted";
		}
		//update movie
		public Movie update(Movie a) {
			Movie aa=mrepo.findById(a.getMid()).orElse(null);
			aa.setTitle(a.getTitle());
			aa.setLanguage(a.getLanguage());
			aa.setGenre(a.getGenre());
			aa.setPrice(a.getPrice());
			aa.setTickets(a.getTickets());
			aa.setTime(a.getTime());
			aa.setFile_path(a.getFile_path());
			return mrepo.save(aa);
		}
		public  List<Movie> findBykeyword(String keyword){
			return mrepo.findBykeyword(keyword);
		}
}
