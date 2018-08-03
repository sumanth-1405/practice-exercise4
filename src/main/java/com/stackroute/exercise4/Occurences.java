package com.stackroute.exercise4;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to take a string and return no of occurences of a given character
 */
public class Occurences {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter a string");
		String input = sc.nextLine();
		System.out.println("enter a character to find it's occurences");
		String key = sc.next();
		int i = 0;
		int count = counter(input, key, i);
		System.out.println(count);
		sc.close();
	}

	/**
	 * @param input
	 * @param key
	 * @param i
	 * @return i 
	 * method to count the number of occurences of a character
	 */
	public static int counter(String input, String key, int i) {
		if (input.contains(key)) {
			int index = input.indexOf(key);
			i++;
			input = input.substring(index + 1);
			i = counter(input, key, i);
		}
		return i;
	}

}
