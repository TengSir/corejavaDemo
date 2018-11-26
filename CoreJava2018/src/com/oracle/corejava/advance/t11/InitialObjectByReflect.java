package com.oracle.corejava.advance.t11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InitialObjectByReflect {
	
	public  static  void printAllMethodsOfObject(Object o) {
		
	}
	
	public static Object createObjectByGivenString(String className) {
	return null;
	}

	public static void main(String [] args) throws Exception{
		String ss=new String();
		printAllMethodsOfObject(ss);
		Student  s1=new Student();
		Class<Student> s=Student.class;
		
		Student stu=s.newInstance();//反射造出来的一个student 对象
		
		
		Field n=s.getDeclaredField("stuname");
		n.set(s1,"tom");
		
		Method  m=s.getDeclaredMethod("work");
		m.invoke(s1);
		
		
		
		System.out.println(s1.getAge());
	}

}
