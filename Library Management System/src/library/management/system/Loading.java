package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable{
	
	private JPanel contentPane;
	private JProgressBar progressBar;
	Connection conn;
	int s;
	Thread th;//thread class Object
	
	public static void main(String []args) {
		new Loading().setVisible(true);
	}
	
	public void setUploading() {
		setVisible(false);
		th.start();//start processing the thread
	}
	
	public void run() {
		try {
			for(int i=0;i<200;i++) {//we set the value 200 for processing and fetch the data from databases
				s = s + 1;
				int m = progressBar.getMaximum();
				int v = progressBar.getValue();
				if(v < m) {
					progressBar.setValue(progressBar.getValue() + 1);
				}
				else {
					i = 201;//open the home window
					setVisible(false);
					new Home().setVisible(true);
				}
				Thread.sleep(50);//make the thread stoppable
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Loading() {
		
		super("Loading");
		th = new Thread((Runnable) this);//object the thread class
		
		setBounds(600, 300, 600, 400);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbllibraryManagement = new JLabel("Smart Library Library v5.0");
		lbllibraryManagement.setForeground(new Color(72, 209, 204));
		lbllibraryManagement.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		lbllibraryManagement.setBounds(110, 46, 500, 35);
		contentPane.add(lbllibraryManagement);
		
		progressBar = new JProgressBar();
		progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
		progressBar.setBounds(130, 135, 300, 25);
		contentPane.add(progressBar);
		
		JLabel lblNewlabel_2 = new JLabel("Please Wait...");
		lblNewlabel_2.setFont(new Font("yu Gothic UI Semibold", Font.BOLD, 20));
		lblNewlabel_2.setForeground(new Color(160, 82, 45));
		lblNewlabel_2.setBounds(200, 165, 150, 20);
		contentPane.add(lblNewlabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 590, 390);
		contentPane.add(panel);
		
		setUploading();
	}
	
}
