package com.atfuif;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class text03 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("before:  " + list.size());
		/*System.out.println("after:  " + DuplicateListDemo.dupDeal(list).size());
		list = DuplicateListDemo.dupDeal(list);
		for (Integer element : list) {
			System.out.print(element + " ");
		}*/
		for (int i = 0; i<list.size(); i++) {
			
			Set<Integer> hashset = new HashSet<Integer>();
			
			hashset.add(list.get(i));
			
			list.addAll(hashset);
			
		}
		Map ha = new HashMap<>();

		ha.put("a", 12);
	}

}
