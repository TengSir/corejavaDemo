package com.oracle.corejava.t5;

public class FunctionDemo {
	public static void  methodA() {
		System.out.println("methodA");
		methodA();
	}
	public static void  methodB() {
		System.out.println("methodB");
		methodC();
	}
	public static void  methodC() {
		System.out.println("methodC");
		methodA();
	}
	//ctrl+alt+m ��һ�δ�������һ�������ķ���
	
	//���ٿ�����ctrl +alt+�¼�ͷ  
	
	//����ɾ���� ctrl+d
	public static void main(String[] args) {
		//��׳�  n!=n*(n-1)*(n-2)*....*1
		
		int result=getJiecheng(4);
		System.out.println(result);
		
//		methodA();
//		int[] ages= {23,3,43,234};
//		int result=getAvgAgeOfClass(ages);
//		System.out.println(result);
//		int  a=11;//��������ʱ����Ĳ�����֮Ϊʵ��
//		printStar(a);
	}

	/**
	 * ��ӡһ��ʮ�е����ǵĹ���
	 */
	public static void printStar() {
		for(int n=0;n<10;n++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
	/**
	 * ���ݵ����ߴ������������ӡ��Ӧ����������
	 * @param count
	 */
	public static  void  printStar(int count) {//�������������ﶨ��Ĳ�����֮Ϊ�β�
		for(int n=0;n<count;n++) {
			System.out.print("*");
			if(n==50) {
				return ;//��������ͣ��
			}
		}
		System.out.println();
	}
	/**
	 * return �ؼ��֣����з���ֵ�ķ�������������Ƿ���һ�����
	 * ��û�з���ֵ��void���ķ����У�������������ֹ����
	 * @param ages
	 * @return
	 */
	public static  int  getAvgAgeOfClass(int[] ages) {
		int sum=0;
		for(int n=0;n<ages.length;n++) {
			sum+=ages[n];
		}
		int avgAge=sum/ages.length;
			  return avgAge;
		
	}
	
	
	
	public static int getJiecheng(int num) {
		if(num==1) {
			return 1;
		}else {
			return num*getJiecheng(num-1);
		}
	}

}
