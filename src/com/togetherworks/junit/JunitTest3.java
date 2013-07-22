package com.togetherworks.junit;

import org.junit.*;

/**
 * JUnit Ignore Test
 * @author mkyong
 *This ¡°Ignored¡± means the method is not ready to test, the JUnit engine will just bypass this method.
 */
public class JunitTest3 {
 
	@Ignore("Not Ready to Run")  
	@Test
	public void divisionWithException() {  
	  System.out.println("Method is not ready yet");
	}  
 
}
