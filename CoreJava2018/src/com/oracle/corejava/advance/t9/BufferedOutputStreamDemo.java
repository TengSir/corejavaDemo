package com.oracle.corejava.advance.t9;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {
	
	public static void main(String[] args) throws Exception {
		//����buffer�������ǻ��������������ڴ��ݴ�����
		FileOutputStream  fout=new FileOutputStream("files/444.txt");
		BufferedOutputStream  out=new BufferedOutputStream(fout);
		int  count=0;
		for(int n=97;n<97+26;n++) {
//			Thread.sleep(500);
			
			out.write(n);//out����ִ����֮�󲢲�����������д���ļ����ȷ����ڴ��һ�黺���У��ȵ����ڵ��û���closeʱ��д���ļ�
			count++;
			if(count==10) {
				out.flush();
				count=0;
				System.out.println("����ʮ����λ�����һ��");
			}
		}
		
		out.close();
		
		//�ڵ������ڵͼ������߱����߼������ԣ����Ը������ܻ������ݣ�write����������д���ļ�
//		FileOutputStream  fout=new FileOutputStream("files/444.txt");
//		for(int n=97;n<97+26;n++) {
//			Thread.sleep(500);
//			fout.write(n);//out����ִ����֮�󲢲�����������д���ļ����ȷ����ڴ��һ�黺���У��ȵ����ڵ���flush����closeʱ��д���ļ�
//		}
		
	}

}
