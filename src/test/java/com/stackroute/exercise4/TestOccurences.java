package com.stackroute.exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestOccurences {
	Occurences obj=new Occurences();

	@Test
	void test() {
		assertEquals(10,obj.counter("Java is java again java again", "a", 0));
	}

}
