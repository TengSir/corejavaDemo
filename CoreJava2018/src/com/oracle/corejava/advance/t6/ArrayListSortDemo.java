package com.oracle.corejava.advance.t6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSortDemo {
	public static void main(String[] args) {
		Student  s1=new Student(1001,"admin","��",18,165,180);
		Student  s2=new Student(1002,"mike","Ů",16,175,98);
		Student  s3=new Student(1003,"tom","Ů",36,168,130);
		Student  s4=new Student(1004,"rose","Ů",26,160,110);
		Student  s5=new Student(1005,"madana","Ů",26,170,120);
		Student  s6=new Student(1006,"lucy","Ů",26,168,88);
		
		System.out.println(s1.compareTo(s2));
		
		ArrayList  ss=new ArrayList();
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		ss.add(s5);
		ss.add(s6);
		//1.ʹ��forѭ��������������
				for(int n=0;n<ss.size();n++) {
					System.out.println(ss.get(n));
				}
		
				System.out.println("----------");
		
		Collections.sort(ss,new WeightSorter());
		
		//1.ʹ��forѭ��������������
		for(int n=0;n<ss.size();n++) {
			System.out.println(ss.get(n));
		}
		
		//2.�����������
		
		//3.������������
	}

}
