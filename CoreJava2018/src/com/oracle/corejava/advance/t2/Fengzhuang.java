package com.oracle.corejava.advance.t2;

public class Fengzhuang {

	// 类中两种成员（1.属性2.方法）
	//封装的具体步骤：
	//属性封装 1.将属性用private修饰符修饰  2.提供相应的get和set方法让用户访问
	//方法封装   根据情况提供具体封装规则
	public static void main(String[] args) {
		CridetCard c = new CridetCard();
		System.out.println(c.getPassword());
		
		

	}

}
class Product{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	private String brand;
	private float price;
	private int count;
}


class CridetCard {
	private String password = "222";
	float money = 100.0f;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}