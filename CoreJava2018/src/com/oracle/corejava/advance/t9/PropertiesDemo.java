package com.oracle.corejava.advance.t9;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args)  throws Exception{
		System.out.println("sss");
		Properties  p=new Properties();
		p.load(new FileInputStream("db.properties"));
		
		for(Object key:p.keySet()) {
			System.out.println("key:"+key+"\t\tvalue:"+p.get(key));
		}
	}
}
