package com.oracle.corejava.advance.t3;

public class FInalDemo {
	final  int aaa;
	 final public static  float XS=4.342342f;
	public  FInalDemo(int a) {
		aaa=a;
	}

	static public   void main(String[] args) {
		System.out.println(Math.PI);
		// TODO Auto-generated method stub
		
		//final修饰的变量叫做常量（可以被赋值一次，然后之后永远不能被改变）
		
		//final修饰的方法不可以被重写
		
		//final修饰的类不能被继承

		//一般来说定义常量都是public  static final   常量名一般全大写
		final  int a=11;
	}

}

 class  AC{
	public void a() {}
	public  void b() {}
}
class BC extends AC{
	public void a() {}
	public void b() {}
	
}
