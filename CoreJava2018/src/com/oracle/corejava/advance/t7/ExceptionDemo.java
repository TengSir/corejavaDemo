package com.oracle.corejava.advance.t7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	
	public static  void readFIle() throws Exception {
		FileInputStream  in=new FileInputStream("C:\\1.txt");
	}
	
	public static void testA() {
		System.out.println("A");
		testB();
	}
	public static void testB() {
		System.out.println("B");
			testC();
	}
	public static void testC() {
		System.out.println("C");
		throw new NullPointerException();
	}
	
	public static  void testStringLength(String str)  throws Exception {
		readFIle();
		testA();
		
		if(str!=null) {
			System.out.println("数据连接不上");
			System.out.println(str.length());
			//throw主动生成一个异常
			throw new NullPointerException();
		}
//		System.out.println(str.length());
	}

	public static void main(String[] args)throws Exception{
		
		try {
			int  a=23;
			System.out.println("A");
			
			System.out.println(10/0);
			System.out.println("A");
//			int[]  aa= {223};
//			System.out.println(aa[1]);
			System.out.println(a);
			String  str=null;
			System.out.println(str.length());
			System.out.println("A");
		} catch(ClassCastException  e1) {
			System.out.println("aaa");
		}catch (ArithmeticException|ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();//打印堆栈异常
			System.out.println(e.getMessage());
			System.out.println("xxxx");
		}catch (Exception e) {
		}finally {
			System.out.println("必须会执行结构块，这里书写一些无论是发生异常还是没发生异常都要运行的代码");
		}
		
		
		//使用简单的异常处理机制处理我们获取输入时发生的异常
		System.out.println("请输入要选择的菜单编号：1，2，3");
		Scanner  ss=new Scanner(System.in);
		

		while(true) {
			try {
				int menuNo=ss.nextInt();
				System.out.println(menuNo);
				break;
			}catch (InputMismatchException e) {
				System.out.println("输入类型不正确!");
				ss=new Scanner(System.in);
				continue;
			}
		}
		
		
//		
//		//NullpointerException，当你试图调用一个为null当对象当属性或者方法时，使用对象本身无异常当
//		String name=null;
//		testStringLength(name);
//		
//		int[] ages= {23,3,43,2,3};
//		int index=5;
//		if(index>=ages.length||index<0) {
//			System.out.println("不能去数据");
//		}else {
//		System.out.println(ages[index]);
//		}
//		
//		
//		//编码强度不够（程序度的健壮度不够）
//		Scanner  s=new Scanner(System.in);
//		int yourInputNum=s.nextInt();
//		
//		if(yourInputNum==0) {
//			System.out.println("出书不能为零");
//		}else {
//		System.out.println(10/yourInputNum);
//		}
//		
//		System.out.println("some code");
//		System.out.println("some code");
//		System.out.println("some code");
//		System.out.println("some code");
//		System.out.println("some code");
//		System.out.println("some code");
//		System.out.println("some code");
//		System.out.println("some code");
//		System.out.println("some code");
	}
}


class A{
	void test()  throws ArithmeticException{
		
	}
}
class B extends A{
	@Override
	protected void test() throws ArithmeticException {
	}
}