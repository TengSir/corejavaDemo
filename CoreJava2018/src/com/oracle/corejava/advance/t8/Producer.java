package com.oracle.corejava.advance.t8;

public class Producer  extends Thread{
	
	private Cangku  c;

	public Producer(Cangku c) {
		super();
		this.c = c;
	}
	@Override
	public void run() {
//		for(int n=0;n<50000;n++) {
		while(true) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			c.add();
		}
	}

}
