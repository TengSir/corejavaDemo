package com.oracle.corejava.advance.t10;

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
			final BufferedReader  consoleReader=new BufferedReader(new InputStreamReader(System.in));//Ϊ���ܹ��ӿ���̨��ȡ�û���������ݣ����ǽ���׼�Կ���̨��������װ������ϰ��ʹ�ö��Ը�������
			
			
			ServerSocket  server=new ServerSocket(8888);
			System.out.println("�������Ѿ�����");
			//���뿪��accept���ܽ��ܿͻ�������
			Socket client=server.accept();//�������ӶԷ�������������
			System.out.println(client.getInetAddress().getHostAddress());
			
			//Ҫ�����ӽ���������ͻ�����һ�仰������Ҫ�������������client�����ȡ�����������д�뵽�������ͨ����
			final BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));//�ײ�ֵ�ṩ���ֽ����������ֶ���װ������ϰ��ʹ�ö��Ը������
			BufferedReader socketReader=new BufferedReader(new InputStreamReader(client.getInputStream()));//Ϊ���ܽ��ܿͻ��˷���������Ϣ����ҲҪ׼��������������ȡ�����е���Ϣ
			//Ϊ�˱�֤��д��Ӱ�죬�������߳�ģʽ��������
			new Thread() {
				public void run() {
					while(true) {
						try {
							String willSendMessage = consoleReader.readLine();// �ڷ���֮ǰ�ÿ���̨��������ȡ����̨�û������һ���ı�

							writer.write(willSendMessage);
							writer.newLine();
							writer.flush();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}; 
			}.start();
			
			while (true) {
				
				String recivedMessage = socketReader.readLine();
				System.out.println("���յ�����Ϣ��" + recivedMessage);

			}		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
