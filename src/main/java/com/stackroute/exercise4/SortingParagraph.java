package com.stackroute.exercise4;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to arrange a paragraph in alphabetical order
 */
public class SortingParagraph {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a paragraph");
		String input = sc.nextLine();
		String[] output = sorter(input);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
		sc.close();
	}

	/**
	 * @param input
	 * @return str 
	 * method to arrange all the words in a paragraph in a alphabetical order
	 */
	public static String[] sorter(String input) {
		String in=input.toLowerCase();
		String temp = "";
		String[] str = in.trim().split("[,. ]");
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		return str;
	}

}
