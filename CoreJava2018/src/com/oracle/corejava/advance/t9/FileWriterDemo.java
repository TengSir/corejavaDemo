package com.oracle.corejava.advance.t9;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileWriterDemo {

	
	public static void main(String[] args)  throws Exception{
		
		
		
//		FileWriter writer=new FileWriter("files/test.txt");
//		
//		writer.write("ÄãºÃ£¬²âÊÔÎÄ×Ö");
//		writer.close();
		
//		FileReader reader=new FileReader("files/test.txt");
//		char[]  cs=new char[10];
//		int len;
//		while((len=reader.read(cs))!=-1) {
//			System.out.println(new String(cs));
//		}
//		
		//word .doc
		System.out.println("----------------------------");
		FileInputStream  in=new FileInputStream("files/test.txt");
		
		InputStreamReader  inputReader=new InputStreamReader(in);
		char[]  cs=new char[10];
		int len;
		while((len=inputReader.read(cs))!=-1) {
			System.out.println(new String(cs));
		}
	}
}
