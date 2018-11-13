package com.oracle.corejava.advance.swing;

import javax.swing.JWindow;

public class EmojiWindow extends JWindow {

	public EmojiWindow() {
		this.setSize(500,400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		EmojiWindow  w=new EmojiWindow();
		
	}

}
