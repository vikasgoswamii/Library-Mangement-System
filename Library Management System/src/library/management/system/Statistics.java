package library.management.system;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class Statistics extends JFrame{
	private JPanel contentpane;
	private JTable table;
	private JTable table1;
	
	public static void main(String []args) {
		new Statistics().setVisible(true);
	}
	
	public void issueBook() {
		try {
			Conn con = new Conn();
			String sql = "select * from issueBook";
			PreparedStatement st = con.c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e) {
			
		}
	}
	
	public void returnBook() {
		try {
			Conn con = new Conn();
			String sql = "select * from retrunBook";
			PreparedStatement st = con.c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			table1.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e) {
			
		}
	}
	public Statistics() {
		setBounds(400, 200, 810, 594);
		contentpane = new JPanel();
		contentpane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentpane);
		contentpane.setBackground(Color.WHITE);
		contentpane.setLayout(null);
		
		JScrollPane scrollpane = new JScrollPane();
		scrollpane.setBounds(40, 51, 708, 217);
		contentpane.add(scrollpane);
		
		table = new JTable();
		table.setBackground(new Color(224, 255, 255));
		table.setForeground(new Color(128, 128, 0));
		table.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		scrollpane.setViewportView(table);
	
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 2, true), "Issue-Book-Details",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel.setForeground(new Color(0, 128, 128));
		panel.setBounds(26, 36, 737, 240);
		panel.setBackground(Color.WHITE);
		contentpane.add(panel);
		
		JLabel l1 = new JLabel("Back");
		l1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				Home home = new Home();
				home.setVisible(true);
			}
		});
	
		l1.setForeground(new Color(204, 0, 102));
		l1.setFont(new Font("Tahoma", Font.BOLD,18));
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/tenth.png"));
		Image i2 = i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);		
		ImageIcon i3 = new ImageIcon(i2);
		l1.setIcon(i3);
		l1.setBounds(690, 13, 96, 27);
		contentpane.add(l1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 316, 717, 217);
		contentpane.add(scrollPane);
		
		table1 = new JTable();
		table1.setBackground(new Color(204, 255, 255));
		table1.setForeground(new Color(153, 51, 0));
		table1.setFont(new Font("Sitka small",Font.BOLD,12));
		scrollPane.setViewportView(table1);
	
		JPanel panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(new LineBorder(new Color(0, 204, 153), 2, true), "Return-Book-Details",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 102, 51)));
		panel1.setBounds(22, 299, 741, 240);
		panel1.setBackground(Color.WHITE);
		contentpane.add(panel1);
		
		issueBook();
		returnBook();
	
	}
	
}
