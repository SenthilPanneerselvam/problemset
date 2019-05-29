package com.pickyourtrail.interview.solutions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BalancedStringSolution {
	
	private static final Pattern BALANCED_STRING = 
			Pattern.compile("^(?=(([^ac]*[ac]){2})*[^ac]*$)(?=(([^bd]*[bd]){2})*[^bd]*$)[abcd]*$");
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println(checkBalancedString(string));
		scanner.close();
	}
	
	public static boolean checkBalancedString(String string) {
		return BALANCED_STRING.matcher(string).matches();
	}

}
