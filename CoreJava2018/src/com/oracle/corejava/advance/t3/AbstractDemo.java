package com.oracle.corejava.advance.t3;

public class AbstractDemo {

	public static void main(String[] args) {
		//abstract���ε�����������࣬�������в�һ��Ҫ�г��󷽷�
		//ʹ��abstract���εķ����������󷽷������󷽷�ֻ��λ�ڳ������У�
		//�ǳ�����̳��˳����࣬�����ʵ�ֳ����������еĳ��󷽷�
		//������ĳ�Ա�����ԣ��������������󷽷�������������
		TrafficTool  t=new Car();
	}
}

abstract class TrafficTool{
	public void test() {}
	public abstract void ttt() ;
}
class   Car  extends TrafficTool{

	@Override
	public void ttt() {
		System.out.println("ʵ��");
	}
}
