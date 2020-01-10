package com.softtek.academia.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academia.entity.Movie;
import com.softtek.academia.repository.MovieRepository;

@Service
public interface MovieService {
	
	public List<Movie> getAllMovies();
	
	public Movie getMovieById(Integer id);

	public Movie saveMovie(Movie Movie);

	public boolean deleteMovieById(Integer id);
	
	public Movie updateMovie(Movie movie);
	
	public Movie getMovieByName(String title);

}