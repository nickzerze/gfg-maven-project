package gfg32maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMyCalc {

	MyCalc calc = new MyCalc();
	
	@Test
	void test_sum() {
		assertEquals(30, calc.sum(20, 10));
		assertEquals(2, calc.sum(1, 1));
		assertEquals(0, calc.sum(1, -1));
	}
	
	@Test
	void test_diff() {
		assertEquals(10, calc.diff(20, 10));
		assertEquals(0, calc.diff(1, 1));
		assertEquals(-2, calc.diff(-1, 1));
	}

}
