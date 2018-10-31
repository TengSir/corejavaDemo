package com.oracle.corejava.advance.t8;

public class MyThread3 implements Runnable{
	@Override
	public void run() {
		for(int n=0;n<3;n++) {
			System.out.println("%%%");
		}
	}

}
