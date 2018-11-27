package com.oracle.corejava.advance.t12;

import java.util.ArrayList;

import static com.oracle.corejava.advance.t12.OtherHelperClass.*;

public class Demo {
	
	public static  void getAverageAge(int...  age) {
		
		Week  w=Week.Tuesday;
		System.out.println(w.getChineseName());
		System.out.println("可变长参数");
		float  kuodaxishu=2.3343432f;
		System.out.println(kuodaxishu);
		System.out.printf("计算出来的扩大系数=%10.2f", kuodaxishu);
		System.out.println();
	}

	public Demo() {
	}
	public static void main(String... args) {
		getAverageAge(22);
		
		
		
		int[][]  agesOfAllClass= {{23,2,3,34,32},{2234,45,4,6754,23,},{23,43,4,34,3,232}};
		for(int[] a:agesOfAllClass) {
			for(int b:a) {
				System.out.print(b+",");
			}
			System.out.println();
		}
		
		ArrayList<Integer>  nums=new ArrayList<Integer>();
		nums.add(12);
		nums.add(122);
		nums.add(1342);
		nums.add(123);
		
		for(int a:nums)
		{
			System.out.println(a);
		}
		int[] ages= {23,3,3,32,3,4323};
		for (int a:ages) {
			System.out.println(a);
		}
		
		System.out.println(test);
		doSomething();
		doSomething();
		doSomething();
		doSomething();
		doSomething();
		doSomething();
		doSomething();
		doSomething();
		doSomething();
		doSomething();
		doSomething();
		doSomething();
		doSomething();
		doSomething();
	}

}

class OtherHelperClass{
	public static String  test="asasd";
	
	
	public static void doSomething() {
		
	}
}
