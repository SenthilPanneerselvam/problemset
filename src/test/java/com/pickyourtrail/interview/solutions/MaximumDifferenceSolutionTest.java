package com.pickyourtrail.interview.solutions;

import org.junit.Assert;
import org.junit.Test;


public class MaximumDifferenceSolutionTest {
	
	@Test
	public void testAscendingOrder() {
		int[] input = {1,2,3,4,5};
		int expected = 4;
		int actual = MaximumDifferenceSolution.maxDifference(input);
		Assert.assertTrue(actual == expected);
		printStatus(input, actual , expected);
	}
	
	private void printStatus(int[] input, int actual, int expected) {
		StringBuilder out = new StringBuilder("[");
		for(int in: input) {
			out.append(in);
			out.append(",");
		}
		out.append("]");
		System.out.println("The result of maximum difference for the array " + out.toString() + " is " + actual);
	}

	@Test
	public void testDescendingOrder() {
		int[] input = {5,4,3,2,1};
		int expected = -1;
		int actual = MaximumDifferenceSolution.maxDifference(input);
		Assert.assertTrue(actual == expected);
		printStatus(input, actual , expected);
	}
	
	@Test
	public void testSmallerNumberInEnd() {
		int[] input = {2,8,9,10,6,1};
		int expected = 8;
		int actual = MaximumDifferenceSolution.maxDifference(input);
		Assert.assertTrue(actual == expected);
		printStatus(input, actual , expected);
	}
	
	@Test
	public void testBiggerNumberInStart() {
		int[] input = {27, 18, 7, 35, 30};
		int expected = 28;
		int actual = MaximumDifferenceSolution.maxDifference(input);
		Assert.assertTrue(actual == expected);
		printStatus(input, actual , expected);
	}
	
	@Test
	public void testBiggerNumberInMiddle() {
		int[] input = {7, 4, 8, 1, 32, 6, 9, 1};
		int expected = 31;
		int actual = MaximumDifferenceSolution.maxDifference(input);
		Assert.assertTrue(actual == expected);
		printStatus(input, actual , expected);
	}
	
	@Test
	public void testSmallerNumberInMiddle() {
		int[] input = {5, 3, 1, 2, 4, 9};
		int expected = 8;
		int actual = MaximumDifferenceSolution.maxDifference(input);
		Assert.assertTrue(actual == expected);
		printStatus(input, actual , expected);
	}
	
	@Test
	public void testSmallerNumberAtSecondIteration() {
		int[] input = {2, 8, 7, 1, 2, 10};
		int expected = 9;
		int actual = MaximumDifferenceSolution.maxDifference(input);
		Assert.assertTrue(actual == expected);
		printStatus(input, actual , expected);
	}
	
	@Test
	public void testBiggerNumberAtSecondIteration() {
		int[] input = {1, 5, 4, 13, 8};
		int expected = 12;
		int actual = MaximumDifferenceSolution.maxDifference(input);
		Assert.assertTrue(actual == expected);
		printStatus(input, actual , expected);
	}

}
