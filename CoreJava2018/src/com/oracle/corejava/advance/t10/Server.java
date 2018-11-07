package com.oracle.corejava.advance.t10;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws Exception {
		ServerSocket  server=new ServerSocket(8888);
		Socket client=server.accept();
		OutputStream  out=client.getOutputStream();
		
		FileInputStream  in=new FileInputStream("files/1.wav");
		byte[] bs=new byte[100];
		int len;
		while((len=in.read(bs))!=-1) {
			out.write(bs,0,len);
		}
		out.close();
		
		System.out.println(client.getInetAddress().getHostAddress()+"链接进来了");
	}

}
