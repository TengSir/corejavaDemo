package com.oracle.corejava.t4;

import java.util.Arrays;
import java.util.Random;

public class SortArray {

	// ctrl+shif+f ��������Ű�
	
	//ctrl+alt+r ���ٸ��ı�����
	public static void main(String[] args) {
		int[] nums = new int[20];// System.out.println(ages[ages.length]);//����Խ�磬����������±����Ԫ��
		for (int n = 0; n < nums.length; n++) {
			nums[n] = new Random().nextInt(1000);
		}
		
		for (int n = 0; n < nums.length; n++) {
			System.out.print(nums[n]+",");
		}
		System.out.println("---------------");
		//����
		Arrays.sort(nums);
		for (int n = 0; n < nums.length; n++) {
			System.out.print(nums[n]+",");
		}
		
	}

}
