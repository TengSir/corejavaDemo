package com.oracle.corejava.t5;

public class FunctionDemo {
	public static void  methodA() {
		System.out.println("methodA");
		methodA();
	}
	public static void  methodB() {
		System.out.println("methodB");
		methodC();
	}
	public static void  methodC() {
		System.out.println("methodC");
		methodA();
	}
	//ctrl+alt+m 将一段代码抽象成一个对立的方法
	
	//快速拷贝行ctrl +alt+下尖头  
	
	//快速删除行 ctrl+d
	public static void main(String[] args) {
		//求阶乘  n!=n*(n-1)*(n-2)*....*1
		
		int result=getJiecheng(4);
		System.out.println(result);
		
//		methodA();
//		int[] ages= {23,3,43,234};
//		int result=getAvgAgeOfClass(ages);
//		System.out.println(result);
//		int  a=11;//函数调用时传入的参数称之为实参
//		printStar(a);
	}

	/**
	 * 打印一行十列的星星的功能
	 */
	public static void printStar() {
		for(int n=0;n<10;n++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
	/**
	 * 根据调用者传入的数量来打印对应数量的星星
	 * @param count
	 */
	public static  void  printStar(int count) {//函数声明括号里定义的参数称之为形参
		for(int n=0;n<count;n++) {
			System.out.print("*");
			if(n==50) {
				return ;//函数立马停了
			}
		}
		System.out.println();
	}
	/**
	 * return 关键字，在有返回值的方法里，他的作用是返回一个结果
	 * 在没有返回值（void）的方法中，它的作用是终止方法
	 * @param ages
	 * @return
	 */
	public static  int  getAvgAgeOfClass(int[] ages) {
		int sum=0;
		for(int n=0;n<ages.length;n++) {
			sum+=ages[n];
		}
		int avgAge=sum/ages.length;
			  return avgAge;
		
	}
	
	
	
	public static int getJiecheng(int num) {
		if(num==1) {
			return 1;
		}else {
			return num*getJiecheng(num-1);
		}
	}

}
