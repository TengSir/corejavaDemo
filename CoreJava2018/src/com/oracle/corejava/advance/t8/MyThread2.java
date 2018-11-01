package com.oracle.corejava.advance.t8;

/**
 * 开发了一个线程类型
 * @author TengSir
 *
 */
public class MyThread2  extends Thread{
	Counter  c;
	 public MyThread2(Counter c) {
		 this.c=c;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		
		for(int n=0;n<5000;n++) {
			c.removeOne();
		}
	}
	
}
