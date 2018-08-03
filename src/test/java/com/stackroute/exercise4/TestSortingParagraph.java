package com.stackroute.exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSortingParagraph {
	SortingParagraph obj=new SortingParagraph();
	String[] arr= {"all","alphabetical","and","array","array","can","compareTo","easily","enter","enter","help","in","in","names","names","now","of","of","operator","order","size","sort","that","the","the","then","we","with"};
	@Test
	void test() {
		assertEquals(arr
,obj.sorter("enter size of array and then enter all the names in that array. now with the help of compareTo operator we can easily sort names in alphabetical order"));
	}

}
