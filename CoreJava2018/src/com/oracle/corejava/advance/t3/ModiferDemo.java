package com.oracle.corejava.advance.t3;

public class ModiferDemo {
	
	//��ĳ�Ա�����ԣ�����������������̬�����
	
	//���еķǾ�̬�������Ե������е�  ��̬��Ա�ͷǾ�̬��Ա
	
	//���еľ�̬����ֻ�ܵ������еľ�̬��Ա
	
	//��̬��Ա�������ʱ�Ѿ������ڴ棬��ʵ����Աֻ����newһ�������ʱ��������ڴ�
	
	static{
		//��̬����飬�������ʱ����ʼ��������һ��ģ��
		System.out.println("one");
	}
	
	static{
		//��̬����飬�������ʱ����ʼ��������һ��ģ��
		System.out.println("one1");
		
	}
	
	static{
		//��̬����飬�������ʱ����ʼ��������һ��ģ��
		System.out.println("one2");
		
	}
	//��̬����飬һ�������n����̬����飨��ʵ���������ʱ��ִ�еĶ���ĳ�ʼ���ṹ�飩���ȹ�������ִ��
	{
		System.out.println("first");
	}
	{
		System.out.println("first1");
		
	}
	
	
	public  ModiferDemo() {
		System.out.println("cons");
	}
	String name;
	int age;
	static  int a=222;//static��������
	static float b;
	public static void ssss() {}
	public static void other() {//static���εķ���������̬�������෽����
		
		System.out.println("other method");
		System.out.println(a);
		ssss();
	}
	public void ttt() {}
	public void test() {
		this.name="aa";
		System.out.println(name);
		System.out.println(a);
		other();
		ttt();
	}
	
	public static void main(String[] args) {

//		System.out.println(ModiferDemo.a);
		//static���εı���������̬�������������
		//û�м�static���εı����зǾ�̬������ʵ��������
		
		ModiferDemo  d1=new ModiferDemo();
//		ModiferDemo.other();
//		ModiferDemo  d2=new ModiferDemo();
//		
//		d1.name="test";
//		d2.name="other";
//		ModiferDemo.a=33;
//		System.out.println(ModiferDemo.a);

	}
	

}
