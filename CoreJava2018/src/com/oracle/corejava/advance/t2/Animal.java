package com.oracle.corejava.advance.t2;
//everything is object
public abstract  class Animal {
	// Ù–‘
	public  String sex;
	public Animal() {
		
	}
	public Animal(int  a) {
	}
	 int age;
	 int weight;
	 String color="default";

	public abstract void eat();
	public void sleep() {
		System.out.println("sleep  8 hours");
		
	}
}
