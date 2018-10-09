package com.oracle.corejava.advance.t1;

public class ConstructorDemo {
	String name;
	int age=23;
	public static void main(String[] args) {
		//构造方法也叫做构造器
		//在累里面如果又一个方法名和类名完全一样，同时该方法没有返回值类型， 则这个方法称之为构造方法
		//构造方法就是创建（构造）对象时调用的方法
		//如果用户书写的类没有提供任何构造方法，则java虚拟机在类编译的时候自动为用户提供一个无参数的构造方法,如果你定义了一个构造器，则不提供任何构造器
		
		//构造器的意义：在于初始化的之后给对象的属性赋值
		ConstructorDemo  c=new ConstructorDemo(20);
		c.name="ss";
				c.age=222;
//				Product  p=new Product("花绿水", 9.9f, "six god", "绿色", "", "2018-12-12", "");
//				System.out.println(p.name);
				Product  p=new Product("无线鼠标", 99.9f, "Logic");
				System.out.println(p.size);
	}
	public  ConstructorDemo(int a) {
		System.out.println(age);
		//这个就是一个构造方法
		System.out.println("这里是构造方法");
	}
	public ConstructorDemo(String a) {
		
	}
}
