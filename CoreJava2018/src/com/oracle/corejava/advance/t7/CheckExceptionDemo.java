package com.oracle.corejava.advance.t7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckExceptionDemo {
	
	public static void main(String[] args) {
		//����쳣���������ڱ���ʱ����Ҫǿ�Ƽ����δ�����û�м����쳣������ƣ�
		//��������������ԭ����ܻᵼ�³������Ĺ��ϣ�java�﷨�ļ����Ʊ���Ҫ�������쳣�ڱ���ʱ������쳣�������
			try {
				FileInputStream  in=new FileInputStream("��ҵ/��ҵ��ַ");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			try {
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
