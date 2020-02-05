package service;

import java.util.ArrayList;
import org.junit.Test;
public class Exception1Test {
	
	@Test(expected = ArithmeticException.class)
	public void testArithmeticException()
	{
		 
		int x = 12 / 0;
		
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testList()
	{
		new  ArrayList<Integer>().get(0);
		
		
	}
	
}
