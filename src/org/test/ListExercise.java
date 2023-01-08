package org.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

public class ListExercise {
	public static void main(String[] args) {
		System.out.println("ArrayList");
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		int s1 = l1.size();
		System.out.println(s1);
		int i1 = l1.indexOf(10);
		System.out.println(i1);
		int i2 = l1.lastIndexOf(10);
		System.out.println(i2);
		int i3 = l1.indexOf(50);
		System.out.println(i3);
		int i4 = l1.indexOf(90);
		System.out.println(i4);
		for (int i = 0; i < l1.size(); i++) {
			if (Objects.equals(l1.get(i), 10)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		int i5 = l1.indexOf(70);
		System.out.println(i5);
		Integer v1 = l1.get(2);
		System.out.println(v1);
		l1.remove(2);
		System.out.println(l1);
		l1.add(2, 50);
		System.out.println(l1);
		l1.add(70);
		System.out.println(l1);
		l1.add(8, 80);
		System.out.println(l1);
		l1.add(5, 100);
		System.out.println(l1);
		Collections.replaceAll(l1, 10, 100);
		System.out.println(l1);
		
		System.out.println();
		System.out.println("Linked List");
		List<Integer> l2=new LinkedList<>();
		l2.add(100);
		l2.add(200);
		l2.add(300);
		l2.add(400);
		l2.add(500);
		l2.add(600);
		l2.add(700);
		System.out.println(l2);
		int s2 = l2.size();
		System.out.println(s2);
		Integer v2 = l2.get(4);
		System.out.println(v2);
		l2.set(2, 350);
		System.out.println(l2);
		
		
		System.out.println();
		System.out.println("Vector");
		List<Integer> l3=new Vector<>();
		l3.add(105);
		l3.add(205);
		l3.add(305);
		l3.add(405);
		l3.add(505);
		l3.add(605);
		l3.add(705);
		l3.add(805);
		System.out.println(l3);
		int s3 = l3.size();
		System.out.println(s3);
		//Integer v3 = l3.get(8);
		//System.out.println(v3);
		for (int i = 0; i < l3.size(); i++) {
			System.out.println(l3.get(i));
		}
	}
}
