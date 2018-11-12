package com.oracle.corejava.advance.t10.groupchat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;

public class ChatServer {

	public static void main(String[] args) {

		final ArrayList<Socket> allClients=new ArrayList<>();
		
		try {
			ServerSocket  server=new ServerSocket(8888);
			System.out.println("服务器已经启动");
			//必须开启accept才能接受客户端链接
			while(true) {
				final Socket client=server.accept();//接受链接对方法是阻塞方法
				allClients.add(client);
				System.out.println("客户端"+client.getInetAddress().getHostAddress()+"链接进来了");
				//为了保证读取当前这个链接进来的客户端消息不影响后续的客户链接我们必须开启一个线程让这个用户的读取消息独立运行
				new Thread() {
					public void run() {

						try {
							//要给链接进来对这个客户发送一句话，就需要用这个连进来对client对象获取输出流将数据写入到这个网络通道中
							BufferedReader socketReader=new BufferedReader(new InputStreamReader(client.getInputStream()));//为了能接受客户端发过来的消息我们也要准备输入流用来读取网络中的消息
							
							while (true) {
								String recivedMessage = socketReader.readLine();
								System.out.println("接收到的消息：" + recivedMessage);
								for(Socket c:allClients) {
									BufferedWriter socketWriter=new BufferedWriter(new OutputStreamWriter(c.getOutputStream()));
									socketWriter.write(client.getInetAddress().getHostAddress()+"say:"+recivedMessage);
									socketWriter.newLine();
									socketWriter.flush();
								}

							}		
						} catch (Exception e) {
							e.printStackTrace();
							System.out.println(client.getInetAddress().getHostAddress()+"离开了");
						}
					}
				}.start();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
