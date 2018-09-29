package com.oracle.corejava.t4;

import java.util.Random;

public class ThreeWayDemo {

	public static void main(String[] args) {
		int[][][]  dianfei=new int[30][3][12];
		
		for(int p=0;p<dianfei.length;p++) {
			for (int y = 0; y < dianfei[p].length; y++) {
				for (int m = 0; m < dianfei[p][y].length; m++) {
					//System.out.println("请输入第"+(p+1)+"个同学第 "+(y+1)+"学年第第"+(m+1)+"月第用电量：");
//					int dian=SystemIn.nextInt();
					dianfei[p][y][m]=new Random().nextInt(200);
				}
			}
		}
		
		for(int p=0;p<dianfei.length;p++) {
			for (int y = 0; y < dianfei[p].length; y++) {
				for (int m = 0; m < dianfei[p][y].length; m++) {
					System.out.println("第"+(p+1)+"个同学的第 "+(y+1)+"学年的第"+(m+1)+"月的用电量："+dianfei[p][y][m]);
				}
			}
		}
		
	}

}
