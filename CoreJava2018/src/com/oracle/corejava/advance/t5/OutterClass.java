package com.oracle.corejava.advance.t5;

//��������������ͳ�֮Ϊ�ڲ���
public class OutterClass {
	static String name="ss";
	private int age=10;
	public void other() {
		InnerClass  i=new InnerClass();
		System.out.println("outter other method");
		StaticInnerClass  ii=new StaticInnerClass();
	}
	public void  methodA() {
		final   int result=22;
		
		 class LocalClass{
			private  int a;
			public void change() {
				System.out.println(result);
				System.out.println(name);
				System.out.println("method change");}
			public LocalClass() {System.out.println("cons");}
		}
		
		LocalClass  c=new LocalClass();
		c.change();
		c.a=22;
		
	}
	//�������ֶ����ֳ�Ա
	//���ԣ����������췽��������飬��̬����飬�ڲ���
	
	//ֱ�Ӷ����������棨�����Է��������ڲ��еĹ�ϵ��
	class InnerClass{
		private	int age=20;
		public void test() {
			int age=30;
			System.out.println(age);
			System.out.println(this.age);
			System.out.println(OutterClass.this.age);
			System.out.println("test method");}
		public InnerClass() {}
		{
			System.out.println("inner constructor");
		}
	}
	//����static���εĳ�Ա�ڲ�����Ǿ�̬�ڲ���
	static class StaticInnerClass{
		static int a;
		
	}

}
