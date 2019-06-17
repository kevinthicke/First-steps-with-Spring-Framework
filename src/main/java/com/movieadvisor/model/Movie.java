package com.movieadvisor.model;

public class Movie {
	private static int _id;
	private int id;
	private String title;
	private String year;
	private String genre;

	public Movie() {
		this.id = _id;
		_id++;
	}

	public Movie(String title, String year, String genre) {
		this();
		this.title = title;
		this.year = year;
		this.genre = genre;
	}

	public static int get_id() {
		return _id;
	}

	public static void set_id(int _id) {
		Movie._id = _id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", genre=" + genre + "]";
	}

}
