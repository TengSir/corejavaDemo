package com.oracle.corejava.advance.t8;

/**
 * ������һ���߳�����
 * @author TengSir
 *
 */
public class MyThread1  extends Thread{

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int n=0;n<3;n++) {
			System.out.println("***");
		}
	}
	
}
