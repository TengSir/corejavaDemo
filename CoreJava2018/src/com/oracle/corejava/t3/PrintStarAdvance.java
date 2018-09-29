package com.oracle.corejava.t3;


import com.oraclesdp.common.SystemIn;

public class PrintStarAdvance {
	
	public static void main(String[] args) {
		System.out.println("请输入要打印多少行的星星：");
		int  starNum=SystemIn.nextInt();//获取一个行数，代表要打印的星星行数
		//确保它是一个奇数
		if(starNum%2==0){
			if(starNum==2|starNum==0)
			{
				starNum++;
			}else
			{
				starNum--;
			}
		}
		
		
		int kong=1;//定义空白数量的变量
		int xing=1;//定义
		int hang=1;//记录目前是第几行的变量
		boolean  topHalf=true;//是在打印菱形的上半部分还是下半部分
		for (;;) {
			if(topHalf)//判断是上半部分
			{
				int allKongOfThisHang=(starNum-1)/2-hang+1;//计算出这一行应该有的空白数量
				if(kong<=allKongOfThisHang)
				{
					System.out.print(" ");
					kong++;
					continue;
				}
				int allStarOfThisHang=(hang-1)*2+1;//计算出这一行应该有的星星数量
				if(xing<=allStarOfThisHang)
				{
					System.out.print("*");
					xing++;
					continue;
				}
				System.out.println();//这一行的空格和星星都打印结束了，所以打印一个换行，
				kong=1;//同时将记录打印第几个空格的变量重置到开头1
				xing=1;//同时将记录打印第几个星星的变量重置到开头1]
			}else
			{
				int allKongOfThisHang=(hang-(starNum+1)/2);//计算出这一行应该有的空白数量
				if(kong<=allKongOfThisHang)
				{
					System.out.print(" ");
					kong++;
					continue;
				}
				int allStarOfThisHang=((starNum-1)/2-(hang-(starNum+1)/2))*2+1;//计算出这一行应该有的星星数量
				if(xing<=allStarOfThisHang)
				{
					System.out.print("*");
					xing++;
					continue;
				}
				System.out.println();//这一行的空格和星星都打印结束了，所以打印一个换行，
				kong=1;//同时将记录打印第几个空格的变量重置到开头1
				xing=1;//同时将记录打印第几个星星的变量重置到开头1]
			}
			
			
				if(hang==(starNum+1)/2)topHalf=false;
				if(hang==starNum) break;
				hang++;
		}
		
	}

}