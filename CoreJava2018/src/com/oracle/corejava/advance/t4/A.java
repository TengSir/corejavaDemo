package com.oracle.corejava.advance.t4;

public interface A {
	//�ӿ�����ֻ�г����ͳ��󷽷�
	
	//�ӿں���Ĺ�ϵ��ֻ��һ�ֹ�ϵ��������ʵ�֣�implements���ӿ�,һ�������ʵ�ֶ���ӿ�
	
	//�ӿںͽӿ�֮�����֧�ּ̳У��ӿ�֮���Ƕ�̳е�
	
	
	//һ������Լ̳и����ͬʱ��ʵ�ֶ���ӿ�
	int a=2;//�ǵģ�public  static final ��

	public   void test() ;//�ӿ�����ķ������Բ���дabstract�ؼ���
}
interface BC extends A{
	public void  ttt() ;
}

interface  D{
	public void  ttt() ;
}
interface E extends D,A{
	
}
class Father{}

class Child extends Father  implements BC,D{

	@Override
	public void test() {
	}
	@Override
	public void ttt() {
	}
	
}
