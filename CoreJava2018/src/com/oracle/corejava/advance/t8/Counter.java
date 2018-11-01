package com.oracle.corejava.advance.t8;

public class Counter {

	private Object o=new Object();//任何java对象都有一个锁的特性，这个特性代码无法访问，但是客观存在，线程同步里面才能使用锁
	private int count=0;
	
	public int getCount() {
		return count;
	}

	public   synchronized void  addOne() {
			count=count+1;
	}
	
	public   void  removeOne() {
		synchronized(this) {
		count=count-1;
		}
	}
}
