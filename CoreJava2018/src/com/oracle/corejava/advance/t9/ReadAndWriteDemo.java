package com.oracle.corejava.advance.t9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWriteDemo {

	public static void main(String[] args) {
		try {
			//完整的文件读写案例（复制文件）
			File  source=new File("files/1.txt");
			File  dest=new File("files/3.txt");
			
			FileInputStream  in=new FileInputStream(source);
			FileOutputStream  out=new FileOutputStream(dest,true);
			byte[] bs=new byte[1000];
			int length;
			while((length=in.read(bs))!=-1) {
				out.write(bs,0,length);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
