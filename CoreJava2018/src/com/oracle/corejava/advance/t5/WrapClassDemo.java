package com.oracle.corejava.advance.t5;

public class WrapClassDemo {

	public static void main(String[] args) {
		//java�ж԰��ֻ��������ṩ�˰�װ�ࣨ�����ࣩ
		//int Integer  double Double Char Character  float Float
		
		//web servlet��ȡǰ̨��ҳ�ύ�Բ���
		String age="12";
		System.out.println(age+1);
		
		//��������->��װ����
		int a=10;
		Integer a_=new Integer(a);
		
		//��װ��->��������
		Integer c=new Integer(20);
		int c_=c.intValue();
		
		//�ַ���->��װ��
		String  d="222";
		Integer d_=new Integer(d);
		Integer d__=Integer.valueOf(d);
		
		//��װ��->�ַ���
		Integer e=new Integer(30);
		String e_=e.toString();
		
		//�ַ���->��������
		String f="22";
		int f_=Integer.parseInt(f);
		
		//��������->�Ը���
		int  j=22;
		String j_=String.valueOf(j);
		String j__=j+"";
		
		
		
		//jdk5֮��java�ṩ�˻������͵���װ�ൽ�Զ�ת�����ԣ��Զ�װ�䣩����װ�ൽ�������͵��Զ�ת�����Զ����䣩
		int aaa=111;
		Integer aaa_=aaa;
		
		Integer ccc=3333;
		int ccc_=ccc;
	}
}
