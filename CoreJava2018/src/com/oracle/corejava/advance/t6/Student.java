package com.oracle.corejava.advance.t6;

public class Student  implements Comparable{
	
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
	public int compareTo(Object o) {
		System.out.println("执行了排序，现在是拿"+this.toString()+"和"+o);
		Student  s=(Student)o;
//		if(this.stuage==s.stuage) {
//			return s.getStuname().compareTo(this.getStuname());
//		}else {
			return s.stuage-this.stuage;
//		}
		
	}

}
