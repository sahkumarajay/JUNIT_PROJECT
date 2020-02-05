package service;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.hamcrest.core.Is;
import org.junit.Test;

public class Exception2Test {

	@Test
	 public void  testDivisionWithException()
	{
		try {
			
			int x = 1/0;
			fail();
		} catch (Exception e) {
			  assertTrue(e.getMessage(),true);
			 
		}
			
		
	}
	
}
