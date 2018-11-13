package com.oracle.corejava.advance.swing;

import javax.swing.JDialog;

public class MessageDialog extends JDialog {

	public MessageDialog() {
		this.setSize(400, 200);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setTitle("Œ¬‹∞Ã· æ");
	}


	public static void main(String[] args) {
		MessageDialog m=new MessageDialog();

	}

}
