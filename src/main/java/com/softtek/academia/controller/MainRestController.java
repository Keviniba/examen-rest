package com.softtek.academia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.academia.entity.Movie;
import com.softtek.academia.service.MovieService;

@RestController
public class MainRestController {
	@Autowired 
	MovieService movieService; 
	

	@GetMapping (value = "/api/movies/", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Movie> getMovieList(){
		return movieService.getAllMovies();
	}


}
