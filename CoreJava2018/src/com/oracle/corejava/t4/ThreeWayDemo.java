package com.oracle.corejava.t4;

import java.util.Random;

public class ThreeWayDemo {

	public static void main(String[] args) {
		int[][][]  dianfei=new int[30][3][12];
		
		for(int p=0;p<dianfei.length;p++) {
			for (int y = 0; y < dianfei[p].length; y++) {
				for (int m = 0; m < dianfei[p][y].length; m++) {
					//System.out.println("�������"+(p+1)+"��ͬѧ�� "+(y+1)+"ѧ��ڵ�"+(m+1)+"�µ��õ�����");
//					int dian=SystemIn.nextInt();
					dianfei[p][y][m]=new Random().nextInt(200);
				}
			}
		}
		
		for(int p=0;p<dianfei.length;p++) {
			for (int y = 0; y < dianfei[p].length; y++) {
				for (int m = 0; m < dianfei[p][y].length; m++) {
					System.out.println("��"+(p+1)+"��ͬѧ�ĵ� "+(y+1)+"ѧ��ĵ�"+(m+1)+"�µ��õ�����"+dianfei[p][y][m]);
				}
			}
		}
		
	}

}
