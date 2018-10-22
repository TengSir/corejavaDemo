package com.oracle.corejava.advance.t5;

//放在类里面的类型称之为内部类
public class OutterClass {
	static String name="ss";
	private int age=10;
	public void other() {
		InnerClass  i=new InnerClass();
		System.out.println("outter other method");
		StaticInnerClass  ii=new StaticInnerClass();
	}
	public void  methodA() {
		final   int result=22;
		
		 class LocalClass{
			private  int a;
			public void change() {
				System.out.println(result);
				System.out.println(name);
				System.out.println("method change");}
			public LocalClass() {System.out.println("cons");}
		}
		
		LocalClass  c=new LocalClass();
		c.change();
		c.a=22;
		
	}
	//类里面又多少种成员
	//属性，方法，构造方法，代码块，动态代码块，内部类
	
	//直接定义在类里面（和属性方法，属于并行的关系）
	class InnerClass{
		private	int age=20;
		public void test() {
			int age=30;
			System.out.println(age);
			System.out.println(this.age);
			System.out.println(OutterClass.this.age);
			System.out.println("test method");}
		public InnerClass() {}
		{
			System.out.println("inner constructor");
		}
	}
	//加了static修饰的成员内部类就是静态内部类
	static class StaticInnerClass{
		static int a;
		
	}

}
