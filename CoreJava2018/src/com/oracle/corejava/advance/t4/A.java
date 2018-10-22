package com.oracle.corejava.advance.t4;

public interface A {
	//接口里面只有常量和抽象方法
	
	//接口和类的关系，只有一种关系，就是类实现（implements）接口,一个类可以实现多个接口
	
	//接口和接口之间可以支持继承，接口之间是多继承的
	
	
	//一个类可以继承父类的同时又实现多个接口
	int a=2;//是的（public  static final ）

	public   void test() ;//接口里面的方法可以不书写abstract关键字
}
interface BC extends A{
	public void  ttt() ;
}

interface  D{
	public void  ttt() ;
}
interface E extends D,A{
	
}
class Father{}

class Child extends Father  implements BC,D{

	@Override
	public void test() {
	}
	@Override
	public void ttt() {
	}
	
}
