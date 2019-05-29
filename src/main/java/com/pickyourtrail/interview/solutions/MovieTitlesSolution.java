package com.pickyourtrail.interview.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.pickyourtrail.interview.models.MovieData;
import com.pickyourtrail.interview.models.MovieResponse;

public class MovieTitlesSolution {
	
	private static final String API_ENDPOINT = "https://jsonmock.hackerrank.com/api/movies/search/?Title=%s&page=%d";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String substr = scanner.nextLine();
		String[] titles = getMovieTitles(substr);
		for(String title: titles) {
			System.out.println(title);
		}
		scanner.close();
	}
	
	public static String[] getMovieTitles(String substr) {
		ArrayList<String> titles = new ArrayList<String>();
		// retrieve the data
		RestTemplate template = new RestTemplate();
		template.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		int page = 0;
		int total = 1;
		// pagination
		do {
			page++;
			String url = String.format(API_ENDPOINT, substr, page);
			ResponseEntity<MovieResponse> responseEntity = template.getForEntity(url, MovieResponse.class);
			MovieResponse response = responseEntity.getBody();
			List<MovieData> movies = response.getData();
			movies.stream().forEach(movie -> {
				titles.add(movie.getTitle());
			});
			total = response.getTotalPages();
		} while(page < total);
		// sort the data - use natural ordering since String
		Collections.sort(titles);
		return titles.toArray(new String[titles.size()]);
	}
	
}
