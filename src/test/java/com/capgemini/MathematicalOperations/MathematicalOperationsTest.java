package com.capgemini.MathematicalOperations;

//import org.apache.commons.math3;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class MathematicalOperationsTest {

	MathematicalOperations mo;

	@Before
	public void setUpBefore() {
		mo = new MathematicalOperations();
	}

	@Test
	public void absShouldReturn0For0() {
		// given
		double number = 0;
		// when
		double result = mo.abs(number);
		// then
		assertEquals(0, result, 0);
	}
	
	@Test
	public void absShouldReturn1For1() {
		// given
		double number = 1;
		// when
		double result = mo.abs(number);
		// then
		assertEquals(1, result, 0);
	}
	
	@Test
	public void absShouldReturn1ForMinus1() {
		// given
		double number = -1;
		// when
		double result = mo.abs(number);
		// then
		assertEquals(1, result, 0);
	}
	
	@Test
	public void absShouldReturn2For2() {
		// given
		double number = 2;
		// when
		double result = mo.abs(number);
		// then
		assertEquals(2, result, 0);
	}
	
	@Test
	public void absShouldReturn2ForMinus2() {
		// given
		double number = -2;
		// when
		double result = mo.abs(number);
		// then
		assertEquals(2, result, 0);
	}

	@Test
	public void shouldReturn4For2_2() {
		// given
		int number1 = 2;
		int number2 = 2;
		// when
		int result = mo.sum(number1, number2);
		// then
		assertEquals(4, result);
	}

	@Test
	public void shouldReturn0For0_0() {
		// given
		int number1 = 0;
		int number2 = 0;
		// when
		int result = mo.sum(number1, number2);
		// then
		assertEquals(0, result);
	}

	@Test
	public void shouldReturn0Forminus2_plus2() {
		// given
		int number1 = -2;
		int number2 = 2;
		// when
		int result = mo.sum(number1, number2);
		// then
		assertEquals(0, result);
	}

	@Test
	public void shouldReturnminus4Forminus2_minus2() {
		// given
		int number1 = -2;
		int number2 = -2;
		// when
		int result = mo.sum(number1, number2);
		// then
		assertEquals(-4, result);
	}
}
