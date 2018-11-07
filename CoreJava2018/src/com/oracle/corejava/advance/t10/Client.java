package com.oracle.corejava.advance.t10;

import java.net.Socket;

public class Client {
	public static void main(String[] args) throws  Exception{
		
		//127.0.0.1  或localhost
		
		Socket  client=new Socket("172.19.22.111", 8888);
		System.out.println("链接到服务器了");
	}

}
