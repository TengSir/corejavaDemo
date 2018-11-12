package com.oracle.corejava.advance.t10.groupchat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {
		try {
			BufferedReader  consoleReader=new BufferedReader(new InputStreamReader(System.in));//为了能够从控制台读取用户输入对数据，我们将标准对控制台输入流包装成我们习惯使用对自负输入流
			
			Socket   client=new Socket("172.19.22.111",8888);
			
			System.out.println("client started");
			//链接服务器成功之后就需要读取服务器给我回发对一条消息
			final BufferedReader reader=new BufferedReader(new InputStreamReader(client.getInputStream()));//将网络底层提供对字节流包装成我们习惯使用对自负输入流，来读取网络中对自负消息
			BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));//准备一个网络输出流用来将要发送的消息输出到网络中
			//为了保证读和写两个操作互不干扰，我们只能用多线程来解决程序并行运行的效果
			new  Thread() {
				public void run() {
					while(true) {
						try {
							String reciveMessage=reader.readLine();//等待读取网络另外一方发过来对一行文本消息（阻塞方法）（网络中的io可能会出现io阻塞，）
							System.out.println("接收到的消息："+reciveMessage);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				};
			}.start();
			
			while(true) {
				
				//读取客户端控制台输入的要发送的消息
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
