package com.oracle.corejava.t4;

import java.util.Arrays;
import java.util.Random;

public class SortArray {

	// ctrl+shif+f 代码快速排版
	
	//ctrl+alt+r 快速更改变量名
	public static void main(String[] args) {
		int[] nums = new int[20];// System.out.println(ages[ages.length]);//数组越界，超出数组的下标访问元素
		for (int n = 0; n < nums.length; n++) {
			nums[n] = new Random().nextInt(1000);
		}
		
		for (int n = 0; n < nums.length; n++) {
			System.out.print(nums[n]+",");
		}
		System.out.println("---------------");
		//排序
		Arrays.sort(nums);
		for (int n = 0; n < nums.length; n++) {
			System.out.print(nums[n]+",");
		}
		
	}

}
