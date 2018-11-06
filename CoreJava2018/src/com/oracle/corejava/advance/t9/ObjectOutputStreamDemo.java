package com.oracle.corejava.advance.t9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamDemo {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		/**
		 * 序列化相当于将内存中的对象存储到磁盘上一个文件中
		 */
		FileOutputStream  FOUT=new FileOutputStream("files/1.data");
		ObjectOutputStream  out=new ObjectOutputStream(FOUT);//序列化流(内存中数据到磁盘)
		DownloadTask  task=new DownloadTask("winrar.exe", "htpp:xxx/wsdf/s/sd", 129293323L, "201812121212", 1231231, "C:/TDownload");
		Author  a=new Author();
		a.setAge(23);
		task.setAuth(a);
		out.writeObject(task);
		out.flush();
		out.close();
		/**
		 * 反序列化就是讲磁盘中之前保存的一个对象读取到内存中
		 */
//		ObjectInputStream  in=new ObjectInputStream(new FileInputStream("files/1.data"));
//		DownloadTask  t=(DownloadTask)in.readObject();
//		System.out.println(t);
		
	}

}
class Author implements Serializable{
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String username;
	private String sex;
	private int age;
}
class DownloadTask  implements Serializable{
	
	
	public Author getAuth() {
		return auth;
	}
	public void setAuth(Author auth) {
		this.auth = auth;
	}
	public DownloadTask(String filename, String url) {
		super();
		this.filename = filename;
		this.url = url;
	}
	private Author  auth;
	private String filename;
	private String url;
	private long size;
	private String startDoloadTime;
	private long downloadSize;
	private transient String savePath ;
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public String getStartDoloadTime() {
		return startDoloadTime;
	}
	public void setStartDoloadTime(String startDoloadTime) {
		this.startDoloadTime = startDoloadTime;
	}
	public long getDownloadSize() {
		return downloadSize;
	}
	public void setDownloadSize(long downloadSize) {
		this.downloadSize = downloadSize;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	@Override
	public String toString() {
		return "DownloadTask [filename=" + filename + ", url=" + url + ", size=" + size + ", startDoloadTime="
				+ startDoloadTime + ", downloadSize=" + downloadSize + ", savePath=" + savePath + "]";
	}
	public DownloadTask(String filename, String url, long size, String startDoloadTime, long downloadSize,
			String savePath) {
		super();
		this.filename = filename;
		this.url = url;
		this.size = size;
		this.startDoloadTime = startDoloadTime;
		this.downloadSize = downloadSize;
		this.savePath = savePath;
	}
	public DownloadTask() {
		super();
	}
	
}