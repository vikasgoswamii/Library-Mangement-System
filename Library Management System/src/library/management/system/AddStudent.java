package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddStudent extends JFrame implements ActionListener{
	private JPanel contentPane;
	private JTextField t1,t2,t3;
	private JButton b1,b2;
	JComboBox comboBox1,comboBox2,comboBox3,comboBox4;
	
	public static void main(String args[]) {
		new AddStudent().setVisible(true);
	}
	
	public void random() {
		Random ran = new Random();
		t1.setText("" + ran.nextInt(1000 + 1));
	}
	
	public AddStudent() {
		super("AddStudent");
		setBounds(700, 200, 550, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Student_id");
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		l1.setBounds(64, 63, 102, 22);
		l1.setForeground(new Color(25, 25, 112));
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Name");
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		l2.setBounds(64, 97, 102, 22);
		l2.setForeground(new Color(25, 25, 112));
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("Father's Name");
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		l3.setBounds(64, 130, 102, 22);
		l3.setForeground(new Color(25, 25, 112));
		contentPane.add(l3);
		
		JLabel l4 = new JLabel("Branch");
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		l4.setBounds(64, 209, 102, 22);
		l4.setForeground(new Color(25, 25, 112));
		contentPane.add(l4);
		
		JLabel l5 = new JLabel("Year");
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));
		l5.setBounds(64, 242, 102, 22);
		l5.setForeground(new Color(25, 25, 112));
		contentPane.add(l5);
	
		JLabel l6 = new JLabel("Semester");
		l6.setFont(new Font("Tahoma", Font.BOLD, 14));
		l6.setBounds(64, 275, 102, 22);
		l6.setForeground(new Color(25, 25, 112));
		contentPane.add(l6);
		
		t1 = new JTextField();
		t1.setEditable(false);
		t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t1.setForeground(new Color(47, 79, 79));
		t1.setBounds(174, 66, 156, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t2.setForeground(new Color(47, 79, 79));
		t2.setBounds(174, 100, 156, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t3.setForeground(new Color(47, 79, 79));
		t3.setBounds(174, 133, 156, 20);
		contentPane.add(t3);
		t3.setColumns(10);
		
		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Mechanical", "CSE", "IT", "civil", "Automobile", "EEE", "Other"}));
		comboBox1.setForeground(new Color(47, 79, 79));
		comboBox1.setFont(new Font("Trebuchet MS",Font.BOLD,14));
		comboBox1.setBounds(176, 211, 154, 20);
		contentPane.add(comboBox1);
	
		comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"First", "Second", "Third", "Fourth"}));
		comboBox2.setForeground(new Color(47, 79, 79));
		comboBox2.setFont(new Font("Trebuchet MS",Font.BOLD,14));
		comboBox2.setBounds(176, 244, 154, 20);
		contentPane.add(comboBox2);
		
		comboBox3 = new JComboBox();
		comboBox3.setModel(new DefaultComboBoxModel(new String[] {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th","8th"}));
		comboBox3.setForeground(new Color(47, 79, 79));
		comboBox3.setFont(new Font("Trebuchet MS",Font.BOLD,14));
		comboBox3.setBounds(176, 277, 154, 20);
		contentPane.add(comboBox3);	
		
		b1 = new JButton("ADD");
		b1.addActionListener(this);
		b1.setBounds(64, 321, 111, 33);
		b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		contentPane.add(b1);
		
		b2 = new JButton("BACK");
		b2.addActionListener(this);
		b2.setBounds(198, 321, 111, 33);
		b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		contentPane.add(b2);
		
		JLabel l7 = new JLabel("Course");
		l7.setForeground(new Color(25, 25, 112));
		l7.setFont(new Font("Tahoma", Font.BOLD, 14));
		l7.setBounds(64, 173, 102, 22);
		contentPane.add(l7);
		
		comboBox4 = new JComboBox();
		comboBox4.setModel(new DefaultComboBoxModel(new String[] {"B.E", "B.Tech", "M.Tech", "MBA", "BBA", "BCA", "B.Sc","M.Sc"}));
		comboBox4.setForeground(new Color(47, 79, 79));
		comboBox4.setFont(new Font("Trebuchet MS",Font.BOLD,14));
		comboBox4.setBounds(176, 176, 154, 20);
		contentPane.add(comboBox4);
	
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 2, true), "Add Student",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(10, 38, 358, 348);
		
		contentPane.setBackground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		
		contentPane.add(panel);
		random();
	}
	
	public void actionPerformed(ActionEvent ae) {
		try {
			if(ae.getSource() == b1) {
				try {
					Conn con = new Conn();
					String sql = "insert into student(student_id, name, father, course, branch, year, semester) values(?, ?, ?, ?, ?, ?, ?)";
					PreparedStatement st = con.c.prepareStatement(sql);
					st.setString(1, t1.getText());
					st.setString(2, t2.getText());
					st.setString(3, t3.getText());
					st.setString(4, (String)comboBox4.getSelectedItem());
					st.setString(5, (String)comboBox1.getSelectedItem());
					st.setString(6, (String)comboBox2.getSelectedItem());
					st.setString(7, (String)comboBox3.getSelectedItem());
					
					int i = st.executeUpdate();
					if(i > 0) {
						JOptionPane.showInternalMessageDialog(null, "SuccessFully Added");
						this.setVisible(false);
						new Home().setVisible(true);
					}
					else {
						JOptionPane.showInternalMessageDialog(null, "Error");
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			if(ae.getSource() == b2) {
				this.setVisible(false);
				new Home().setVisible(true);
			}
		}catch(Exception e) {
			
		}
	}	
}
