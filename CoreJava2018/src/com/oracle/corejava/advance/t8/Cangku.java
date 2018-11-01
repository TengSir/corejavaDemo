package com.oracle.corejava.advance.t8;

public class Cangku {
	private Object o=new Object();

	private int count=0;
	
	public  void add() {
		synchronized(o) {
			if(count>=20) {
				try {
					o.wait();;//让当前线程等待wait方法和sleep功能一样，让当前线程睡眠
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("生产满了，不能生产了");
			}else {
				System.out.println("-------当前库存:"+count);
				count=count+1;
				System.out.println("-------生产之后仓库的库存："+count);
				o.notifyAll();
			}
		}
	}
	
	public  void remove() {
		synchronized(o) {
			if(count<=0) {
				try {
					//wait和sleep区别在于wait方法会释放当前同步代码块持有的锁，而sleep不会
					o.wait();;//让当前线程wait（睡眠）
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("消费完了，不能消费了");
			}else {
				System.out.println("++++++当前库存:"+count);
				count=count-1;
				System.out.println("++++++消费之后仓库的库存："+count);
				o.notifyAll();
			}
		}
	}

	public int getCount() {
		return count;
	}
}
