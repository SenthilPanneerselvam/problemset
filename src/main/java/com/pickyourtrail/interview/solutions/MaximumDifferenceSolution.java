package com.pickyourtrail.interview.solutions;

import java.util.Scanner;

public class MaximumDifferenceSolution {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer size = scanner.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = scanner.nextInt();
		}
		Integer difference = maxDifference(array);
		System.out.println(difference);
		scanner.close();
	}

	public static Integer maxDifference(int[] array) {
		int smallerNumber = array[0];
		int biggerNumber = array[0]-1;
		boolean smallerNumberChanged = true;
		boolean biggerNumberChanged = false;
		int maxDifference = biggerNumber - smallerNumber;
		for(int i=1;i<array.length;i++) {
			// find the continuous biggest number
			if(array[i] > smallerNumber && (i == array.length-1 || array[i+1]<array[i])) {
				biggerNumber = array[i];
				biggerNumberChanged = true;
			}
			// find the smaller number
			else if(array[i] < smallerNumber) {
				smallerNumber = array[i];
				smallerNumberChanged = true;
			}
			// compute difference only if the boundaries change
			if((smallerNumberChanged && biggerNumberChanged)|| biggerNumberChanged) {
				int tempDifference = biggerNumber - smallerNumber;
				if(tempDifference > maxDifference) {
					maxDifference = tempDifference;
				}
				smallerNumberChanged = false;
				biggerNumberChanged = false;
			}
		}		
		return maxDifference;
	}

}
