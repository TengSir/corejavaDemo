package com.oracle.corejava.advance.t6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		String name1="�����";
		String name2="�Ż�";
		String name3="��־��";
		String name4="����ѧ";
		String name5="����";
		
		List  names=new ArrayList();
		names.add(name1);
		names.add(name2);
		names.add(name3);
		names.add(name4);
		names.add(name5);
		
		for(int n=0;n<names.size();n++) {
			System.out.print(names.get(n)+",");
		}
		System.out.println();
		Collections.sort(names);//���ü��ϵİ�����ִ������
		for(int n=0;n<names.size();n++) {
			System.out.print(names.get(n)+",");
		}
		System.out.println();
//		names.remove(1);
//		names.remove(name2);
//		names.get(1);
		System.out.println(names.indexOf(name1));
		System.out.println(names.contains("aaaa"));
		System.out.println(names.size());
		System.out.println(names.isEmpty());
		
		
		Student  s1=new Student(1001,"���޼�","��",18);
		Student  s2=new Student(1002,"÷����","Ů",16);
		Student  s3=new Student(1003,"÷��","Ů",16);
		Student  s4=new Student(1004,"÷��","Ů",16);
		
		ArrayList  ss=new ArrayList();
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		
		
		//1.ʹ��forѭ��������������
		for(int n=0;n<ss.size();n++) {
			System.out.println(ss.get(n));
		}
		
		//2.ʹ��foreach jdk5�ṩ�����﷨����ǿ��forѭ����
		
		//3.ʹ��java�������ṩ�ĵ���������
		Iterator  it=ss.iterator();//���м��϶����Ե���iterator����ת���ɵ���������
		while(it.hasNext()) {
			Student  s=(Student)it.next();
			System.out.print(s.getStuname()+",");
			System.out.println(s.getStuage());
		}
		
		s1.setStuname("��ȫ��");
		System.out.println(ss.size());
		System.out.println(((Student)ss.get(0)).getStuname());//��ȫ��
		
	}

}
