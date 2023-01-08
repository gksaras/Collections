package org.test;

import java.util.ArrayList;
import java.util.List;

/* 
   Collections => Interface
   => predefined interface under java.util package
   => storing multiple values of dissimilar datatype in a single refName
   => memory wastage is low due to memory allocated at runtime
   
   List=>Interface			Set=>Interface
   classes/types  			classes/types
   1.ArrayList				1.HashSet
   2.LinkedList				2.LinkedHashSet
   3.Vector					3.TreeSet
 */

public class Sample {

	public static void main(String[] args) {
		
	/*	List - predefined Interface under java.util package
		=>contains dissimilar datatypes
		=>index based one
		=>allows duplicates 
		=>prints in insertion order 
	*/
	//parent(interface)	     child(class)
		List<Object> l = new ArrayList<>();// l act as a object for ArrayList class
		l.add(10);
		l.add('@');
		l.add("greens");
		l.add(true);
		l.add(9876543201l);
		l.add(12.34f);
		System.out.println(l);
		
		// to iterate one by one
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
}
