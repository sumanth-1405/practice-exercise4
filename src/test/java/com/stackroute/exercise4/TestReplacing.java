package com.stackroute.exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestReplacing {

	Replacing obj=new Replacing();

	@Test
	void test() {
		assertEquals("faity fry",obj.replacer("daily dry"));
	}

}
