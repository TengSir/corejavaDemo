package com.oracle.corejava.advance.t9;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {
	
	public static void main(String[] args) throws Exception {
		//带有buffer的流都是缓存流，会利用内存暂存数据
		FileOutputStream  fout=new FileOutputStream("files/444.txt");
		BufferedOutputStream  out=new BufferedOutputStream(fout);
		int  count=0;
		for(int n=97;n<97+26;n++) {
//			Thread.sleep(500);
			
			out.write(n);//out方法执行完之后并不会立马将数据写入文件，先放入内存的一块缓存中，等到后期调用或者close时再写入文件
			count++;
			if(count==10) {
				out.flush();
				count=0;
				System.out.println("到达十个单位，清空一下");
			}
		}
		
		out.close();
		
		//节点流属于低级流不具备更高级的特性，所以该流不能缓存数据，write会立马将数据写入文件
//		FileOutputStream  fout=new FileOutputStream("files/444.txt");
//		for(int n=97;n<97+26;n++) {
//			Thread.sleep(500);
//			fout.write(n);//out方法执行完之后并不会立马将数据写入文件，先放入内存的一块缓存中，等到后期调用flush或者close时再写入文件
//		}
		
	}

}
