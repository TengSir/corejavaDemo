package com.oracle.corejava.advance.t4;

public abstract class Oil extends  RanLiao {
	
	private  int  jiegou;
	private int kaluli;
	public abstract void  rezhi();

}
class Qiyou extends Oil{
	private int huifa;
	@Override
	public void rezhi() {
		System.out.println("1000kl");
	}
	
}
class CHaiyou extends Oil{
	private int huifa;

	@Override
	public void rezhi() {
		System.out.println("800kl");
		
	}
}
