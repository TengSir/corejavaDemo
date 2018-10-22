package com.oracle.corejava.advance.t3;

public class ModiferDemo {
	
	//类的成员，属性，方法，构造器，静态代码块
	
	//类中的非静态方法可以调用类中的  静态成员和非静态成员
	
	//类中的静态方法只能调用类中的静态成员
	
	//静态成员在类加载时已经载入内存，而实力成员只有在new一个对象的时候才载入内存
	
	static{
		//静态代码块，再类加载时做初始化工作的一个模块
		System.out.println("one");
	}
	
	static{
		//静态代码块，再类加载时做初始化工作的一个模块
		System.out.println("one1");
		
	}
	
	static{
		//静态代码块，再类加载时做初始化工作的一个模块
		System.out.println("one2");
		
	}
	//动态代码块，一个类可以n个动态代码块（在实力话对象的时候执行的额外的初始化结构块），比构造器先执行
	{
		System.out.println("first");
	}
	{
		System.out.println("first1");
		
	}
	
	
	public  ModiferDemo() {
		System.out.println("cons");
	}
	String name;
	int age;
	static  int a=222;//static修饰属性
	static float b;
	public static void ssss() {}
	public static void other() {//static修饰的方法叫做静态方法（类方法）
		
		System.out.println("other method");
		System.out.println(a);
		ssss();
	}
	public void ttt() {}
	public void test() {
		this.name="aa";
		System.out.println(name);
		System.out.println(a);
		other();
		ttt();
	}
	
	public static void main(String[] args) {

//		System.out.println(ModiferDemo.a);
		//static修饰的变量叫做静态变量（类变量）
		//没有加static修饰的变量叫非静态变量（实例变量）
		
		ModiferDemo  d1=new ModiferDemo();
//		ModiferDemo.other();
//		ModiferDemo  d2=new ModiferDemo();
//		
//		d1.name="test";
//		d2.name="other";
//		ModiferDemo.a=33;
//		System.out.println(ModiferDemo.a);

	}
	

}
