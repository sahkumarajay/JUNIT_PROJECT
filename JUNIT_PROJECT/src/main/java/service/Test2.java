package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {

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
		Collections.sort(list);
		List<Integer> tempList = new ArrayList<Integer>(list);

		List<Integer> uniqeList = new ArrayList<Integer>();
		List<Integer> mulList = new ArrayList<Integer>();
		System.out.println(list);
		System.out.println(tempList);

		for (int i : tempList) {
			if (Collections.frequency(list, i) > 1) {
				mulList.add(i);
			} else {
				uniqeList.add(i);
			}

		}
		System.out.println(uniqeList);
		System.out.println(mulList);

	}

}
