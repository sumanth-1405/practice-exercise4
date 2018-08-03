package com.stackroute.exercise4;

import java.util.Scanner;

/**
 * @author sumanth reddy
 * program to replace certain characters with other characters
 */
public class Replacing {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter a string");
		String input = sc.nextLine();
		String newString = replacer(input);
		System.out.println(newString);
		sc.close();
	}

	/**
	 * @param input
	 * @return temp1 
	 * method to replace d with f and l with t
	 */
	public static String replacer(String input) {
		String temp = input.replace('d', 'f');
		String temp1 = temp.replace('l', 't');
		return temp1;
	}
}