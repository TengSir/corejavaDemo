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
			System.out.println("�������Ӳ���");
			System.out.println(str.length());
			//throw��������һ���쳣
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
			e.printStackTrace();//��ӡ��ջ�쳣
			System.out.println(e.getMessage());
			System.out.println("xxxx");
		}catch (Exception e) {
		}finally {
			System.out.println("�����ִ�нṹ�飬������дһЩ�����Ƿ����쳣����û�����쳣��Ҫ���еĴ���");
		}
		
		
		//ʹ�ü򵥵��쳣������ƴ������ǻ�ȡ����ʱ�������쳣
		System.out.println("������Ҫѡ��Ĳ˵���ţ�1��2��3");
		Scanner  ss=new Scanner(System.in);
		

		while(true) {
			try {
				int menuNo=ss.nextInt();
				System.out.println(menuNo);
				break;
			}catch (InputMismatchException e) {
				System.out.println("�������Ͳ���ȷ!");
				ss=new Scanner(System.in);
				continue;
			}
		}
		
		
//		
//		//NullpointerException��������ͼ����һ��Ϊnull���������Ի��߷���ʱ��ʹ�ö��������쳣��
//		String name=null;
//		testStringLength(name);
//		
//		int[] ages= {23,3,43,2,3};
//		int index=5;
//		if(index>=ages.length||index<0) {
//			System.out.println("����ȥ����");
//		}else {
//		System.out.println(ages[index]);
//		}
//		
//		
//		//����ǿ�Ȳ���������ȵĽ�׳�Ȳ�����
//		Scanner  s=new Scanner(System.in);
//		int yourInputNum=s.nextInt();
//		
//		if(yourInputNum==0) {
//			System.out.println("���鲻��Ϊ��");
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