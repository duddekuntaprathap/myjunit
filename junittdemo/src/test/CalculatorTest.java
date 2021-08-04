package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import business.Calculator;

public class CalculatorTest {
	
	//create  object of a class to be tested
	private Calculator calc;

	@Before
	public void setUp() throws Exception {
		calc=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		calc=null;
	}

	@Test
	public void testAdd() {
		double result=calc.add(10.3,34.2);
		assertEquals(44.5, result,0);
	}

	@Test
	public void testSubtract() {
		double result=calc.subtract(100, 45.5);
		assertEquals(54.5, result,0);
	}

	@Test
	public void testMultiply() {
		double result=calc.multiply(2, 5.5);
		assertEquals(11, result,0);
	}

	@Test
	public void testDivide() {
		double result=calc.divide(5, 2);
		assertEquals(2.5, result,0);
	}
	@Test(expected=ArithmeticException.class)
	public void divideByZero()
	{
		calc.divide(200, 0);
	}

}
