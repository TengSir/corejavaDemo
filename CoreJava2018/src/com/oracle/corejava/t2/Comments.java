package com.oracle.corejava.t2;//声明这个类所在的包

import com.oracle.corejava.t3.User;
import com.oraclesdp.common.SystemIn;

//导包的语法



/**
 * javadoc  后期生成说明书（API文档）
 * 
 * @author   tengsir
 * 
 * @since  jdk10.1
 * 
 * @version  2.2
 * 
 * @see  java.lang.String
 * 
 * 这是一个描述xx的类
 *
 */

//这是演示注释的案例
public class Comments {
	
	
	public void test() {
		
	}
	/**
	 * 这是一个mian方法，提供了xxx功能
	 * @param args
	 */
	public static void main(String[] args) {
		//java支持数值类型的变量赋值默认采用十进制，
		//十六进制，八进制，1.7二进制
		//字面值
		
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
		
		String username="a";//望文生义的命名策略
		
		
		String aaabbbccc="234";
		
		int asdfwerwasd=12;
		
		
		String yourName=SystemIn.nextLine();
		System.out.println(yourName);
		
		//  快捷导包 ctrl+shit+o
		User  u=new User();
		
		
		// ctrl+shit+/ 多行注释快捷键   取消多行注释 ctrl+shit+\
		
		// ctrl+/   快捷加单行注释的快捷键
		
		
		// ctrl+shift+c
		
		/*
		 * 这是多行注释，
		 * 
		 * 里面可以跨多行书写解释性文字
		 * 
		 * 
		 */
		
		
		System.out.println("some code");//这是完成链接数据功能代码
		System.out.println("some code");
		System.out.println("some code");
		System.out.println("some code");
		System.out.println("some code");
		
		
	}

}
