package com.oracle.corejava.t2;//������������ڵİ�

import com.oracle.corejava.t3.User;
import com.oraclesdp.common.SystemIn;

//�������﷨



/**
 * javadoc  ��������˵���飨API�ĵ���
 * 
 * @author   tengsir
 * 
 * @since  jdk10.1
 * 
 * @version  2.2
 * 
 * @see  java.lang.String
 * 
 * ����һ������xx����
 *
 */

//������ʾע�͵İ���
public class Comments {
	
	
	public void test() {
		
	}
	/**
	 * ����һ��mian�������ṩ��xxx����
	 * @param args
	 */
	public static void main(String[] args) {
		//java֧����ֵ���͵ı�����ֵĬ�ϲ���ʮ���ƣ�
		//ʮ�����ƣ��˽��ƣ�1.7������
		//����ֵ
		
		int bb=0x123F;
		int bcb=0234;
		
		int ccc=0b010____1010___10_1________0;//
		System.out.println(ccc);
		System.out.println(bcb);
		System.out.println(bb);
		
		boolean  isMan=true;
		char  n='\u0041';
		char  xx='\'';
		
		float  avgScore=1.2F;
		
		System.out.println(1.2+3.5F);
		double  otherS=23.4;
		int aaa=23;
		long  num=231L;
		final int A=23;
		int b=23;
		
		String username="a";//�����������������
		
		
		String aaabbbccc="234";
		
		int asdfwerwasd=12;
		
		
		String yourName=SystemIn.nextLine();
		System.out.println(yourName);
		
		//  ��ݵ��� ctrl+shit+o
		User  u=new User();
		
		
		// ctrl+shit+/ ����ע�Ϳ�ݼ�   ȡ������ע�� ctrl+shit+\
		
		// ctrl+/   ��ݼӵ���ע�͵Ŀ�ݼ�
		
		
		// ctrl+shift+c
		
		/*
		 * ���Ƕ���ע�ͣ�
		 * 
		 * ������Կ������д����������
		 * 
		 * 
		 */
		
		
		System.out.println("some code");//��������������ݹ��ܴ���
		System.out.println("some code");
		System.out.println("some code");
		System.out.println("some code");
		System.out.println("some code");
		
		
	}

}
