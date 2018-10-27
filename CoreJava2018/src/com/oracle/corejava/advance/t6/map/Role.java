package com.oracle.corejava.advance.t6.map;

public class Role {
	
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
	public Role(String name, int age, String sex, String tz) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.tz = tz;
	}
	@Override
	public String toString() {
		return "Role [name=" + name + ", age=" + age + ", sex=" + sex + ", tz=" + tz + "]";
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((tz == null) ? 0 : tz.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (tz == null) {
			if (other.tz != null)
				return false;
		} else if (!tz.equals(other.tz))
			return false;
		return true;
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
