package com.stackroute.exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInvertedSentence {
	InvertedSentence obj=new InvertedSentence();

	@Test
	void test() {
		assertEquals("siht si a gnirts",obj.inverter("this is a string"));
	}

}
