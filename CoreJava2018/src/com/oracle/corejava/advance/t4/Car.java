package com.oracle.corejava.advance.t4;

//�����޸Ĺرգ�������չ����
//���ھۣ������


//��ϣ�����ϣ�����ϣ��ɳ������

//����ϣ�������֮�以��������
//����ϣ�һ������������һ���࣬��������һ���������Է���
//�ɳ�����ϣ�һ������������һ�����͵Ľӿ�
interface Donglixitong{
	
}
 class Engine implements Donglixitong{
}
public class Car {
	private Donglixitong  e;
	private String color;
	private String size;
	
	public void run() {}
	
	/**
	 * ��ȼ��
	 */
	public void  addEnerge(RanLiao  q) {
		System.out.println("�������ͣ���������");
	}
	
	

}
