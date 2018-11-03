package com.oracle.corejava.advance.t9;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File   f=new File("笔记/笔记地址");
		
		File  f1=new File("笔记/笔记地址1");
		
		File  dir=new File("笔记/java笔记/java高级/java前五章");
		
		File  f2=new File(dir,"1.mp3");
		
		dir.mkdirs();
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getPath());
		System.out.println(f.getParent());

		System.out.println(dir.isDirectory());
		System.out.println(f1.isFile());
		System.out.println(f.exists());
		System.out.println(f1.exists());
		System.out.println(f.length());
//		try {
//			f1.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		f1.deleteOnExit();
//		for(int n=0;n<10000;n++){
//			System.out.println("ok");
//		}
	}
}
