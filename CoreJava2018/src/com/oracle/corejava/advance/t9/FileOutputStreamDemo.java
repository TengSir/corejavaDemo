package com.oracle.corejava.advance.t9;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {
	
	public static void main(String[] args) {
		try {
			FileOutputStream  out=new FileOutputStream("files/3.txt");//构建了一个直接可以往3.txt里面输出数据的一个工具流类
			String words="I have a dream  ,at shuangshi 11  buy buy buy";
			
			out.write(words.getBytes());
			out.write(98);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
