package com.oracle.corejava.advance.t9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		
		//java读取刚才files/test.txt内容打印到控制台
		try {
			BufferedWriter writer=new BufferedWriter(new FileWriter("files/aaa.txt"));
			BufferedReader reader=new BufferedReader(new FileReader("files/test.txt"));
			String message;
			int lineNo=1;
			while((message=reader.readLine())!=null) {
			System.out.println(message);
			writer.write(lineNo+"."+message);
			lineNo++;
			writer.newLine();
			}
			writer.flush();
			writer.close();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
