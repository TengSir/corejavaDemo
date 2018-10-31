package com.oracle.corejava.advance.t8;

import java.util.Date;

public class ThreadDemo {

	//jconsole java console
	public static void main(String[] args) {
		
		MyThread1  t1=new MyThread1();
		t1.start();
		
		MyThread2  t2=new MyThread2();
		t2.start();
		
		MyThread3  run=new MyThread3();
		Thread  t3=new Thread(run);
		t3.start();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		new Thread() {
			public void run() {
				for(int n=0;n<10;n++) {
					System.out.println("?");
				}
			}
		}.start();
		
		new Thread(new Runnable() {
			public void run() {
				for(int n=0;n<10;n++) {
					System.out.println("&");
				}
			}
		}).start();
		

	}

}
