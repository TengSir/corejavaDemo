package com.oracle.corejava.advance.t2;

public class Cat extends Animal {
	
	public Cat() {
		super(3);//���ø����޲ι�����
		System.out.println("Cat");
	}
	public void eat() {
		System.out.println("����");
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
		System.out.println("ǧ����");
	}
	
	
}

class  BossCat extends Cat{
	public void eat() {
		System.out.println("è��");
	}
	public void miaomiaojiao() {
		System.out.println("����һ��ѧè�У�һ��������");
	}
	
	
}

