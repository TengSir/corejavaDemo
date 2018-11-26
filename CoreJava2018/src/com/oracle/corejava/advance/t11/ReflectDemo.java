package com.oracle.corejava.advance.t11;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {

	public static void main(String[] args) {
		
		
		
		
		//���ַ�ʽ��ȡ����󣨻�ȡ���͵���Ϣ��
		//1.���֪�������������������.class��
		Class<Teacher> c=Teacher.class;//
		
		Class<Student>  s=Student.class;//��java�е��﷨��ȡ��Student��������
		
		System.out.println(s.getName());//��·��������
		System.out.println(s.getSimpleName());
		
		System.out.println(s.getSuperclass());
		Class[] sp=s.getInterfaces();
		System.out.println("=-----");
		for(Class cc:sp) {
			System.out.println(cc.getName());
		}
		
		//�������еķ���
		Method[]  ms=s.getDeclaredMethods();
		for(Method m:ms) {
			System.out.println(m.getName());
		}
		Method[]  mm=s.getMethods();
		System.out.println("---------");
		for(Method m:mm) {
			System.out.println(m.getName());
		}
		
		Field[]  fs=s.getDeclaredFields();
		for(Field f:fs) {
			System.out.println(f.getName());
		}
		Student  s1=new Student();
		
		
		try {
			Student ssss=s.newInstance();
			ssss.setAge(23);
			ssss.setStuname("rose");
			System.out.println(ssss.getStuname());
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		try {
			Field  gradeField=s.getDeclaredField("age");
			System.out.println(gradeField.getModifiers());
			System.out.println(gradeField.getType());
			System.out.println(gradeField);
		} catch (NoSuchFieldException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			e1.printStackTrace();
		}
		//2.���֪��һ�����������£�ֱ�ӵ���getClass������ȡ�ö���������
		Class  s2=s1.getClass();
		
		//3.ͨ��class���е�forname��������һ���ಢ��ȡ����������
		try {
			//Class�ṩһ�ֿɱ��ʽ��װ�ػ���
			Class c2=Class.forName("com.oracle.corejava.advance.t11.MyDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
//		Student  s=new Student();//���͵�һ���Ķ�����Ķ���
//		s.setAge(12);
//		s.setStuname("jack");
		
	}

}
class Teacher{
	
}
class Student extends Teacher implements Serializable,Runnable{//class���  �����
	public String stuname;
	private int age;
	
	public String other;
	protected int ttt;
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public  void work() {
		System.out.println(stuname+"������һ��");
	}
	private void eat() {}
	protected void ttt() {}
	
	
}
