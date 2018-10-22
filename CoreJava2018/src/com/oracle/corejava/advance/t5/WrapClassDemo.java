package com.oracle.corejava.advance.t5;

public class WrapClassDemo {

	public static void main(String[] args) {
		//java中对八种基本类型提供了包装类（包裹类）
		//int Integer  double Double Char Character  float Float
		
		//web servlet获取前台网页提交对参数
		String age="12";
		System.out.println(age+1);
		
		//基本类型->包装类型
		int a=10;
		Integer a_=new Integer(a);
		
		//包装类->基本类型
		Integer c=new Integer(20);
		int c_=c.intValue();
		
		//字符串->包装类
		String  d="222";
		Integer d_=new Integer(d);
		Integer d__=Integer.valueOf(d);
		
		//包装类->字符串
		Integer e=new Integer(30);
		String e_=e.toString();
		
		//字符串->基本类型
		String f="22";
		int f_=Integer.parseInt(f);
		
		//基本类型->自负床
		int  j=22;
		String j_=String.valueOf(j);
		String j__=j+"";
		
		
		
		//jdk5之后java提供了基本类型到包装类到自动转化策略（自动装箱）。包装类到基本类型到自动转化（自动拆箱）
		int aaa=111;
		Integer aaa_=aaa;
		
		Integer ccc=3333;
		int ccc_=ccc;
	}
}
