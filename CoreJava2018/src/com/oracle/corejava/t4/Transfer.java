package com.oracle.corejava.t4;

public class Transfer {

	public static void main(String[] args) {
		//java中值传递和址传递（赋值）
		
		//java中所有基本类型的数组赋值都是值传递
		int  a=22;//int byte short lang  float double char boolean 
		changeData(a);
		System.out.println(a);
	
		//java中所有的引用类型（复合类型/类类型/对象类型）的赋值都是址传递
		
		int[] ages= {1,2,2,4};
		changeDataOfarray(ages);
		System.out.println(ages[0]);//33
		
		
	}
	
	public  static  void  changeData(int age) {
		System.out.println("some code");
		age=23;
	}
	
	public static void  changeDataOfarray(int[] ages) {
		System.out.println("other code");
		ages[0]=33;
	}

}
