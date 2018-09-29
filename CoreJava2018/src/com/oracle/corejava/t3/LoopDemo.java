package com.oracle.corejava.t3;

import com.oraclesdp.common.SystemIn;

public class LoopDemo {

	
	public static void main(String[] args) {
		int  yourNum=SystemIn.nextInt();
		System.out.println(yourNum);
		int sum=0;
		A: for(int n=0;n<=100;n++) {
			sum+=n;
			B:for(int m=0;m<20;m++) {
				sum+=n*m;
				if(sum>3000)
				break A;
			}
			
		}
		
		
		System.out.println(sum);
//		boolean  result=true;
//		while(result) {
//			System.out.println("hello world");
//		}
//		
//		int age=23;
	}
}
