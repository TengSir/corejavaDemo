/**
 * 
 */
package com.oracle.corejava.project;

import com.oracle.corejava.advance.t2.Animal;
import com.oraclesdp.common.SystemIn;

/**
 * @author TengSir
 *����һ���򵥵ĳ��й���ϵͳ�ĳ������
 */
public class SMMS {
	/**
	 * �������涨��һЩ������������¼��������ʱ��Ҫʹ�õ����ݣ����磻����Ա���˻���������
	 * ������Ŀ����������������涨��ı�����������static���ε�
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
	 * ���ǳ�����������ʾ��ӭ��Ϣ�ĺ���
	 */
	public  static void showWelcome() {
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println("********��ӭ����xxx����**********");
		System.out.println("**********ͯ�����ۣ���һ��ʮ******");
		System.out.println("**************************");
		login();
	}
	/**
	 * ���Ǵ����½�ķ���
	 */
	public static void  login() {
		System.out.println("�˵���");
		System.out.println("1.��½");
		System.out.println("2.�˳�");
		int yourChoiceMenuId=SystemIn.nextInt();//�ȴ�����
		System.out.println(yourChoiceMenuId);
		if(yourChoiceMenuId==1) {
			int count=0;
			while(true) {
				//1.�Ȼ�ȡ�û�������û���������
				System.out.println("�������˺ţ�");
				String username=SystemIn.nextLine();
				System.out.println("���������룺");
				String password=SystemIn.nextLine();
				
				count++;
				//2.���û�������û����������ϵͳ�д洢���û������������Ƚ�
				if(username.equals(adminUsername)&&password.equals(adminPassword)) {
					System.out.println("��½�ɹ�");
					//����½�ɹ���Ӧ����ʾϵͳ���˵�
					showMainMenu();
					break;
				}else {
					System.err.println("�û�������������󣬵�½ʧ�ܣ������µ�½��");
					if(count==3) {
						break;
					}else {
						continue;
					}
					
				}
			}
			
		}else if(yourChoiceMenuId==2) {
			System.exit(0);//�˳�����
		}
	}
	
	public static void showMainMenu() {
		System.out.println("�˵����£�");
		System.out.println("1.�����Ʒ");
		System.out.println("2.ɾ����Ʒ");
		System.out.println("3.�޸���Ʒ");
		System.out.println("4.�鿴��Ʒ�б�");
		System.out.println("5.������һ��");
		System.out.println("6.�˳�");
		
		System.out.println("��ѡ��Ҫִ�еĲ˵����:");
		int menuId=SystemIn.nextInt();
		switch (menuId) {
			case 1:
			{
				addProduct();
				break;
			}
			case 2:
			{
					System.out.println("����Ӧ����дɾ����Ʒ���ܴ���");
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
		System.out.println("�����������Ʒ�ĺ�������");
	}
}