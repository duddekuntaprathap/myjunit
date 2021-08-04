package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import business.MyMath;

public class MyMathTest {

	MyMath m1;
	@Before
	public void setUp() throws Exception {
		m1=new MyMath();
	}

	@After
	public void tearDown() throws Exception {
		m1=null;
	}

	@Test
	public void testSumWith3Numbers() {
		System.out.println("test1");
		assertEquals(10,m1.sum(new int[] {5,3,2}));
	}

	@Test
	public void testSumWith1Numbers() {
		System.out.println("test2");
		assertEquals(55,m1.sum(new int[] {5,3,2,45}));	
	}
	
	

}
