package com.oracle.corejava.advance.t11;

public class MyDriver {

	public MyDriver() {
		System.out.println("构造器");
		// TODO Auto-generated constructor stub
	}
	
	static{
		System.out.println("该类被加载了");
	}
	
	{
		System.out.println("dynamic  code");
	}
	
	

}
