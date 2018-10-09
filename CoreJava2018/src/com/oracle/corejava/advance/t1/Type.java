package com.oracle.corejava.advance.t1;

public class Type {

	//实例变量是定义在累里面的变量称之为实例变量
	//定义在方法里面的变量称之为局部变量
	
	//实例变量会有默认值
	
	//1.（实例变量如果没有显示赋值依然可以引用）
	//2.实力变量在本类里都有效
	
	
	//局部变量没有默认值
	//1.（必须显示赋值才能使用）
	//2.局部变量只能在本方法里使用
	
	public static void main(String[] args) {
		int age=23;
		String sex="m";
		String username="teset";
		String password="dfs";
		
		
		//1.先找对象，分析对象的属性和方法
		
		//2.根据对象抽象成类（封装类）
		
		User user=new User();//创建一个对象(复合类型)
		
		
		System.out.println(user.age);
		System.out.println(user.username);
		user.work();
		
		
		
		
		//简单的电商系统功能分析，用户（账户，密码，性别，年龄。。。），订单，商品
	}
}
//引用类型，复合类型
class  User{
	//类中的属性（有什么）
	String username="ssss";
	String password;
	int age;
	String sex="m";
	
	public void work() {
		System.out.println("work  for company");
	}
	public void  toer() {
		System.out.println(username);
	}
	public  void test() {
		int sss=0;
		String sex="f";
		System.out.println(this.sex);
		System.out.println(sss);
		System.out.println(sex);
		System.out.println(username);
	}
}
