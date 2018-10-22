package com.oracle.corejava.advance.t5;

public class Test {

	public static void main(String[] args) {
		//器官移植
		
		
		new Thread() {
			public void run() {
				while(true) {
					System.out.println("a");
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					System.out.println("b");
				}
			}
		}.start();
		
			//连同声明类型到创建对象一起呵成
		Niming  n=new   Niming() {
				@Override
				public void test() {
					System.out.println("test");
				}
			};
			
			n.test();
		new Father() {
				public void ttt() {
					System.out.println("niming ttt ");
				}; 
			}.ttt();
			
			//连同声明类型到创建对象一起呵成
			new   Niming() {
				@Override
				public void test() {
					
				}
			};
		
		
			OutterClass  o=new OutterClass();
			o.other();
			OutterClass.InnerClass  i=o.new InnerClass();
			
			i.test();
			
			OutterClass.StaticInnerClass  s=new OutterClass.StaticInnerClass();
			
	}

}
