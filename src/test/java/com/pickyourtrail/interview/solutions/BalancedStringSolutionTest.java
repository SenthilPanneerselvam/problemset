package com.pickyourtrail.interview.solutions;

import org.junit.Assert;
import org.junit.Test;


public class BalancedStringSolutionTest {
	
	private void printResult(String string, boolean status) {
		if(status) {
			System.out.println(string + " is a balanced string");
		} else {
			System.out.println(string + " is not a balanced string");
		}
	}
	
	@Test
	public void testoddNumberofA() {
		String testStr = "a";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
		testStr = "aaa";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
		
	}
	
	@Test
	public void testEvenNumberofA() {
		String testStr = "aa";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertTrue(status);
		testStr = "aaaa";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertTrue(status);
	}
	
	@Test
	public void testOddNumberofC() {
		String testStr = "c";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
		testStr = "ccc";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
	}
	
	@Test
	public void testEvenNumberofC() {
		String testStr = "cc";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertTrue(status);
		testStr = "cccc";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertTrue(status);
	}
	
	@Test
	public void testOddNumberofAandC() {
		String testStr = "aac";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
		testStr = "caa";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
	}
	
	@Test
	public void testEvenNumberofAandC() {
		String testStr = "acca";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertTrue(status);
		testStr = "caca";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertTrue(status);
	}
	
	@Test
	public void testOddNumberofAandEvenNumberofC() {
		String testStr = "cac";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
		testStr = "ccccaaa";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
	}
	
	@Test
	public void testEvenNumberofAandOddNumberofC() {
		String testStr = "aacaa";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
		testStr = "ccaca";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
	}
	
	@Test
	public void testoddNumberofB() {
		String testStr = "b";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
		testStr = "bbb";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
	}
	
	@Test
	public void testEvenNumberofB() {
		String testStr = "bb";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertTrue(status);
		testStr = "bbbbbb";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertTrue(status);
	}
	
	@Test
	public void testOddNumberofD() {
		String testStr = "d";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
		testStr = "ddd";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
	}
	
	@Test
	public void testEvenNumberofD() {
		String testStr = "dd";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertTrue(status);
		testStr = "dddd";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertTrue(status);
	}
	
	@Test
	public void testOddNumberofBandD() {
		String testStr = "aabbdbdc";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
		testStr = "bcdada";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
	}
	
	@Test
	public void testEvenNumberofBandD() {
		String testStr = "abab";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertTrue(status);
		testStr = "cbdbda";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertTrue(status);
	}
	
	@Test
	public void testOddNumberofBandEvenNumberofD() {
		String testStr = "bdd";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
		testStr = "bdbddbd";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
	}
	
	@Test
	public void testEvenNumberofBandOddNumberofD() {
		String testStr = "bddbd";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
		testStr = "abdbddc";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertFalse(status);
	}
	
	@Test
	public void testEvennumberACandEvenBD() {
		String testStr = "abcdabcd";
		boolean status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertTrue(status);
		testStr = "abcdcbad";
		status = BalancedStringSolution.checkBalancedString(testStr);
		printResult(testStr, status);
		Assert.assertTrue(status);
	}

}
