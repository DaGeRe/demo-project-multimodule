package de.dagere.base;

import org.junit.jupiter.api.Test;

public class BaseTest {

	@Test
	public void testMe() {
		final BaseChangeable instance = new BaseChangeable();
		instance.doSomething();
	}

	@Test
	public void testMeAlso() {
		final BaseChangeable instance = new BaseChangeable();
		instance.doSomething();
	}
}
