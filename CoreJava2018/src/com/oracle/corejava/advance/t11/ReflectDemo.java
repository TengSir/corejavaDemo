package com.oracle.corejava.advance.t11;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {

	public static void main(String[] args) {
		
		
		
		
		//两种方式获取类对象（获取类型的信息）
		//1.如果知道的雷鸣的情况（类名.class）
		Class<Teacher> c=Teacher.class;//
		
		Class<Student>  s=Student.class;//用java中的语法获取出Student这个类对象
		
		System.out.println(s.getName());//带路径的名字
		System.out.println(s.getSimpleName());
		
		System.out.println(s.getSuperclass());
		Class[] sp=s.getInterfaces();
		System.out.println("=-----");
		for(Class cc:sp) {
			System.out.println(cc.getName());
		}
		
		//解析类中的方法
		Method[]  ms=s.getDeclaredMethods();
		for(Method m:ms) {
			System.out.println(m.getName());
		}
		Method[]  mm=s.getMethods();
		System.out.println("---------");
		for(Method m:mm) {
			System.out.println(m.getName());
		}
		
		Field[]  fs=s.getDeclaredFields();
		for(Field f:fs) {
			System.out.println(f.getName());
		}
		Student  s1=new Student();
		
		
		try {
			Student ssss=s.newInstance();
			ssss.setAge(23);
			ssss.setStuname("rose");
			System.out.println(ssss.getStuname());
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		try {
			Field  gradeField=s.getDeclaredField("age");
			System.out.println(gradeField.getModifiers());
			System.out.println(gradeField.getType());
			System.out.println(gradeField);
		} catch (NoSuchFieldException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			e1.printStackTrace();
		}
		//2.如果知道一个对象的情况下，直接调用getClass方法获取该对象的类对象
		Class  s2=s1.getClass();
		
		//3.通过class类中的forname方法加载一个类并获取该类的类对象
		try {
			//Class提供一种可编程式类装载机制
			Class c2=Class.forName("com.oracle.corejava.advance.t11.MyDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
//		Student  s=new Student();//类型的一个的对象（类的对象）
//		s.setAge(12);
//		s.setStuname("jack");
		
	}

}
class Teacher{
	
}
class Student extends Teacher implements Serializable,Runnable{//class类的  类对象
	public String stuname;
	private int age;
	
	public String other;
	protected int ttt;
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public  void work() {
		System.out.println(stuname+"工作了一天");
	}
	private void eat() {}
	protected void ttt() {}
	
	
}
