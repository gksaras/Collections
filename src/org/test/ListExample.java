package org.test;

import java.util.ArrayList;
import java.util.List;
//ArrayList Example
public class ListExample {
	public static void main(String[] args) {
	//Interface <generics> refName = new Class<generics>();
	List<Integer> l=new ArrayList<>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.add(10);
	System.out.println(l);
	int s = l.size();
	System.out.println(s);
	
	Object a = l.get(3);
	System.out.println(a);
	
	l.add(2,15); // add value to particular position
	
	l.set(2, 60); //replace the particular value
	System.out.println(l);

	l.remove(5); 
	System.out.println(l);
	
	int x = l.indexOf(10);
	System.out.println(x);
	
	int y = l.lastIndexOf(10);
	System.out.println(y);
	
	boolean empty = l.isEmpty();
	System.out.println(empty);
	
	boolean contains = l.contains(20);
	System.out.println(contains);
	
	l.clear();
	System.out.println(l);
	
	List<Integer> l1=new ArrayList<>();
	l1.add(10);
	l1.add(11);
	l1.add(12);
	l1.add(13);
	l1.add(14);
	l1.add(15);
	System.out.println(l1);
	
	List<Integer> l2=new ArrayList<>();
	l2.addAll(l1);
	System.out.println(l2);
	l2.add(16);
	l2.add(17);
	l2.add(18);
	l2.add(19);
	l2.add(20);
	System.out.println(l2);
	
	l2.retainAll(l1);
	System.out.println(l2);
	
	l2.removeAll(l1);
	System.out.println(l2);
	
	System.out.println("For Loop");
	for (int i = 0; i < l.size(); i++) {
		System.out.println(l.get(i));
	}
	
	System.out.println("For each loop");
	for (Integer i : l) {
		System.out.println(i);
	}
	}
}