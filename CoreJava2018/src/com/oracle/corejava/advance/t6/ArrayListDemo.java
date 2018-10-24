package com.oracle.corejava.advance.t6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		String name1="冯金柱";
		String name2="张欢";
		String name3="任志浩";
		String name4="赵让学";
		String name5="吴旭";
		
		List  names=new ArrayList();
		names.add(name1);
		names.add(name2);
		names.add(name3);
		names.add(name4);
		names.add(name5);
		
		for(int n=0;n<names.size();n++) {
			System.out.print(names.get(n)+",");
		}
		System.out.println();
		Collections.sort(names);//调用集合的帮助了执行排序
		for(int n=0;n<names.size();n++) {
			System.out.print(names.get(n)+",");
		}
		System.out.println();
//		names.remove(1);
//		names.remove(name2);
//		names.get(1);
		System.out.println(names.indexOf(name1));
		System.out.println(names.contains("aaaa"));
		System.out.println(names.size());
		System.out.println(names.isEmpty());
		
		
		Student  s1=new Student(1001,"张无忌","男",18);
		Student  s2=new Student(1002,"梅超风","女",16);
		Student  s3=new Student(1003,"梅风","女",16);
		Student  s4=new Student(1004,"梅超","女",16);
		
		ArrayList  ss=new ArrayList();
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		
		
		//1.使用for循环遍历（迭代）
		for(int n=0;n<ss.size();n++) {
			System.out.println(ss.get(n));
		}
		
		//2.使用foreach jdk5提供的新语法（增强性for循环）
		
		//3.使用java集合中提供的迭代器类型
		Iterator  it=ss.iterator();//所有集合都可以调用iterator方法转换成迭代器对象
		while(it.hasNext()) {
			Student  s=(Student)it.next();
			System.out.print(s.getStuname()+",");
			System.out.println(s.getStuage());
		}
		
		s1.setStuname("张全蛋");
		System.out.println(ss.size());
		System.out.println(((Student)ss.get(0)).getStuname());//张全蛋
		
	}

}
