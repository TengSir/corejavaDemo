package com.oracle.corejava.advance.t6.set;

import java.util.List;

import com.oracle.corejava.advance.t2.Animal;

/**
 * 类泛型是提高java类型通用型一种机制
 * @author TengSir
 *
 */
public class Stu<T> {

	
	public void test(List<?>  animals) {
		
	}
	private T stuid;
	private String name;
	private String sex;
	private int age;
	public T getStuid() {
		return stuid;
	}
	public void setStuid(T stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
