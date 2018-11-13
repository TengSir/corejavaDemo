package com.oracle.corejava.advance.swing;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

//���swing��ò��÷�װ�ķ�ʽ����ƽ��� is-a

//1.����һ������ü̳еķ�ʽ�̳�һ��������������Ƴ�����Ĵ��ڣ�
//2.һ��Ĵ��ڶ���������һЩ�����Ĳ�������jvm֪�������Ⱦ����ʾ���������
public class LoginFrame extends JFrame{
	//has-a �����涨�嶨���ԣ��������Ͷ���������has-a��
	private JLabel  usernameLabel,passwordLabel;
	private JTextField  username;
	private JPasswordField  password;
	private JButton  loginButton,registerButton;
	private JCheckBox  rememberPassword;
	private JRadioButton  autoLogin,notAutoLogin;
	private JToggleButton  statusButton;
	public LoginFrame() {
		//һ����˵���ڵ���ʾ�������ڹ�����������
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);//���ô��ڵ����λ�þ���
		this.setVisible(true);
		this.setLayout(null);//���ÿղ��֣����Զ�λ���֣�
		this.setTitle("ĬĬ-��½");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���jframe�ر�ʱ�˳�������������ش���
		
		//�ڴ��ڳ�ʼ�����֮����ó�ʼ������������������Ⱦ��������ʾ������
		initComponent();
		this.paintComponents(this.getGraphics());//����������֮��ִ�д�����Ⱦ
		
	}
	/**
	 * ��ʼ�����������
	 */
	public void initComponent() {
		usernameLabel=new JLabel("ĬĬ�˺ţ�");
		usernameLabel.setBounds(100, 50, 80, 20);
		this.add(usernameLabel);//����������ӵ���������
		
		username=new JTextField();
		username.setBounds(200, 50, 160, 20);
		this.add(username);
		
		passwordLabel=new JLabel("ĬĬ���룺");
		passwordLabel.setBounds(100, 90, 80, 20);
		this.add(passwordLabel);//����������ӵ���������
		
		password=new JPasswordField();
		password.setBounds(200, 90, 160, 20);
		this.add(password);
		
		loginButton =new JButton("��½");
		loginButton.setBounds(130, 150, 60, 20);
		this.add(loginButton);
		
		registerButton =new JButton("ע��");
		registerButton.setBounds(210, 150, 60, 20);
		this.add(registerButton);
		
		rememberPassword=new JCheckBox("��ס����");
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
