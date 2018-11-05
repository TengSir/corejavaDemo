package com.oracle.corejava.advance.t9;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamDemo {

	public static void main(String[] args) {
		try {
			DataOutputStream  out=new DataOutputStream(new FileOutputStream("files/333.txt"));
			out.writeChar(97);
			out.writeInt(123);
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
