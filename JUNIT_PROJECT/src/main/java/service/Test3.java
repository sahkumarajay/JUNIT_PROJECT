package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(11);		
		list.add(11);
		list.add(111);
		list.add(112);
		list.add(113);
		//List<Integer> uniqeList = new ArrayList<Integer>();
		//List<Integer> mulList = new ArrayList<Integer>();
		System.out.println(list);
	Collections.sort(list);
	System.out.println(list);

	Map<Integer, List<Integer>> elements = new HashMap<Integer, List<Integer>>();
	
	for(int n : list)
	{
		
		elements.put(n, null);
	}
	
	
	}

}
