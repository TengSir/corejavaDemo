package com.oracle.corejava.advance.t8;

public class ThreadDemo {

	//jconsole java console
	public static void main(String[] args) {
		Counter   c=new Counter();
		
		MyThread1  t1=new MyThread1(c);
		t1.start();
//		try {
//			t1.join();t2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		for(int n=0;n<10;n++) {
//			System.out.println("&&&");
//		}
//		
		MyThread2  t2=new MyThread2(c);
		t2.start();
		
		try {
			t1.join();t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(c.getCount());
//		System.out.println(t1.count);
//		System.out.println(t2.count);
		
//		MyThread3  run=new MyThread3();
//		Thread  t3=new Thread(run);
//		t3.start();
//		
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		
//		new Thread() {
//			public void run() {
//				for(int n=0;n<10;n++) {
//					System.out.println("?");
//				}
//			}
//		}.start();
//		
//		new Thread(new Runnable() {
//			public void run() {
//				for(int n=0;n<10;n++) {
//					System.out.println("&");
//				}
//			}
//		}).start();
		

	}

}
