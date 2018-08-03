package com.stackroute.exercise4;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to check the presence of a sub string
 */
public class HarryPresence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String input = sc.nextLine();
		boolean bool = isPresent(input);
		System.out.println("Is Harry here?:" + bool);
		sc.close();
	}

	/**
	 * @param input
	 * @return result 
	 * method to check whether sub string is present or not
	 */
	public static boolean isPresent(String input) {
		boolean result = false;
		if (input.contains("Harry")) {
			result = true;
		}
		return result;
	}

}
