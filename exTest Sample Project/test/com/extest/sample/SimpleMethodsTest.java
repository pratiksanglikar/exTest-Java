package com.extest.sample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class SimpleMethodsTest {
	
	private SimpleMethods sm;
	
	@Before
	void setupTests() {
		sm = new SimpleMethods();
	}

	@Test
	void testGetA() {
		Assert.assertEquals("A", sm.getA());
	}
	
	@Test
	void testGetB() {
		Assert.assertEquals("B", sm.getB());
	}
	
	@Test
	void testGetC() {
		Assert.assertEquals("C", sm.getC());
	}

}
