package com.oracle.corejava.advance.t8;

public class Consumer  extends Thread{
	private Cangku  c;

	public Consumer(Cangku c) {
		super();
		this.c = c;
	}
	
	@Override
	public void run() {
//		for(int n=0;n<50000;n++) {
		while(true) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			c.remove();
		}
	
	}

}
