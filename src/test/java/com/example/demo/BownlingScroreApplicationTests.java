package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class BownlingScroreApplicationTests {

	@Test
	void testRoll() {
		Game g = new Game();
		int score = g.roll(10);
		assertTrue(score <= 10);
		assertTrue(score >= 0);
	}

}
