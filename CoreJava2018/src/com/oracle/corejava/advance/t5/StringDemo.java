package com.oracle.corejava.advance.t5;

public class StringDemo {

	public static void main(String[] args) {
		
		//String�ǹ̶����ȵ��ַ��������ݲ��ɸı�
		//StringBuffer�ǿɱ䳤�ȵ��ַ������У��ṩ����һϵ�ж�����ַ������޸ĵķ���
		
		StringBuffer  s=new StringBuffer("xxx  some thing");
		s.append("tttt");
		s.delete(1, 4);
		System.out.println(s.toString());
		
		
		// TODO Auto-generated method stub
		String name="jack";
		name="s";
		String name1="Martin lusking  I  have  a dream";//
		
		String name2=new String("jack");
		String[]  names=name1.split(",");
		for(int n=0;n<names.length;n++) {
			System.out.print(names[n]+"---");
		}
		System.out.println(name1.charAt(1));
		name1="test";//String�̶������ַ���
		System.out.println(name==name1);
		System.out.println(name==name2);
		System.out.println(name.equals(name2));

		Object ages=new int[10];
		Object namsss=new String("aaa");
		
	}

}
