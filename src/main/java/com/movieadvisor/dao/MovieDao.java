package com.movieadvisor.dao;

import java.util.ArrayList;
import java.util.List;

import com.movieadvisor.model.Movie;

public class MovieDao implements IMovieDao {

	List<Movie> movies;
	
	public MovieDao() {
		this.movies = new ArrayList<Movie>();
	}
	
	public Movie findById(int id) {
		return this.movies.get(id);
	}

	public List<Movie> findAll() {
		return this.movies;
	}

	public void insert(Movie movie) {
		this.movies.add(movie);
	}

	public void delete(Movie movie) {
		this.movies.remove(movie);
	}

	public void init() {
		this.insert(new Movie("La guerra de las galaxias", "1977","Ciencia ficción"));
		this.insert(new Movie("La lista de Schindler","1993","Drama"));
		this.insert(new Movie("El Padrino", "1972", "Drama"));
		this.insert(new Movie("Apocalypse Now", "1979", "Bélico"));
		this.insert(new Movie("Gladiator", "2000", "Acción"));
		this.insert(new Movie("El Gran Dictador","1940","Comedia"));
	}
}
