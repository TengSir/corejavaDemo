package com.oracle.corejava.t4;

import java.util.Random;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] aaa= {1,2,3};
		int[] bbb=aaa;//aaa��ֵ��bbb����
		bbb[0]=12;
		System.out.println(aaa[0]);
		
		
		//����ĳ�ʼ���﷨
		
		int[]  scores=new int[10];//����ĳ�ʼ��
		
		int[]  scores1= {12,23,3,2,23};//�ʺ��Ѿ�ָ��Ҫ�洢�����������ݵ������
		
		int[]  socres2=new int[] {2,34,2,3,4,43};//�����������
		
		int[] ages=new int[31];
		
		ages[0]=12;
//		System.out.println(ages[ages.length]);//����Խ�磬����������±����Ԫ��
		
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
