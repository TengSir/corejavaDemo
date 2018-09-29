package com.oracle.corejava.t4;

public class TwoWayDemo {

	public static void main(String[] args) {
		
		int[][]  allAges=new int [10][20];
		allAges[0][0]=22;
		
//		for(int n=0;n<allAges.length;n++) {
//			for(int m=0;m<allAges[n].length;m++) {
//				System.out.println("请输入第"+(n+1)+"个班级里面第第"+(m+1)+"个学员的年龄:");
//				int  ages=SystemIn.nextInt();
//				
//				allAges[n][m]=ages;
//			}
//		}
		
		int[][]  aaa=new int[5][] ;
		aaa[0]=new int[10];//给这个二维数组的第一个元素赋值（分配空间）
		aaa[1]=new int[23];
		aaa[2]=new int[3];
		aaa[3]=new int[13];
		aaa[4]=new int[53];
		
		aaa[0][0]=22;
		
		int all=0;
		
		for(int n=0;n<aaa.length;n++) {
			all+=aaa[n].length;
		}
		System.out.println(all);
		aaa[1][0]=23;
		
		
	}
}
