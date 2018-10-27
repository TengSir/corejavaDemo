package com.oracle.corejava.advance.t6.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Student s1 = new Student(1001, "admin", "男", 18, 165, 180);// 22
		Student s6 = new Student(1001, "admin", "男", 18, 165, 180);// 38 20+18

		Student s2 = new Student(1002, "mike", "女", 16, 175, 98);// 38 22+16
		Student s3 = new Student(1003, "tom", "女", 36, 168, 130);// 1999
		Student s4 = new Student(1004, "rose", "女", 26, 160, 110);// 23
		Student s5 = new Student(1005, "madana", "女", 26, 170, 120);// 343

		//Treeset是自动排序的，也就是说在添加的时候他已经会把元素按照我们指定的顺序拍好，
		Set stus = new TreeSet();//
		stus.add(s1);
		stus.add(s2);
		stus.add(s3);
		stus.add(s5);
		stus.add(s4);
		stus.add(s6);
		System.out.println(stus.size());
		Iterator  it=stus.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
