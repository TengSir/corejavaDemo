package com.oracle.corejava.advance.t9;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {
	
	public static void main(String[] args) {
		try {
			FileOutputStream  out=new FileOutputStream("files/3.txt");//������һ��ֱ�ӿ�����3.txt����������ݵ�һ����������
			String words="I have a dream  ,at shuangshi 11  buy buy buy";
			
			out.write(words.getBytes());
			out.write(98);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
