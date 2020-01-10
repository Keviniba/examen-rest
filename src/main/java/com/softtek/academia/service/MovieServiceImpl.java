package com.softtek.academia.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.softtek.academia.entity.Movie;
import com.softtek.academia.repository.MovieRepository;
import com.softtek.javaweb.domain.model.User;

@Service
@Transactional
public class MovieServiceImpl implements MovieService{
		
		@Autowired
		private MovieRepository repository;
		
		
	@Override
	public List<Movie> getAllMovies() {
		return (List<Movie>)repository.findAll();
	}

	@Override
	
	public Movie getMovieById(final Integer id) {
		Movie movie = this.repository.findById(id).orElse(null);	
		return movie;
	}

	@Override
	public Movie saveMovie(final Movie movie) {
		return this.repository.save(movie);
	}
	

	@Override
	public Movie updateMovie (final Movie movie) {
		return repository.save(movie);
	}
	@Override
	public boolean deleteMovieById(Integer id) {
		this.repository.deleteById(id);
		return true;
	}

	@Override
	public Movie getMovieByName(String title) {
		
		return null;
	}
	}
