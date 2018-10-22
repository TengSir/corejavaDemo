/**
 * 
 */
package com.oracle.corejava.project;

import com.oracle.corejava.advance.t2.Animal;
import com.oraclesdp.common.SystemIn;

/**
 * @author TengSir
 *这是一个简单的超市管理系统的程序代码
 */
public class SMMS {
	/**
	 * 在类里面定义一些变量，用来记录程序运行时需要使用的数据，例如；管理员的账户名和密码
	 * 整个项目里面的所有在类里面定义的变量都必须是static修饰的
	 */
	static  String adminUsername="admin";
	static  String adminPassword="123321";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		showWelcome();
		
	}
	/**
	 * 这是程序已启动显示欢迎信息的函数
	 */
	public  static void showWelcome() {
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println("********欢迎来到xxx超市**********");
		System.out.println("**********童叟无欺，假一赔十******");
		System.out.println("**************************");
		login();
	}
	/**
	 * 这是处理登陆的方法
	 */
	public static void  login() {
		System.out.println("菜单：");
		System.out.println("1.登陆");
		System.out.println("2.退出");
		int yourChoiceMenuId=SystemIn.nextInt();//等待输入
		System.out.println(yourChoiceMenuId);
		if(yourChoiceMenuId==1) {
			int count=0;
			while(true) {
				//1.先获取用户输入的用户名和密码
				System.out.println("请输入账号：");
				String username=SystemIn.nextLine();
				System.out.println("请输入密码：");
				String password=SystemIn.nextLine();
				
				count++;
				//2.用用户输入的用户名和密码和系统中存储的用户名和密码做比较
				if(username.equals(adminUsername)&&password.equals(adminPassword)) {
					System.out.println("登陆成功");
					//当登陆成功后应该显示系统主菜单
					showMainMenu();
					break;
				}else {
					System.err.println("用户名或者密码错误，登陆失败，请重新登陆！");
					if(count==3) {
						break;
					}else {
						continue;
					}
					
				}
			}
			
		}else if(yourChoiceMenuId==2) {
			System.exit(0);//退出程序
		}
	}
	
	public static void showMainMenu() {
		System.out.println("菜单如下：");
		System.out.println("1.添加商品");
		System.out.println("2.删除商品");
		System.out.println("3.修改商品");
		System.out.println("4.查看商品列表");
		System.out.println("5.返回上一层");
		System.out.println("6.退出");
		
		System.out.println("请选择要执行的菜单编号:");
		int menuId=SystemIn.nextInt();
		switch (menuId) {
			case 1:
			{
				addProduct();
				break;
			}
			case 2:
			{
					System.out.println("这里应该书写删除商品功能代码");
				break;
			}
			case 3:
			{
				break;
			}
			case 4:
			{
				break;
			}
			case 5:
			{
				break;
			}
			case 6:
			{
				break;
			}

		default:
			break;
		}
	}
	public static void addProduct() {
		System.out.println("这里是添加商品的函数代码");
	}
}