package com.oracle.corejava.advance.t3;

public class AbstractDemo {

	public static void main(String[] args) {
		//abstract修饰的类叫做抽象类，抽象类中不一定要有抽象方法
		//使用abstract修饰的方法叫做抽象方法，抽象方法只能位于抽象类中，
		//非抽象类继承了抽象父类，则必须实现抽象父类中所有的抽象方法
		//抽象类的成员：属性，方法（包括抽象方法），构造器，
		TrafficTool  t=new Car();
	}
}

abstract class TrafficTool{
	public void test() {}
	public abstract void ttt() ;
}
class   Car  extends TrafficTool{

	@Override
	public void ttt() {
		System.out.println("实现");
	}
}
