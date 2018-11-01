package com.oracle.corejava.advance.t8;

public class Cangku {
	private Object o=new Object();

	private int count=0;
	
	public  void add() {
		synchronized(o) {
			if(count>=20) {
				try {
					o.wait();;//�õ�ǰ�̵߳ȴ�wait������sleep����һ�����õ�ǰ�߳�˯��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("�������ˣ�����������");
			}else {
				System.out.println("-------��ǰ���:"+count);
				count=count+1;
				System.out.println("-------����֮��ֿ�Ŀ�棺"+count);
				o.notifyAll();
			}
		}
	}
	
	public  void remove() {
		synchronized(o) {
			if(count<=0) {
				try {
					//wait��sleep��������wait�������ͷŵ�ǰͬ���������е�������sleep����
					o.wait();;//�õ�ǰ�߳�wait��˯�ߣ�
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("�������ˣ�����������");
			}else {
				System.out.println("++++++��ǰ���:"+count);
				count=count-1;
				System.out.println("++++++����֮��ֿ�Ŀ�棺"+count);
				o.notifyAll();
			}
		}
	}

	public int getCount() {
		return count;
	}
}
