package com.oracle.corejava.t2;

public class ArithmeticDemo {
	
	
	int age;//��Ա����

	
	public static void main(String[] args) {
		
		int aaaa=23;
		int bbbb=34;
		
		
		System.out.println(aaaa&bbbb);//λ����
		boolean  is=false;
		boolean  aa=true;
		System.out.println(is&aa);//�߼������
		
		int  xxxx=-123434;
		System.out.println(xxxx>>>2);
		
		int num=10;
		
		num*=2;
		
		num=num*2;
		
		num/=2;
		num=num/2;
		
		System.out.println(num>>1);
		System.out.println(num/3);
		System.out.println(num%3);
		
		float  sssss=2.6f;
		System.out.println(sssss/3);
		
		
		
		
		
		byte  a=12;//�ֲ�����
		short b=23;
		
		int c=a+b;
		
		int bbb=23;
		
		int d=bbb+c;
		
		float  ccc=23.4f;
		
		double cccd=23.34;
		double ccce=cccd+ccc;
		
		
		int  h=23;
		long  j=234242342L;//�Զ�����
		
		//ǿ������ת�����������ڻ�������
		
		int  k=(int)j;//ǿ������ת��(����һ���ķ���)
		System.out.println(k);
		
	}
	
	
	
	
	
	
	
	public void test(int  a) {
		int age1=23;
		int age2=34;
		System.out.println(age1>age2);//false �Ƚ���������صĵ�booleanֵ
		char c;
		
		c='2';
		
		System.out.println(c);
		
		System.out.println(a);
		//�ֲ��������������������������(�����������ڵĴ����ţ����������)
		int someData=234;
		
		//�Զ�������
		{
			int ccc=2345;
			System.out.println("some code");
			System.out.println(someData);
			{
				System.out.println(ccc);
			}
		}
		
		{
			int ccc=333;
			System.out.println(ccc);
		}		
		
		System.out.println(someData);
		
		
	}
	
	
	
	
	
	
	
	
	
}
