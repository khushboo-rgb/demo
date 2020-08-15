package com.cybage.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cybage.model.CatalogItem;
import com.cybage.model.Movie;
import com.cybage.model.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
 
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatlog(@PathVariable("userId") String userId)
	{
		RestTemplate restTemplate = new RestTemplate();
		
		//get all rated movie ID's
		
		List<Rating> ratings = Arrays.asList(
				new Rating("101",4),
				new Rating("102",6),
				new Rating("103",7),
				new Rating("104",5),
				new Rating("105",3)
				);
		
		return ratings.stream()
		.map(rating -> {
			Movie movie = restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
		return new CatalogItem(movie.getName(),"romantic",rating.getRating());
		})
		.collect(Collectors.toList());
		
		
		//for each movie Id , call movie info service and get details
		// put them all together
		
		


	}
}
