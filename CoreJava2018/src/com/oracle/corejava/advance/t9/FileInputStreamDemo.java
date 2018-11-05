package com.oracle.corejava.advance.t9;

import java.io.FileInputStream;
import java.util.Arrays;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream  in=new FileInputStream("/Users/tengsir/softwares/cn_windows_10_multiple_editions_version_1607_updated_jul_2016_x64_dvd_9056935.iso");
			byte[]  bs=new byte[1024*1024*50];
			int length;
			while((length=in.read(bs))!=-1) {
				
				System.out.println(Arrays.toString(bs));
			}
			
			
			/** 一次性读取一个字节适合读取小文件
			FileInputStream  in=new FileInputStream("files/1.wav");
			int bytecode;
			while((bytecode=in.read())!=-1) {
				
				System.out.println(bytecode);
			}
			**/
//			File  f=new File("files/2.txt");
//			FileInputStream  in1=new FileInputStream(f);//in1关联到files目录下面的2.txt文件的一个工具流（输入管道类）
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}

}
