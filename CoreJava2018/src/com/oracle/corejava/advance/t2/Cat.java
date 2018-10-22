package com.oracle.corejava.advance.t2;

public class Cat extends Animal {
	
	public Cat() {
		super(3);//调用父类无参构造器
		System.out.println("Cat");
	}
	public void eat() {
		System.out.println("吃鱼");
	}
	public Cat(String a) {
		this();
		System.out.println("Parametered Constructor");
	}
	String color="black";
	public void catchMouse() {
		System.out.println(color);
		System.out.println(super.color);
	}
	public void sleep() {
		System.out.println("sleep  18 hours");
	}
}

class GaffeyCat extends Cat{
	public void eat() {
		System.out.println("千层面");
	}
	
	
}

class  BossCat extends Cat{
	public void eat() {
		System.out.println("猫粮");
	}
	public void miaomiaojiao() {
		System.out.println("我们一起学猫叫，一起喵喵喵");
	}
	
	
}

