package com.stackroute.exercise4;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to invert the letters of words in a sentence
 *
 */
public class InvertedSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String input = sc.nextLine();
		String inverted = inverter(input);
		System.out.println(inverted);
		sc.close();

	}

	/**
	 * @param input
	 * @return sen 
	 * method to reverse a sentence
	 */
	public static String inverter(String input) {
		String[] words = input.split(" ");
		String invertedSentece = "";
		for (String word : words) {
			String invertedWord = "";
			for (int i = word.length() - 1; i >= 0; i--)
				invertedWord += word.charAt(i);
			invertedSentece += invertedWord;
			invertedSentece += " ";
		}
		String sen = invertedSentece.trim();
		return sen;
	}
}
