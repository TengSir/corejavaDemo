package com.oracle.corejava.advance.t5;

public class Test {

	public static void main(String[] args) {
		//������ֲ
		
		
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
		
			//��ͬ�������͵���������һ��ǳ�
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
			
			//��ͬ�������͵���������һ��ǳ�
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
