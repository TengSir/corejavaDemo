package com.oracle.corejava.t3;

import com.oraclesdp.common.SystemIn;

public class FlowControlDemo {
	
	public static void main(String[] args) {
		int yourScore=SystemIn.nextInt();
		/*
		if(yourScore>60) {
			System.out.println("�պü���");
		}else if(yourScore>70) {
			System.out.println("��û����");
		}else if(yourScore>80) {
			System.out.println("����");
		}else if(yourScore>90) {
			System.out.println("�ҳ�����");
		}else {
			System.out.println("������");
		}*/
		
		//int  char  enum  String
		
		String  yourJob="���f�T";
		switch (yourJob) {
		
	
			case "���f�T":{
	
				System.out.println("1w");
				break;
			}
			
		
			case "����T":{
				
				System.out.println("3k");
				break;
			}
			case "˾�C":{
				
				System.out.println("5k");
				break;
			}

	
		}
	}

}
