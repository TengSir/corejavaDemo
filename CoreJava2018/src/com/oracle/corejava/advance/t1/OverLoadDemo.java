package com.oracle.corejava.advance.t1;

public class OverLoadDemo {

	public static void main(String[] args) {
		//�������أ���һ������������ɶ��ͬ���ķ��������ǵĲ����б�(������������˳�򣬺�������һ����ͬ�ͳ�Ϊ��ͬ)��ͬ����ô���ֻ��ƽ������������أ�
	}
}
class A{
	public void print(int a) {
		
	}
	
	private void print(String a) {
		
	}
	public int print(String a,int c) {
		return 0;
	}
	public void print(int c,String a) {
		
	}
	public void print() {
		
	}
}
class B{
	public void print() {
		
	}
	
}