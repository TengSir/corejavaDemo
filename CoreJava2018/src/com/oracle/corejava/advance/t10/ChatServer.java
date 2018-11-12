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
			final BufferedReader  consoleReader=new BufferedReader(new InputStreamReader(System.in));//为了能够从控制台读取用户输入对数据，我们将标准对控制台输入流包装成我们习惯使用对自负输入流
			
			
			ServerSocket  server=new ServerSocket(8888);
			System.out.println("服务器已经启动");
			//必须开启accept才能接受客户端链接
			Socket client=server.accept();//接受链接对方法是阻塞方法
			System.out.println(client.getInetAddress().getHostAddress());
			
			//要给链接进来对这个客户发送一句话，就需要用这个连进来对client对象获取输出流将数据写入到这个网络通道中
			final BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));//底层值提供了字节流，我们手动包装成我们习惯使用对自负输出流
			BufferedReader socketReader=new BufferedReader(new InputStreamReader(client.getInputStream()));//为了能接受客户端发过来的消息我们也要准备输入流用来读取网络中的消息
			//为了保证读写不影响，开启多线程模式并行运行
			new Thread() {
				public void run() {
					while(true) {
						try {
							String willSendMessage = consoleReader.readLine();// 在发送之前用控制台输入流读取控制台用户输入对一行文本

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
				System.out.println("接收到的消息：" + recivedMessage);

			}		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
