package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalcTest {

	@Test
	public void testSum()
	{
		MyCalc calc = new MyCalc();
		assertEquals(30,calc.sum(20,10));
	}
	@Test
	public void testDiff()
	{
		MyCalc calc = new MyCalc();
		assertEquals(10,calc.diff(20,10));
	}
	@Test
	public void testMul()
	{
		MyCalc calc = new MyCalc();
		assertEquals(200,calc.mul(20,10));
	}
	
}