package com.oracle.corejava.advance.t4;

public abstract class Gas  implements RanLiao{
	
	private int huoyuexing;
	
	private int xinwanzhi;
	
	public abstract void shifangqiti();

}

class Meiqi extends Gas{

	@Override
	public void shifangqiti() {
		System.out.println("eryanghuatan");
	}
}

class Tianranqi extends Gas{
	@Override
	public void shifangqiti() {
		System.out.println("eryanghuatan+shaoliangshui");
	}
}
