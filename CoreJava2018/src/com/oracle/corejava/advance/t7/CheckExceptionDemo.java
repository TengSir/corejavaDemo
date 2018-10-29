package com.oracle.corejava.advance.t7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckExceptionDemo {
	
	public static void main(String[] args) {
		//检查异常（编译器在编译时就需要强制检查这段代码有没有加入异常处理机制）
		//由于外在条件的原因可能会导致程序发生的故障，java语法的监测机制必须要求这种异常在编译时就添加异常处理机制
			try {
				FileInputStream  in=new FileInputStream("作业/作业地址");
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
