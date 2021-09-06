package tech.kbtg.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloTest {

	@Test
	public void test() {
		//Arrange
		Hello hello = new Hello();
		//Act
		String actualResult = hello.sayHi("Noey");
		//Assert
		assertEquals("Hello, Noey", actualResult);
	}

}
