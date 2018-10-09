package com.oracle.corejava.advance.t1;

public class Product {

	String name;
	float price;
	String brand;
	String color;
	String size;
	String baozhiqi;
	String image;

	/**
	 * @param name
	 * @param price
	 * @param brand
	 * @param color
	 * @param size
	 * @param baozhiqi
	 * @param image
	 */
	public Product(String name, float price, String brand, String color, String size, String baozhiqi, String image) {
		this();// ���ñ�����޲ι�����
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.baozhiqi = baozhiqi;
		this.image = image;
	}

	/**
	 * @param name
	 * @param price
	 * @param brand
	 */
	public Product(String name, float price, String brand) {
		this();
		this.name = name;
		this.price = price;
		this.brand = brand;
	}

	public Product() {
		this.color = "δ֪";
		this.size = "��֪��";
	}

}
