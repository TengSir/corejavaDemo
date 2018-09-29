package com.oracle.corejava.t2;

public class ArithmeticDemo {
	
	
	int age;//成员变量

	
	public static void main(String[] args) {
		
		int aaaa=23;
		int bbbb=34;
		
		
		System.out.println(aaaa&bbbb);//位运算
		boolean  is=false;
		boolean  aa=true;
		System.out.println(is&aa);//逻辑运算符
		
		int  xxxx=-123434;
		System.out.println(xxxx>>>2);
		
		int num=10;
		
		num*=2;
		
		num=num*2;
		
		num/=2;
		num=num/2;
		
		System.out.println(num>>1);
		System.out.println(num/3);
		System.out.println(num%3);
		
		float  sssss=2.6f;
		System.out.println(sssss/3);
		
		
		
		
		
		byte  a=12;//局部变量
		short b=23;
		
		int c=a+b;
		
		int bbb=23;
		
		int d=bbb+c;
		
		float  ccc=23.4f;
		
		double cccd=23.34;
		double ccce=cccd+ccc;
		
		
		int  h=23;
		long  j=234242342L;//自动提升
		
		//强制类型转化仅仅适用于基本类型
		
		int  k=(int)j;//强制类型转化(会有一定的风险)
		System.out.println(k);
		
	}
	
	
	
	
	
	
	
	public void test(int  a) {
		int age1=23;
		int age2=34;
		System.out.println(age1>age2);//false 比较运算符返回的的boolean值
		char c;
		
		c='2';
		
		System.out.println(c);
		
		System.out.println(a);
		//局部变量，仅仅局限于这个方法中(局限于他所在的大括号，代码块里面)
		int someData=234;
		
		//自定义代码块
		{
			int ccc=2345;
			System.out.println("some code");
			System.out.println(someData);
			{
				System.out.println(ccc);
			}
		}
		
		{
			int ccc=333;
			System.out.println(ccc);
		}		
		
		System.out.println(someData);
		
		
	}
	
	
	
	
	
	
	
	
	
}
