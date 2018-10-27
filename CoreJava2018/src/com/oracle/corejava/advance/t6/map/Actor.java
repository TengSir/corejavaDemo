package com.oracle.corejava.advance.t6.map;

public class Actor {
	private String name;
	private int age;
	private String sex;
	private String tz;
	/**
	 * @param name
	 * @param age
	 * @param sex
	 * @param tz
	 */
	public Actor(String name, int age, String sex, String tz) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.tz = tz;
	}
	@Override
	public String toString() {
		return "Actor [name=" + name + ", age=" + age + ", sex=" + sex + ", tz=" + tz + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTz() {
		return tz;
	}
	public void setTz(String tz) {
		this.tz = tz;
	}
}
