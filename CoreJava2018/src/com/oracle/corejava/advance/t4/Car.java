package com.oracle.corejava.advance.t4;

//面向修改关闭，面向扩展开放
//高内聚，低耦合


//耦合，紧耦合，松耦合，松抽象耦合

//紧耦合，两个类之间互相依赖，
//松耦合，一个类以来另外一个类，但是另外一方不依赖对方，
//松抽象耦合，一个类依赖另外一个类型的接口
interface Donglixitong{
	
}
 class Engine implements Donglixitong{
}
public class Car {
	private Donglixitong  e;
	private String color;
	private String size;
	
	public void run() {}
	
	/**
	 * 加燃料
	 */
	public void  addEnerge(RanLiao  q) {
		System.out.println("加完汽油，可以跑了");
	}
	
	

}
