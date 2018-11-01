package com.oracle.corejava.advance.t8;

public class Test {
	
	public static void main(String[] args) {
		
		
		Cangku  c=new Cangku();
		
		Consumer  con=new Consumer(c);
		Producer  p=new Producer(c);
		
		con.start();
		p.start();
		
		try {
			p.join();
			con.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(c.getCount());
	}

}
