package com.oracle.corejava.advance.t7;

public class StaticInitial {
	
	public void test(int i) {
		test(++i);
	}
	
//	static int[]  ages;
//	static {
//		ages[0]=111;
//	}
	public static void main(String[] args) {
		StaticInitial  s=new StaticInitial();
		s.test(1);
		
	}

}
