package com.oracle.corejava.advance.t5;

import com.oracle.corejava.advance.t2.Cat;

public class ObjectMethodDemo {

	public static void main(String[] args) {

		//Object�����������ֱ�ӻ��߼�鸸�࣬
		//�ø���û���ṩ���ԣ������ṩ��һЩ����
		//���õķ���getClass,toString,equals
		
		//1.getCalss���������ã��ǻ�ȡ�������ʵ���ͣ���instanceof��һ���������������ж��Ƿ����is-a��
		
		/*
		 * Animal  a=new Dog();
		 * Animal b=new Cat();
		 * 
		 * Sysout(a instanceof  Animal);// true
		 * Sysout(b instanceof  Animal);// true
		 * 
		 * instanceof���ԵĽ����ͬ������������������ͬһ�����͵�����
		 * 
		 * ��Ҫ��getClass������һ�����ԣ�getClass��������Ҫ��д��object����ֱ�������ã�����ֱ��ʹ��
		 * 
		 *   Sysout(a.getClass()==b.getClass());//������Ϳ��Բ���a��b�ǲ���ͬһ�ֶ�������
		 * 
		 */
		
		
		
		//equals������object����ƺõ�һ���������Ƚ϶������ݡ��Ƿ���ȵķ���
		//�û��Զ�������ͣ���������Ǹ����equals���������޷�֪��Ҫ�Ƚ���Щ�������ж��Ƿ����
		//�Զ�һ�����ͣ��������equals�������ж϶����Ƿ���ȣ�Ĭ���ж��ڴ��ַ�Ƿ����
		
		
		//���������Ҫ���Լ��������������������ݱȽϣ���ô������Ҫ���Ǹ����equals����������ʹ��eclipse�Զ����ɣ�
		Student  s1=new Student("zhuzhu", 18, "��");
		Student  s2=new Student("zhuzhu", 181, "��");
		Student s3=null;
		Cat  c=new Cat();
		
		//Compile fails;����ʧ��
		//Runtime error ����ʱ�����쳣
		System.out.println(s1.equals(s1));
		
		
		//toString�������Ƿ���һ��������ַ�����ʾ��ʽ
		//���û���ӡһ�������������ʱ��java���Զ����ö����toString����
		System.out.println(s1.toString());
		
	}

}
