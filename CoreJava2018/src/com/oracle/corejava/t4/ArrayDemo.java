package com.oracle.corejava.t4;

import java.util.Random;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] aaa= {1,2,3};
		int[] bbb=aaa;//aaa赋值给bbb数组
		bbb[0]=12;
		System.out.println(aaa[0]);
		
		
		//数组的初始化语法
		
		int[]  scores=new int[10];//数组的初始化
		
		int[]  scores1= {12,23,3,2,23};//适合已经指导要存储到数组中数据的情况下
		
		int[]  socres2=new int[] {2,34,2,3,4,43};//和上面的类似
		
		int[] ages=new int[31];
		
		ages[0]=12;
//		System.out.println(ages[ages.length]);//数组越界，超出数组的下标访问元素
		
		for(int  n=0;n<ages.length;n++) {
			ages[n]=new Random().nextInt(6)+18;
		}
		
		printArray(ages); 

	}
	
	public static void printArray(int[] ages) {
		for(int a:ages) {
			System.out.print(a+",");
		}
	}

}
