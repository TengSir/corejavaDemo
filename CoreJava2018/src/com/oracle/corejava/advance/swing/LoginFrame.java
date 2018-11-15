package com.oracle.corejava.advance.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
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
	private MyMouseLisener  allMouseListener;
	public LoginFrame() {
		//һ����˵���ڵ���ʾ�������ڹ�����������
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);//���ô��ڵ����λ�þ���
		this.setVisible(true);
		//���е��������ò��ֵķ�������setlayout()
		//JFrameĬ����borderlayout������Ϊborderlayout����������ֻ�����������
		this.setLayout(null);//���ÿղ��֣����Զ�λ���֣�AbsoluteLayout���Զ�λ����
		this.setTitle("ĬĬ-��½");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���jframe�ر�ʱ�˳�������������ش���
//		
		allMouseListener=new MyMouseLisener();
//		JPanel  topPanel=new JPanel();
//		JButton  leftButton=new JButton("<");
//		topPanel.add(leftButton);
//		
//		topPanel.setBorder(BorderFactory.createLineBorder(Color.red));
//		this.add(topPanel, BorderLayout.NORTH);
//		
//		JPanel  leftPanel=new JPanel();
//		leftPanel.setBackground(Color.blue);
//		this.add(leftPanel, BorderLayout.WEST);
//		
//		JPanel  bottomPanel=new JPanel();
//		
//		bottomPanel.setLayout(new BoxLayout(bottomPanel,BoxLayout.X_AXIS));
//		//JPanel ��Ĭ�ϲ��־���flowLayout
//		for(int n=0;n<10;n++) {
//		JButton  dir1=new JButton("films"+n);
//		bottomPanel.add(dir1);
//		}
//		bottomPanel.setBorder(BorderFactory.createLineBorder(Color.pink));
//		this.add(bottomPanel, BorderLayout.CENTER);
		
		//�ڴ��ڳ�ʼ�����֮����ó�ʼ������������������Ⱦ��������ʾ������
		initComponent();
		this.paintComponents(this.getGraphics());//����������֮��ִ�д�����Ⱦ
		
	}
	/**
	 * ��ʼ�����������
	 */
	public void initComponent() {
		usernameLabel=new JLabel("ĬĬ�˺ţ�");
		usernameLabel.setForeground(Color.green);
		usernameLabel.setBackground(Color.GRAY);
		usernameLabel.setFont(new Font("����", Font.ITALIC, 12));
		usernameLabel.setBounds(100, 50, 80, 20);
		this.add(usernameLabel);//����������ӵ���������
		
		username=new JTextField();
		username.addMouseListener(allMouseListener);
		username.setBounds(200, 50, 160, 20);
		this.add(username);
		
		passwordLabel=new JLabel("ĬĬ���룺");
		passwordLabel.setBounds(100, 90, 80, 20);
		this.add(passwordLabel);//����������ӵ���������
		
		password=new JPasswordField();
		password.setBounds(200, 90, 160, 20);
		this.add(password);
		
		loginButton =new JButton("��½");
		
		//ע�����
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmojiWindow  w=new EmojiWindow();
				LoginFrame.this.dispose();//�ô�����ʧͬʱ�ͷ���Դ
			}
		});
		loginButton.addMouseListener(allMouseListener);
		loginButton.setBounds(130, 150, 60, 20);
		this.add(loginButton);
		
		registerButton =new JButton("ע��");
		registerButton.addMouseListener(allMouseListener );
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
	//ר�Ŷ���һ���࣬�����ʵ�ּ����ӿڣ�������д�����¼�����֮���Ӧ�Ĵ���
	class  ButtonListener implements  ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("������˵�½��ť");
		}
	}
	
	class MyMouseLisener extends MouseAdapter{
		public void mouseEntered(MouseEvent e) {
			if(e.getSource()==loginButton) {
				loginButton.setForeground(Color.red);
			}else if(e.getSource()==registerButton) {
				registerButton.setForeground(Color.green);
			}else if(e.getSource()==username) {
				username.setBorder(BorderFactory.createLineBorder(Color.RED));
			}
		}
		public void mouseExited(MouseEvent e) {
			if(e.getSource()==loginButton) {
				loginButton.setForeground(Color.black);
			}else if(e.getSource()==registerButton) {
				registerButton.setForeground(Color.black);
			}else if(e.getSource()==username) {
				username.setBorder(BorderFactory.createLineBorder(new Color(178,178,178)));
			}
		}
	}
	

}


