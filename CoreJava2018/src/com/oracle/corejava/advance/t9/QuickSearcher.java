package com.oracle.corejava.advance.t9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class QuickSearcher extends JFrame {

//	private Map<String, String> files = new HashMap<String, String>();
//	private StringBuffer  allFiles=new StringBuffer();
	private ArrayList<String>  files=new ArrayList<>();
//	private int allCountOfFiles;
	private String rootPath;
	private JPanel contentPane;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private Panel panel;
	private JButton btnNewButton;
	private Panel panel_1;
	private JMenuBar menuBar;
	private JScrollPane scrollPane;
	private JTextField textField;
	private JTable table;

	private JLabel statusLabel;

	public void initialFilesData() {
		/**
		 * 初始化，准备将磁盘系统全部迭代一遍
		 */
		Timer t = new Timer();
		t.schedule(new TimerTask() {
//			int count=3;
			@Override
			public void run() {
//				statusLabel.setText("parse all directories"+((count==3?"...":((count==2?"..":".")))));
//				statusLabel.setText("parse all directories"+((count==3?"...":((count==2?"..":"."))))+"     "+files.size()+" files was  indexed!");
				statusLabel.setText("Parse all directories" + " \"" + files.size() + "\" files was  indexed!");
//				if(count==3) {count=1;}else {
//					count++;
//				}
			}
		}, 0, 1000);
		rootPath = "/Users";
		long startTime=new Date().getTime();
		listChlidsOfDir(rootPath);
		System.out.println(files.size());

		t.cancel();
		
		long endTime=new Date().getTime();
		statusLabel.setText("After "+(endTime-startTime)/1000+" seconds, "+files.size() + " files was  indexed!");
	}

	public void listChlidsOfDir(String path) {
		File dir = new File(path);
		File[] childs = dir.listFiles();
		try {
			for (File f : childs) {
				files.add(f.getAbsolutePath());
				if (f.isDirectory()) {
					listChlidsOfDir(f.getAbsolutePath());
				} 
			}
		} catch (Exception e) {
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuickSearcher frame = new QuickSearcher();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuickSearcher() {
		setTitle("\u6587\u4EF6\u641C\u7D22\u5668Plus\u7248\u672C");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnNewMenu = new JMenu("\u6587\u4EF6");
		menuBar.add(mnNewMenu);

		mntmNewMenuItem = new JMenuItem("\u5168\u5C40\u641C\u7D22");
		mnNewMenu.add(mntmNewMenuItem);

		mntmNewMenuItem_1 = new JMenuItem("\u6B63\u5219\u6A21\u5F0F");
		mnNewMenu.add(mntmNewMenuItem_1);

		mntmNewMenuItem_2 = new JMenuItem("\u4FDD\u5B58");
		mnNewMenu.add(mntmNewMenuItem_2);

		mntmNewMenuItem_3 = new JMenuItem("\u9000\u51FA");
		mnNewMenu.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new Panel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					startSearch();
				}
			}
		});
		panel.add(textField);
		textField.setColumns(10);

		btnNewButton = new JButton("\u641C\u7D22");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startSearch();
			}
		});
		panel.add(btnNewButton);

		panel_1 = new Panel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		scrollPane.setViewportView(table);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		statusLabel = new JLabel("  ");
		contentPane.add(statusLabel, BorderLayout.SOUTH);
		new Thread() {
			public void run() {
				initialFilesData();
			};
		}.start();
	}
	
	public void startSearch() {
		new Thread() {
			public void run() {
				String searchKey = textField.getText();
				Object[] columnNames = { "Name", "Path" };
				TableModel model = new DefaultTableModel(columnNames, 200);
				table.setModel(model);
				
				int count = 0;
				for (String filePath : files) {
					if (filePath.contains(searchKey) ||filePath.equals(searchKey)) {
//						String text=entry.getValue().replaceAll(searchKey, "<span style=\"color:red\">"+searchKey+"</span>");
						String[] paths=filePath.split("/");
						for(String p:paths) {
							if(p.contains(searchKey)) {
								model.setValueAt(p, count, 0);
								break;
							}
						}
						model.setValueAt(filePath, count, 1);
						count++;
					}
				}
			}
		}.start();
		System.gc();
	}
}
