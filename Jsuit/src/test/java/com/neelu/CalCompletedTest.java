package com.neelu;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalCompletedTest {

	@Test
	public void test() {
		CalCompleted c1=new CalCompleted();
		assertEquals("Comp",c1.sayCom());
	}

}
