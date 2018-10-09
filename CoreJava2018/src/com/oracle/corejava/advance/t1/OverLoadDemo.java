package com.oracle.corejava.advance.t1;

public class OverLoadDemo {

	public static void main(String[] args) {
		//方法重载（在一个类里面如果由多个同名的方法，他们的参数列表(参数的数量，顺序，和类型又一个不同就成为不同)不同，那么这种机制叫做方法的重载）
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