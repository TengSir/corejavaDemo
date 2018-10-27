package com.oracle.corejava.advance.t6.set;

import java.util.ArrayList;
import java.util.List;

import com.oracle.corejava.advance.t2.Animal;
import com.oracle.corejava.advance.t2.Dog;
import com.oracle.corejava.advance.t6.Student;

public class Fanxing {

	public static void main(String[] args) {
		//类泛型是为了增加类设计的通用型
		Stu<Integer>  s=new Stu<Integer>();
		s.setStuid(20160906);
		Stu<String>  s11=new Stu<>();
		s11.setStuid("WD20160901");
		
		//集合使用泛型是为了更好的实现集合类型安全
		Student  s1=new Student(1001,"admin","男",18,165,180);
		Student  s2=new Student(1002,"mike","女",16,175,98);
		Student  s3=new Student(1003,"tom","女",36,168,130);
		Student  s4=new Student(1004,"rose","女",26,160,110);
		Student  s5=new Student(1005,"madana","女",26,170,120);
		Student  s6=new Student(1006,"lucy","女",26,168,88);
		System.out.println(s1.compareTo(s2));
		
		
		ArrayList<Student>  ss=new ArrayList<>();
		ss.add(s1);
		ss.add(s2);
		ss.add(s1);
		ss.add(s1);
		ss.add(s1);
		ss.add(s3);
		ss.add(s4);
		ss.add(s5);
		ss.add(s6);
		
	}

}
