package com.oracle.corejava.advance.t1;

public class Type {

	//ʵ�������Ƕ�����������ı�����֮Ϊʵ������
	//�����ڷ�������ı�����֮Ϊ�ֲ�����
	
	//ʵ����������Ĭ��ֵ
	
	//1.��ʵ���������û����ʾ��ֵ��Ȼ�������ã�
	//2.ʵ�������ڱ����ﶼ��Ч
	
	
	//�ֲ�����û��Ĭ��ֵ
	//1.��������ʾ��ֵ����ʹ�ã�
	//2.�ֲ�����ֻ���ڱ�������ʹ��
	
	public static void main(String[] args) {
		int age=23;
		String sex="m";
		String username="teset";
		String password="dfs";
		
		
		//1.���Ҷ��󣬷�����������Ժͷ���
		
		//2.���ݶ��������ࣨ��װ�ࣩ
		
		User user=new User();//����һ������(��������)
		
		
		System.out.println(user.age);
		System.out.println(user.username);
		user.work();
		
		
		
		
		//�򵥵ĵ���ϵͳ���ܷ������û����˻������룬�Ա����䡣����������������Ʒ
	}
}
//�������ͣ���������
class  User{
	//���е����ԣ���ʲô��
	String username="ssss";
	String password;
	int age;
	String sex="m";
	
	public void work() {
		System.out.println("work  for company");
	}
	public void  toer() {
		System.out.println(username);
	}
	public  void test() {
		int sss=0;
		String sex="f";
		System.out.println(this.sex);
		System.out.println(sss);
		System.out.println(sex);
		System.out.println(username);
	}
}
