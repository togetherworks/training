package com.togetherworks.junit;

import org.junit.*;
 
/**
 * JUnit TimeOut Test
 * @author mkyong
 *
 */
public class JunitTest4 {
 
	@Test(timeout = 1000)  
	public void infinity() {  
		while (true);  
	} 
	//In above example, the infinity() method will not return, so the JUnit engine will mark it as failed and throw an exception
 
}
