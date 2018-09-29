package com.oracle.corejava.t3;

import com.oraclesdp.common.SystemIn;

public class FlowControlDemo {
	
	public static void main(String[] args) {
		int yourScore=SystemIn.nextInt();
		/*
		if(yourScore>60) {
			System.out.println("刚好及格");
		}else if(yourScore>70) {
			System.out.println("还没有修");
		}else if(yourScore>80) {
			System.out.println("优秀");
		}else if(yourScore>90) {
			System.out.println("灰常优秀");
		}else {
			System.out.println("很厉害");
		}*/
		
		//int  char  enum  String
		
		String  yourJob="快遞員";
		switch (yourJob) {
		
	
			case "快遞員":{
	
				System.out.println("1w");
				break;
			}
			
		
			case "程序員":{
				
				System.out.println("3k");
				break;
			}
			case "司機":{
				
				System.out.println("5k");
				break;
			}

	
		}
	}

}
