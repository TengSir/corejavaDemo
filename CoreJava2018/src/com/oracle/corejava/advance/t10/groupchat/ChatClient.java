package com.oracle.corejava.advance.t10.groupchat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {
		try {
			BufferedReader  consoleReader=new BufferedReader(new InputStreamReader(System.in));//Ϊ���ܹ��ӿ���̨��ȡ�û���������ݣ����ǽ���׼�Կ���̨��������װ������ϰ��ʹ�ö��Ը�������
			
			Socket   client=new Socket("172.19.22.111",8888);
			
			System.out.println("client started");
			//���ӷ������ɹ�֮�����Ҫ��ȡ���������һط���һ����Ϣ
			final BufferedReader reader=new BufferedReader(new InputStreamReader(client.getInputStream()));//������ײ��ṩ���ֽ�����װ������ϰ��ʹ�ö��Ը�������������ȡ�����ж��Ը���Ϣ
			BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));//׼��һ�����������������Ҫ���͵���Ϣ�����������
			//Ϊ�˱�֤����д���������������ţ�����ֻ���ö��߳���������������е�Ч��
			new  Thread() {
				public void run() {
					while(true) {
						try {
							String reciveMessage=reader.readLine();//�ȴ���ȡ��������һ����������һ���ı���Ϣ�������������������е�io���ܻ����io��������
							System.out.println("���յ�����Ϣ��"+reciveMessage);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				};
			}.start();
			
			while(true) {
				
				//��ȡ�ͻ��˿���̨�����Ҫ���͵���Ϣ
				String willSendMessage=consoleReader.readLine();
				
				writer.write(willSendMessage);
				writer.newLine();
				writer.flush();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
