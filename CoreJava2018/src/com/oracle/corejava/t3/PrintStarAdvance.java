package com.oracle.corejava.t3;


import com.oraclesdp.common.SystemIn;

public class PrintStarAdvance {
	
	public static void main(String[] args) {
		System.out.println("������Ҫ��ӡ�����е����ǣ�");
		int  starNum=SystemIn.nextInt();//��ȡһ������������Ҫ��ӡ����������
		//ȷ������һ������
		if(starNum%2==0){
			if(starNum==2|starNum==0)
			{
				starNum++;
			}else
			{
				starNum--;
			}
		}
		
		
		int kong=1;//����հ������ı���
		int xing=1;//����
		int hang=1;//��¼Ŀǰ�ǵڼ��еı���
		boolean  topHalf=true;//���ڴ�ӡ���ε��ϰ벿�ֻ����°벿��
		for (;;) {
			if(topHalf)//�ж����ϰ벿��
			{
				int allKongOfThisHang=(starNum-1)/2-hang+1;//�������һ��Ӧ���еĿհ�����
				if(kong<=allKongOfThisHang)
				{
					System.out.print(" ");
					kong++;
					continue;
				}
				int allStarOfThisHang=(hang-1)*2+1;//�������һ��Ӧ���е���������
				if(xing<=allStarOfThisHang)
				{
					System.out.print("*");
					xing++;
					continue;
				}
				System.out.println();//��һ�еĿո�����Ƕ���ӡ�����ˣ����Դ�ӡһ�����У�
				kong=1;//ͬʱ����¼��ӡ�ڼ����ո�ı������õ���ͷ1
				xing=1;//ͬʱ����¼��ӡ�ڼ������ǵı������õ���ͷ1]
			}else
			{
				int allKongOfThisHang=(hang-(starNum+1)/2);//�������һ��Ӧ���еĿհ�����
				if(kong<=allKongOfThisHang)
				{
					System.out.print(" ");
					kong++;
					continue;
				}
				int allStarOfThisHang=((starNum-1)/2-(hang-(starNum+1)/2))*2+1;//�������һ��Ӧ���е���������
				if(xing<=allStarOfThisHang)
				{
					System.out.print("*");
					xing++;
					continue;
				}
				System.out.println();//��һ�еĿո�����Ƕ���ӡ�����ˣ����Դ�ӡһ�����У�
				kong=1;//ͬʱ����¼��ӡ�ڼ����ո�ı������õ���ͷ1
				xing=1;//ͬʱ����¼��ӡ�ڼ������ǵı������õ���ͷ1]
			}
			
			
				if(hang==(starNum+1)/2)topHalf=false;
				if(hang==starNum) break;
				hang++;
		}
		
	}

}