package com.cybage.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Rating;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@RequestMapping("/{movieId}")
	public Rating getRatings(@PathVariable("movieId") String movieId)
	{
		return new Rating(movieId,4);
		
	}

}
