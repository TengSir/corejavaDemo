package com.oracle.corejava.advance.t12;

public enum Week {
	Monday("����һ"),
	Tuesday("���ڶ�");
	
	  Week(String realName){
		  this.chineseName=realName;
		System.out.println("��ʼ����һ��ö�ٶ���");
	}
	
	private String chineseName;

	public String getChineseName() {
		return chineseName;
	}

	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
	
	
	
}
