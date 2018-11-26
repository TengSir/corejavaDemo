package com.oracle.corejava.advance.swing;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class EmojiWindow extends JWindow {
	private  JLabel  closeButton;
	private int lastX,lastY,nowX,nowY;

	public EmojiWindow() {
		this.setSize(500,400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setLayout(null);
		
		this.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println(nowX+","+nowY+"---"+lastX+","+lastY);
				nowX=e.getXOnScreen();
				nowY=e.getYOnScreen();
				EmojiWindow.this.setLocation(EmojiWindow.this.getX()+(nowX-lastX), EmojiWindow.this.getY()+(nowY-lastY));
				lastX=e.getXOnScreen();
				lastY=e.getYOnScreen();
			}
		});
		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				lastX=e.getXOnScreen();
				lastY=e.getYOnScreen();
			}
		});
		
		closeButton=new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().createImage("close.png").getScaledInstance(12, 12, Image.SCALE_DEFAULT)));
		closeButton.setBounds(10, 10, 12, 12);
		closeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.add(closeButton);
		this.paintComponents(getGraphics());
	}

	public static void main(String[] args) {
		EmojiWindow  w=new EmojiWindow();
		
	}
}