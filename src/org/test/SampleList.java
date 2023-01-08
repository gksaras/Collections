package org.test;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
//import java.util.Vector;

//List => Index based one,allows duplicates
public class SampleList {
	
	public static void main(String[] args) {
	
		List<Integer> l1=new ArrayList<>();
		//List<Integer> l2=new ArrayList<>();
		//List<Integer> l=new LinkedList<>();
		//List<Integer> v=new Vector<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(20);
		l1.add(10);
		//l2.addAll(l1);
		//System.out.println(l2);
		//l2.add(60);
		//l2.add(70);
		//System.out.println(l2);
		//To print common values from the lists
		//l2.retainAll(l1);
		//System.out.println(l2);
		//To remove common values from the lists
		//l2.removeAll(l1);
		//System.out.println(l2);
		//To replace all occurences of a specific number with new number
		Collections.replaceAll(l1, 10, 100);
		System.out.println(l1);
		
		l1.set(1, 60);
		System.out.println(l1);
		
		List<Integer> indices=new ArrayList<>();
		//To Find all occurences of 100 => index values
		for (int i = 0; i < l1.size(); i++) {
			if(Objects.equals(l1.get(i), 100))
				indices.add(i);
		}
		System.out.println(indices);
		//adding values in particular index
		l1.add(2, 50);
		System.out.println(l1);
		
		l1.set(6, 60);
		System.out.println(l1);
	}
}
