package com.stackroute.exercise4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringIndex {
	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);           
	    System.out.println("Enter the string ");
	    String text = sc.nextLine();
	    System.out.println("Enter the given word ");
	    String word = sc.nextLine();
	    SubStringIndex match=new SubStringIndex();
	    match.isFound(text, word);
	    
	    
	}

	public void isFound(String text,String word) {
	               Pattern pattern = Pattern.compile(word);
	    Matcher matcher = pattern.matcher(text);          
	    
	    @SuppressWarnings("unused")
		int count = 0;
	    while(matcher.find()) {
	        count++;
	        System.out.println("found at" + " : "
	                + matcher.start() + " - " + matcher.end());
	    }
	}
	}


