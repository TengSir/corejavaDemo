package com.oracle.corejava.t2;

public class DuanluDemo {

	
	public static void main(String[] args) {
		String name="tengsir";
		
		
		String sex="f";//
		int age2=33;
		int  other=10;
		
		
		System.out.println(name+age2+other);
		
		
		System.out.println(sex=="f"?((age2>18?"常年女性":"未成年女性")):"男性");
		int aaa=10;
		System.out.println((aaa++)+2);//10
		System.out.println(++aaa);
		boolean  is=false;
		
		int  age=23;
		
		if(age>10|(is=true)) {
			System.out.println("some code");
			age=20;
		}
		System.out.println(age);
		
		System.out.println(is);
	}
}
