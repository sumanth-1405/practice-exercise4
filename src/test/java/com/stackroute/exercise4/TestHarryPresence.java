package com.stackroute.exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHarryPresence {
	HarryPresence obj=new HarryPresence();

	@Test
	void testTrue() {
		assertEquals(true,obj.isPresent("this is Harry"));
	}
	@Test
	void testFalse() {
		assertEquals(false,obj.isPresent("this is Henry"));
	}

}
