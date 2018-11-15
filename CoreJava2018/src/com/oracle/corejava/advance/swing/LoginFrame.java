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
	private MyMouseLisener  allMouseListener;
	public LoginFrame() {
		//一般来说窗口的显示参数都在构造器里设置
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);//设置窗口的相对位置剧中
		this.setVisible(true);
		//所有的容器设置布局的方法都是setlayout()
		//JFrame默认是borderlayout，设置为borderlayout的容器窗口只分了五块区域，
		this.setLayout(null);//设置空布局（绝对定位布局）AbsoluteLayout绝对定位布局
		this.setTitle("默默-登陆");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设计jframe关闭时退出程序而不是隐藏窗口
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
//		//JPanel 的默认布局就是flowLayout
//		for(int n=0;n<10;n++) {
//		JButton  dir1=new JButton("films"+n);
//		bottomPanel.add(dir1);
//		}
//		bottomPanel.setBorder(BorderFactory.createLineBorder(Color.pink));
//		this.add(bottomPanel, BorderLayout.CENTER);
		
		//在窗口初始化完毕之后调用初始化组件定方法让组件渲染出来（显示出来）
		initComponent();
		this.paintComponents(this.getGraphics());//组件家在完毕之后，执行窗口渲染
		
	}
	/**
	 * 初始化组件定方法
	 */
	public void initComponent() {
		usernameLabel=new JLabel("默默账号：");
		usernameLabel.setForeground(Color.green);
		usernameLabel.setBackground(Color.GRAY);
		usernameLabel.setFont(new Font("宋体", Font.ITALIC, 12));
		usernameLabel.setBounds(100, 50, 80, 20);
		this.add(usernameLabel);//将这个组件添加到主窗口上
		
		username=new JTextField();
		username.addMouseListener(allMouseListener);
		username.setBounds(200, 50, 160, 20);
		this.add(username);
		
		passwordLabel=new JLabel("默默密码：");
		passwordLabel.setBounds(100, 90, 80, 20);
		this.add(passwordLabel);//将这个组件添加到主窗口上
		
		password=new JPasswordField();
		password.setBounds(200, 90, 160, 20);
		this.add(password);
		
		loginButton =new JButton("登陆");
		
		//注册监听
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmojiWindow  w=new EmojiWindow();
				LoginFrame.this.dispose();//让窗口消失同时释放资源
			}
		});
		loginButton.addMouseListener(allMouseListener);
		loginButton.setBounds(130, 150, 60, 20);
		this.add(loginButton);
		
		registerButton =new JButton("注册");
		registerButton.addMouseListener(allMouseListener );
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
	//专门定义一个类，这个类实现监听接口，里面书写监听事件发生之后对应的代码
	class  ButtonListener implements  ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("您点击了登陆按钮");
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


