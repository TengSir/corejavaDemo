package com.oracle.corejava.advance.t6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		final ArrayList nums=new ArrayList();
		
		for(int n=0;n<5;n++) {
			new Thread() {
				public void run()  {
					
					for(int n=0;n<5;n++) {
						nums.add(new Random().nextInt(100));
					}
				};
			}.start();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nums.size());
		
		
		/*final Vector nums=new Vector();
		
		for(int n=0;n<5;n++) {
			new Thread() {
				public void run()  {
					
					for(int n=0;n<5;n++) {
						nums.add(new Random().nextInt(100));
					}
				};
			}.start();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nums.size());*/
	}

}
