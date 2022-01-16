package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class ReturnBook extends JFrame implements ActionListener{
	private JPanel contentpane;
	private JTextField t1,t2,t3,t4,t5,t6,t7;
	private JButton b1,b2,b3;
	private JDateChooser datechooser;
	
	public static void main(String []args) {
		new ReturnBook().setVisible(true);
	}
	
	public void delete() {
		try {
			Conn con = new Conn();
			String sql = "delete from issueBook where book_id = ?";
			PreparedStatement st = con.c.prepareStatement(sql);
			st.setString(1, t1.getText());
			int i = st.executeUpdate();
			if(i>0) {
				JOptionPane.showConfirmDialog(null,"Book Returned");
			}
			else {
				JOptionPane.showConfirmDialog(null, "Error i deleting");
			}
		}catch(SQLException e) {
			JOptionPane.showConfirmDialog(null, e);
			e.printStackTrace();
		}
	}
	
	public ReturnBook() {
		setBounds(450, 300, 617, 363);
		contentpane = new JPanel();
		contentpane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentpane);
		contentpane.setBackground(Color.WHITE);
		contentpane.setLayout(null);
	
		JLabel l1 = new JLabel("Book_id");
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		l1.setForeground(new Color(0, 0, 0));
		l1.setBounds(52, 52, 87, 24);
		contentpane.add(l1);
	
		JLabel l2 = new JLabel("Student_id");
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		l2.setForeground(Color.BLACK);
		l2.setBounds(243, 52, 87, 24);
		contentpane.add(l2);
	
		JLabel l3 = new JLabel("Book");
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		l3.setForeground(Color.BLACK);
		l3.setBounds(52, 98, 71, 24);
		contentpane.add(l3);
	
		JLabel l4 = new JLabel("Name");
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		l4.setForeground(Color.BLACK);
		l4.setBounds(300, 98, 71, 24);
		contentpane.add(l4);
	
		JLabel l5 = new JLabel("Course");
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));
		l5.setForeground(Color.BLACK);
		l5.setBounds(303, 144, 68, 24);
		contentpane.add(l5);
	
		JLabel l6 = new JLabel("Date of Issue");
		l6.setFont(new Font("Tahoma", Font.BOLD, 14));
		l6.setForeground(Color.BLACK);
		l6.setBounds(52, 188, 105, 29);
		contentpane.add(l6);

		JLabel l7 = new JLabel("Date of Return");
		l7.setFont(new Font("Tahoma", Font.BOLD, 14));
		l7.setForeground(Color.BLACK);
		l7.setBounds(52, 234, 118, 29);
		contentpane.add(l7);
		
		t1 = new JTextField();
		t1.setForeground(new Color(105, 105, 105));
		t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t1.setBounds(128, 56, 105, 20);
		contentpane.add(t1);
		t1.setColumns(10);
		
		b1 = new JButton("Search");
		b1.addActionListener(this);
		b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		b1.setBounds(443, 52, 105, 29);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		contentpane.add(b1);
		
		t2 = new JTextField();
		t2.setEditable(false);
		t2.setForeground(new Color(0, 100, 0));
		t2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		t2.setBounds(340, 56, 93, 20);
		contentpane.add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setEditable(false);
		t3.setForeground(new Color(0, 100, 0));
		t3.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		t3.setBounds(128, 102, 162, 20);
		contentpane.add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setDragEnabled(false);
		t4.setForeground(new Color(0, 100, 0));
		t4.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		t4.setBounds(369, 102, 179, 20);
		contentpane.add(t4);
		t4.setColumns(10);
		
		t5 = new JTextField();
		t5.setDragEnabled(false);
		t5.setForeground(new Color(0, 100, 0));
		t5.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		t5.setBounds(369, 147, 179, 20);
		contentpane.add(t5);
		t5.setColumns(10);
		
		t6 = new JTextField();
		t6.setDragEnabled(false);
		t6.setForeground(new Color(0, 100, 0));
		t6.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		t6.setBounds(167, 194, 162, 20);
		contentpane.add(t6);
		t6.setColumns(10);
		
		datechooser = new JDateChooser();
		datechooser.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		datechooser.setBounds(167, 234, 172, 29);
		contentpane.add(datechooser);
		
		b2 = new JButton("Return");
		b2.addActionListener(this);
		b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		b2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		b2.setBounds(369, 179, 149, 30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		contentpane.add(b2);
	
		contentpane.add(b2);
		
		b3 = new JButton("Return");
		b3.addActionListener(this);
		b3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		b3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		b3.setBounds(369, 231, 149, 30);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		contentpane.add(b3);
	
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 69, 0), 2, true), "Return-Book",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(220, 20, 60)));
		panel_1.setBounds(10, 24, 569, 269);
		panel_1.setBackground(Color.WHITE);
		contentpane.add(panel_1);
	}
	public void actionPerformed(ActionEvent ae) {
		try {
			Conn con = new Conn();
			if(ae.getSource() == b1) {
				String sql = "select * from issuebook where student_id = ? and book_id = ?";
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1, t1.getText());
				st.setString(2, t1.getText());
				ResultSet rs = st.executeQuery();
				
				while(rs.next()) {
					t2.setText(rs.getNString("bname"));
					t3.setText(rs.getString("sname"));
					t4.setText(rs.getString("course"));
					t5.setText(rs.getString("branch"));
					t6.setText(rs.getString("dateOfIssue"));
				}
				st.close();
				rs.close();
			}
			if(ae.getSource() == b2) {
				String sql = "insert inti returnBook(book_id, student_id, bname, sname,course,branch,dateOfIssue,dateOfReturn) values(?, ?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1, t1.getText());
				st.setString(2, t2.getText());
				st.setString(3, t3.getText());
				st.setString(4, t4.getText());
				st.setString(5, t5.getText());
				st.setString(6, t6.getText());
				st.setString(7, t7.getText());
				
				st.setString(8,  ((JTextField) datechooser.getDateEditor().getUiComponent()).getText());
				
				int i = st.executeUpdate();
				if(i > 0) {
					JOptionPane.showConfirmDialog(null, "Processing");
					delete();
				}
				else {
					JOptionPane.showConfirmDialog(null, "error");
				}
			}
			if(ae.getSource() == b3) {
				this.setVisible(false);
				new Home().setVisible(true);
			}
		}catch(Exception e) {
			
		}
	}
}
