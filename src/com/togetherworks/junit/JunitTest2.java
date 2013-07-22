package com.togetherworks.junit;

import org.junit.*;
 
/**
 * JUnit Expected Exception Test
 * @author mkyong
 *
 */
public class JunitTest2 {
 
	@Test(expected = ArithmeticException.class)  
	public void divisionWithException() {  
	  int i = 1/0;
	} 
	//In above example, the divisionWithException() method will throw an ArithmeticException Exception, since this is an expected exception, so the unit test will pass.
 
}
