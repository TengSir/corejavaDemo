package com.oracle.corejava.advance.t2;

public class Fengzhuang {

	// �������ֳ�Ա��1.����2.������
	//��װ�ľ��岽�裺
	//���Է�װ 1.��������private���η�����  2.�ṩ��Ӧ��get��set�������û�����
	//������װ   ��������ṩ�����װ����
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