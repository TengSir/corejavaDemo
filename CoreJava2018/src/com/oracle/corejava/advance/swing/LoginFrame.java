package com.oracle.corejava.advance.swing;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

//设计swing最好采用封装的方式来设计界面 is-a

//1.定以一个类采用继承的方式继承一个顶级容器（设计出程序的窗口）
//2.一般的窗口都必须设置一些基本的参数来让jvm知道如何渲染（显示）这个窗口
public class LoginFrame extends JFrame{
	//has-a 类里面定义定属性（其他类型定对象表达是has-a）
	private JLabel  usernameLabel,passwordLabel;
	private JTextField  username;
	private JPasswordField  password;
	private JButton  loginButton,registerButton;
	private JCheckBox  rememberPassword;
	private JRadioButton  autoLogin,notAutoLogin;
	private JToggleButton  statusButton;
	public LoginFrame() {
		//一般来说窗口的显示参数都在构造器里设置
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);//设置窗口的相对位置剧中
		this.setVisible(true);
		this.setLayout(null);//设置空布局（绝对定位布局）
		this.setTitle("默默-登陆");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设计jframe关闭时退出程序而不是隐藏窗口
		
		//在窗口初始化完毕之后调用初始化组件定方法让组件渲染出来（显示出来）
		initComponent();
		this.paintComponents(this.getGraphics());//组件家在完毕之后，执行窗口渲染
		
	}
	/**
	 * 初始化组件定方法
	 */
	public void initComponent() {
		usernameLabel=new JLabel("默默账号：");
		usernameLabel.setBounds(100, 50, 80, 20);
		this.add(usernameLabel);//将这个组件添加到主窗口上
		
		username=new JTextField();
		username.setBounds(200, 50, 160, 20);
		this.add(username);
		
		passwordLabel=new JLabel("默默密码：");
		passwordLabel.setBounds(100, 90, 80, 20);
		this.add(passwordLabel);//将这个组件添加到主窗口上
		
		password=new JPasswordField();
		password.setBounds(200, 90, 160, 20);
		this.add(password);
		
		loginButton =new JButton("登陆");
		loginButton.setBounds(130, 150, 60, 20);
		this.add(loginButton);
		
		registerButton =new JButton("注册");
		registerButton.setBounds(210, 150, 60, 20);
		this.add(registerButton);
		
		rememberPassword=new JCheckBox("记住密码");
		rememberPassword.setBounds(10, 190, 100, 20);
		this.add(rememberPassword);
		
		autoLogin=new JRadioButton("auto");
		autoLogin.setBounds(10,210, 60, 20);
		this.add(autoLogin);
		notAutoLogin=new JRadioButton("auto");
		notAutoLogin.setBounds(90,210, 60, 20);
		this.add(notAutoLogin);
		
		statusButton=new JToggleButton("rem");
		statusButton.setBounds(10, 250, 100, 20);
		this.add(statusButton);
		
		
	}
	
	public static void main(String[] args) {
		
		LoginFrame  f=new LoginFrame();
	}

}
