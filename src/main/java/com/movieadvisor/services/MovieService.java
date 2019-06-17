package com.movieadvisor.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.movieadvisor.dao.MovieDao;
import com.movieadvisor.model.Movie;

public class MovieService {
	@Autowired
	private MovieDao dao;
		
	public void setDao(MovieDao dao) {
		this.dao = dao;
	}

	
	public List<Movie> filterByGenre(String genre) {
		List<Movie> movies = new ArrayList<Movie>();
		
		this.dao.findAll().forEach(movie -> {
			if(movie.getGenre() == genre) movies.add(movie);
		});
		
		return movies;
	}
}
