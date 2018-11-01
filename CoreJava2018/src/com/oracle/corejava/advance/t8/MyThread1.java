package com.oracle.corejava.advance.t8;

/**
 * 开发了一个线程类型
 * @author TengSir
 *
 */
public class MyThread1  extends Thread{
	Counter  c;
	 public MyThread1(Counter c) {
		 this.c=c;
	}
	@Override
	public void run() {
		for(int n=0;n<10000;n++) {
			c.addOne();
		}
	}
	
}
