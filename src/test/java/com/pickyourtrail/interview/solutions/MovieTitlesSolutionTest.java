package com.pickyourtrail.interview.solutions;

import org.junit.Assert;
import org.junit.Test;


public class MovieTitlesSolutionTest {
	
	@Test
	public void testTitleRetrieval() {
		System.out.println("Retrieving titles for Behind");
		String[] titles = MovieTitlesSolution.getMovieTitles("Behind");
		Assert.assertTrue(titles.length == 6);
		for(int i=0; i<titles.length-1; i++) {
			Assert.assertTrue(titles[i].compareTo(titles[i+1]) < 1);
		}
	}
	
	@Test
	public void testPagination() {
		System.out.println("Retrieving titles for spiderman");
		String[] titles = MovieTitlesSolution.getMovieTitles("spiderman");
		Assert.assertTrue(titles.length == 13);
		for(int i=0; i<titles.length-1; i++) {
			Assert.assertTrue(titles[i].compareTo(titles[i+1]) < 1);
		}
	}
	
	@Test
	public void testEmptyResponse() {
		System.out.println("Retrieving titles for zyx");
		String[] titles = MovieTitlesSolution.getMovieTitles("zyx");
		Assert.assertTrue(titles == null || titles.length == 0);
	}
	
	@Test
	public void testTitleWithSpace() {
		System.out.println("Retrieving titles for 'Behind the'");
		String[] titles = MovieTitlesSolution.getMovieTitles("Behind the");
		Assert.assertTrue(titles.length == 6);
		for(int i=0; i<titles.length-1; i++) {
			Assert.assertTrue(titles[i].compareTo(titles[i+1]) < 1);
		}
		System.out.println("Retrieving titles for ' '");
		titles = MovieTitlesSolution.getMovieTitles(" ");
		Assert.assertTrue(titles != null && titles.length > 0);
		for(int i=0; i<titles.length-1; i++) {
			Assert.assertTrue(titles[i].contains(" "));
		}
	}
	
	@Test
	public void testTitleWithQuotes() {
		System.out.println("Retrieving titles for '");
		String[] titles = MovieTitlesSolution.getMovieTitles("'");
		Assert.assertTrue(titles != null && titles.length > 0);
		for(int i=0; i<titles.length-1; i++) {
			Assert.assertTrue(titles[i].contains("'"));
		}
	}
	
}
