package com.oracle.corejava.advance.t12;

public enum Week {
	Monday("星期一"),
	Tuesday("星期二");
	
	  Week(String realName){
		  this.chineseName=realName;
		System.out.println("初始化了一个枚举对象");
	}
	
	private String chineseName;

	public String getChineseName() {
		return chineseName;
	}

	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
	
	
	
}
