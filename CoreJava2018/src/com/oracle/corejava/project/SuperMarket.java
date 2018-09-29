package com.oracle.corejava.project;

import com.oraclesdp.common.SystemIn;

public class SuperMarket {
	//数据结构应该采用多个数组来存储商品的不同属性
	static int[]  bianhao=new int[20];//存储所有编号的数组
	static String[]  mingzi=new String[20];//所有商品名字
	static float[]  jiage=new float[20];//价格
	static int[]  shuliang=new int[20];//数量
	static  int  weizhi=0;

	//SystemIn这个类提供了所有数据类型输入的方法
	
	public static void main(String[] args) {
		showWelcome();
	}
	
	
	// 逻辑结构，if-else ,函数概念，变量， 数组
	
	public static void  showWelcome(){
		
		System.out.println("欢迎来到XX超市管理系统");
		System.out.println("1.登陆");
		System.out.println("2.退出");
		//获取用户的操作(输入)
		choiceMenu();
		
	}
	public static void  choiceMenu(){
		int key=SystemIn.nextInt();//获取用户输入的一个整数
		if(key==1)
		{
			denglu();
		}else if(key==2)
		{
			System.exit(0);//退出这个程序
		}else
		{
			System.out.println("输入有误！");
		}
	}
	
	public static void  denglu(){
		System.out.println("请输入用户名:");
		String yonghuming=SystemIn.nextLine();//等待输入
		System.out.println("请输入密码:");
		String mima=SystemIn.nextLine();
		
		if(yonghuming.equals("admin")&&mima.equals("123"))
		{
			System.out.println("登陆成功");
			zhucaidan();
		}else
		{
			System.out.println("登陆失败");
		}
		//System.out.println("获取用户输入的用户名和密码");
	}
	
	public static void  zhucaidan(){
		System.out.println("1.商品管理");
		System.out.println("2.用户管理");
		int caidanbianhao=SystemIn.nextInt();
		switch (caidanbianhao) {
			case 1:
			{
				showzicaidanOfShangpinguanli();
				break;
	
			}case  2:{
	
				break;
	
			}
			default:
				break;
		}
	}
	
	public static void showzicaidanOfShangpinguanli(){
		System.out.println("1.add商品");
		System.out.println("2.udate商品");
		System.out.println("3.delete商品");
		System.out.println("4.show商品");
		int id=SystemIn.nextInt();
		if(id==1)
		{
			add();
			
		}else if(id==2)
		{
			System.out.println("update");
		}else if(id==3)
		{
			System.out.println("delete");
		}
		else if(id==4)
		{
			System.out.println("show");
		}
	}
	public static void add(){
		System.out.println("请输入要添加的商品的编号:");
		int bh=SystemIn.nextInt();//获取输入的编号了
		bianhao[weizhi]=bh;
		System.out.println("请输入要添加的商评的名字:");
		String name=SystemIn.nextLine();
		mingzi[weizhi]=name;
		System.out.println("请输入要添加的商评的价格:");
		float price=SystemIn.nextFloat();
		jiage[weizhi]=price;
		System.out.println("请输入要添加的商评的数量:");
		int count=SystemIn.nextInt();
		shuliang[weizhi]=count;
		
		//每添加一个商品后将位置变量++，相当于是下一次从下一个位置放置数据
		weizhi++;
		System.out.println(bianhao[0]+"---"+mingzi[0]+" -"+jiage[0]+"-"+shuliang[0]);
//		System.out.println("add success");
		showzicaidanOfShangpinguanli();
	}
	
}

















