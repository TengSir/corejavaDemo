package com.oracle.corejava.advance.t3;

public class FInalDemo {
	final  int aaa;
	 final public static  float XS=4.342342f;
	public  FInalDemo(int a) {
		aaa=a;
	}

	static public   void main(String[] args) {
		System.out.println(Math.PI);
		// TODO Auto-generated method stub
		
		//final���εı����������������Ա���ֵһ�Σ�Ȼ��֮����Զ���ܱ��ı䣩
		
		//final���εķ��������Ա���д
		
		//final���ε��಻�ܱ��̳�

		//һ����˵���峣������public  static final   ������һ��ȫ��д
		final  int a=11;
	}

}

 class  AC{
	public void a() {}
	public  void b() {}
}
class BC extends AC{
	public void a() {}
	public void b() {}
	
}
