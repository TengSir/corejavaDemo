package com.oracle.corejava.t4;

public class Transfer {

	public static void main(String[] args) {
		//java��ֵ���ݺ�ַ���ݣ���ֵ��
		
		//java�����л������͵����鸳ֵ����ֵ����
		int  a=22;//int byte short lang  float double char boolean 
		changeData(a);
		System.out.println(a);
	
		//java�����е��������ͣ���������/������/�������ͣ��ĸ�ֵ����ַ����
		
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
