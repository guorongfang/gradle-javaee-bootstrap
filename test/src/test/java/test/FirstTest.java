package test;

import org.testng.annotations.Test;
import static org.junit.Assert.assertTrue;

public class FirstTest {
	@Test
	public void testMethod() {
		System.out.println("First testNG test");	  	  
		assertTrue(true); 
	}
}
