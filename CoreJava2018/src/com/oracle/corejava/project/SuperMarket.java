package com.oracle.corejava.project;

import com.oraclesdp.common.SystemIn;

public class SuperMarket {
	//���ݽṹӦ�ò��ö���������洢��Ʒ�Ĳ�ͬ����
	static int[]  bianhao=new int[20];//�洢���б�ŵ�����
	static String[]  mingzi=new String[20];//������Ʒ����
	static float[]  jiage=new float[20];//�۸�
	static int[]  shuliang=new int[20];//����
	static  int  weizhi=0;

	//SystemIn������ṩ������������������ķ���
	
	public static void main(String[] args) {
		showWelcome();
	}
	
	
	// �߼��ṹ��if-else ,������������� ����
	
	public static void  showWelcome(){
		
		System.out.println("��ӭ����XX���й���ϵͳ");
		System.out.println("1.��½");
		System.out.println("2.�˳�");
		//��ȡ�û��Ĳ���(����)
		choiceMenu();
		
	}
	public static void  choiceMenu(){
		int key=SystemIn.nextInt();//��ȡ�û������һ������
		if(key==1)
		{
			denglu();
		}else if(key==2)
		{
			System.exit(0);//�˳��������
		}else
		{
			System.out.println("��������");
		}
	}
	
	public static void  denglu(){
		System.out.println("�������û���:");
		String yonghuming=SystemIn.nextLine();//�ȴ�����
		System.out.println("����������:");
		String mima=SystemIn.nextLine();
		
		if(yonghuming.equals("admin")&&mima.equals("123"))
		{
			System.out.println("��½�ɹ�");
			zhucaidan();
		}else
		{
			System.out.println("��½ʧ��");
		}
		//System.out.println("��ȡ�û�������û���������");
	}
	
	public static void  zhucaidan(){
		System.out.println("1.��Ʒ����");
		System.out.println("2.�û�����");
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
		System.out.println("1.add��Ʒ");
		System.out.println("2.udate��Ʒ");
		System.out.println("3.delete��Ʒ");
		System.out.println("4.show��Ʒ");
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
		System.out.println("������Ҫ��ӵ���Ʒ�ı��:");
		int bh=SystemIn.nextInt();//��ȡ����ı����
		bianhao[weizhi]=bh;
		System.out.println("������Ҫ��ӵ�����������:");
		String name=SystemIn.nextLine();
		mingzi[weizhi]=name;
		System.out.println("������Ҫ��ӵ������ļ۸�:");
		float price=SystemIn.nextFloat();
		jiage[weizhi]=price;
		System.out.println("������Ҫ��ӵ�����������:");
		int count=SystemIn.nextInt();
		shuliang[weizhi]=count;
		
		//ÿ���һ����Ʒ��λ�ñ���++���൱������һ�δ���һ��λ�÷�������
		weizhi++;
		System.out.println(bianhao[0]+"---"+mingzi[0]+" -"+jiage[0]+"-"+shuliang[0]);
//		System.out.println("add success");
		showzicaidanOfShangpinguanli();
	}
	
}

















