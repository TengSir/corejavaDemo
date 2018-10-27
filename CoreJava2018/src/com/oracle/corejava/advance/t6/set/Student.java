package com.oracle.corejava.advance.t6.set;

public class Student implements Comparable<Student>{
	private int stuid;
	private String stuname;
	private String stusex;
	private int stuage;
	private	 int high;
	private int weight;
	
	/**
	 * @param stuid
	 * @param stuname
	 * @param stusex
	 * @param stuage
	 * @param high
	 * @param weight
	 */
	public Student(int stuid, String stuname, String stusex, int stuage, int high, int weight) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stusex = stusex;
		this.stuage = stuage;
		this.high = high;
		this.weight = weight;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/**
	 * @param stuid
	 * @param stuname
	 * @param stusex
	 * @param stuage
	 */
	public Student(int stuid, String stuname, String stusex, int stuage) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stusex = stusex;
		this.stuage = stuage;
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + ", stusex=" + stusex + ", stuage=" + stuage
				+ ", high=" + high + ", weight=" + weight + "]";
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStusex() {
		return stusex;
	}
	public void setStusex(String stusex) {
		this.stusex = stusex;
	}
	public int getStuage() {
		return stuage;
	}
	public void setStuage(int stuage) {
		this.stuage = stuage;
	}
	@Override
	public int compareTo(Student o) {
		if(this.stuage==o.getStuage())
		{
			return this.stuname.compareTo(o.getStuname());
		}else {
			return this.stuage-o.getStuage();
		}
	}


}
