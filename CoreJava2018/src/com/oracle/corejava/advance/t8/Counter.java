package com.oracle.corejava.advance.t8;

public class Counter {

	private Object o=new Object();//�κ�java������һ���������ԣ�������Դ����޷����ʣ����ǿ͹۴��ڣ��߳�ͬ���������ʹ����
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
