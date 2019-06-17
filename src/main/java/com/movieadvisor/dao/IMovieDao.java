package com.movieadvisor.dao;

import java.util.List;

import com.movieadvisor.model.Movie;

public interface IMovieDao {
	public Movie findById(int id);
	public List<Movie> findAll();
	public void insert(Movie movie);
	public void delete(Movie movie);
}
