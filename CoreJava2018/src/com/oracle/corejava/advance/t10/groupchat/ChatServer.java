package com.oracle.corejava.advance.t10.groupchat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ChatServer {

	public static void main(String[] args) {

		
		try {
			ServerSocket  server=new ServerSocket(8888);
			System.out.println("�������Ѿ�����");
			//���뿪��accept���ܽ��ܿͻ�������
			while(true) {
				final Socket client=server.accept();//�������ӶԷ�������������
				System.out.println("�ͻ���"+client.getInetAddress().getHostAddress()+"���ӽ�����");
				//Ϊ�˱�֤��ȡ��ǰ������ӽ����Ŀͻ�����Ϣ��Ӱ������Ŀͻ��������Ǳ��뿪��һ���߳�������û��Ķ�ȡ��Ϣ��������
				new Thread() {
					public void run() {

						try {
							//Ҫ�����ӽ���������ͻ�����һ�仰������Ҫ�������������client�����ȡ�����������д�뵽�������ͨ����
							BufferedWriter socketWriter=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));//�ײ�ֵ�ṩ���ֽ����������ֶ���װ������ϰ��ʹ�ö��Ը������
							BufferedReader socketReader=new BufferedReader(new InputStreamReader(client.getInputStream()));//Ϊ���ܽ��ܿͻ��˷���������Ϣ����ҲҪ׼��������������ȡ�����е���Ϣ
							
							while (true) {
								String recivedMessage = socketReader.readLine();
								System.out.println("���յ�����Ϣ��" + recivedMessage);

							}		
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}.start();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
