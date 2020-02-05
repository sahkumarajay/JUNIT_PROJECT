package service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		List<Object> objlist = new ArrayList<Object>();
		EMP emp = new EMP();
		emp.setId("23");
		emp.setName("ASD");
		emp.setRoll("3224");
		Object obj = emp;
		objlist.add(obj);
		
		for( Object o :objlist )
		{
			
		Field field[] = o.getClass().getDeclaredFields();	
		for (int i=0; i<field.length; i++) {
		   System.out.println();
		   field[i].setAccessible(true);
		   System.out.println(field[i].getName());
		   
		   System.out.println(field[i].get(o));
	
			
		}
		
		}
		
	}
}
