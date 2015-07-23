package com.capgemini.MathematicalOperations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MathematicalOperationsTest {
	MathematicalOperations mo;

	@Before
	public void setUp() {
		mo = new MathematicalOperations();
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentExceptionWhenGivenNegativeNumber() {
		mo.calculateQuadraticResidues(-5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentExceptionWhenGiven0() {
		mo.calculateQuadraticResidues(0);
	}

	@Test
	public void shouldReturnListOfSize1AndContainingOnlyValue0WhenGiven1() {
		assertEquals(1, mo.calculateQuadraticResidues(1).size());
		assertTrue(mo.calculateQuadraticResidues(1).contains(0));
	}

	@Test
	public void shouldReturnListOfSize2AndContainingValues0And1WhenGiven2() {
		assertEquals(2, mo.calculateQuadraticResidues(2).size());
		assertTrue(mo.calculateQuadraticResidues(2).contains(0));
		assertTrue(mo.calculateQuadraticResidues(2).contains(1));
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
