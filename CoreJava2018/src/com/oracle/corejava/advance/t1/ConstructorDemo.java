package com.oracle.corejava.advance.t1;

public class ConstructorDemo {
	String name;
	int age=23;
	public static void main(String[] args) {
		//���췽��Ҳ����������
		//�������������һ����������������ȫһ����ͬʱ�÷���û�з���ֵ���ͣ� �����������֮Ϊ���췽��
		//���췽�����Ǵ��������죩����ʱ���õķ���
		//����û���д����û���ṩ�κι��췽������java�������������ʱ���Զ�Ϊ�û��ṩһ���޲����Ĺ��췽��,����㶨����һ�������������ṩ�κι�����
		
		//�����������壺���ڳ�ʼ����֮�����������Ը�ֵ
		ConstructorDemo  c=new ConstructorDemo(20);
		c.name="ss";
				c.age=222;
//				Product  p=new Product("����ˮ", 9.9f, "six god", "��ɫ", "", "2018-12-12", "");
//				System.out.println(p.name);
				Product  p=new Product("�������", 99.9f, "Logic");
				System.out.println(p.size);
	}
	public  ConstructorDemo(int a) {
		System.out.println(age);
		//�������һ�����췽��
		System.out.println("�����ǹ��췽��");
	}
	public ConstructorDemo(String a) {
		
	}
}
