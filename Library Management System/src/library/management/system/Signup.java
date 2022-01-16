package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Signup extends JFrame implements ActionListener{
	
	private JPanel contentPane;
	private JTextField textfield;
	private JTextField textfield_1;
	private JTextField textfield_2;
	private JTextField textfield_3;
	private JButton b1,b2;
	private JComboBox combobox;
	

	public static void main(String []args) {
		new Signup().setVisible(true);
	}
	
	public Signup() {
		setBounds(600, 250, 606, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.white);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setForeground(Color.DARK_GRAY);
		lblUsername.setFont(new Font("Tahoma" , Font.BOLD, 14));
		lblUsername.setBounds(99, 86, 92, 26);
		contentPane.add(lblUsername);
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setForeground(Color.DARK_GRAY);
		lblName.setFont(new Font("Tahoma" , Font.BOLD, 14));
		lblName.setBounds(99, 123, 92, 26);
		contentPane.add(lblName);

		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setForeground(Color.DARK_GRAY);
		lblPassword.setFont(new Font("Tahoma" , Font.BOLD, 14));
		lblPassword.setBounds(99, 160, 92, 26);
		contentPane.add(lblPassword);

		JLabel lblAnswer = new JLabel("Answer: ");
		lblAnswer.setForeground(Color.DARK_GRAY);
		lblAnswer.setFont(new Font("Tahoma" , Font.BOLD, 14));
		lblAnswer.setBounds(99, 234, 92, 26);
		contentPane.add(lblAnswer);
		
		combobox = new JComboBox();
		combobox.setModel(new DefaultComboBoxModel(new String[] {"Your NickName?", "Your Lucky Number?",
																"Your Child SuperHero?","Your Childhood Name?"}));
		combobox.setBounds(265, 202, 148, 20);
		contentPane.add(combobox);
		
		JLabel lblSecurityQuestion = new JLabel("Security Question :");
		lblSecurityQuestion.setForeground(Color.DARK_GRAY);
		lblSecurityQuestion.setFont(new Font("Tahoma",Font.BOLD, 14));
		lblSecurityQuestion.setBounds(99, 197, 140, 26);
		contentPane.add(lblSecurityQuestion);
	
		textfield = new JTextField();
		textfield.setBounds(265, 91, 148, 20);
		contentPane.add(textfield);
		textfield.setColumns(10);

		textfield_1 = new JTextField();
		textfield_1.setBounds(265, 128, 148, 20);
		textfield_1.setColumns(10);
		contentPane.add(textfield_1);

		textfield_2 = new JTextField();
		textfield_2.setBounds(265, 165, 148, 20);
		contentPane.add(textfield_2);
		textfield_2.setColumns(10);

		textfield_3 = new JTextField();
		textfield_3.setBounds(265, 239, 148, 20);
		contentPane.add(textfield_3);
		textfield_3.setColumns(10);
		
		b1 = new JButton("Create ");
		b1.addActionListener(this);
		b1.setFont(new Font("Tahoma", Font.BOLD,13));
		b1.setBounds(140, 289, 100, 30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		contentPane.add(b1);

		b2 = new JButton("Back ");
		b2.addActionListener(this);
		b2.setFont(new Font("Tahoma", Font.BOLD,13));
		b2.setBounds(300, 289, 100, 30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		contentPane.add(b2);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(34, 139, 34));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 0), 2), "Create Account",
														TitledBorder.LEADING, TitledBorder.TOP,null, new Color(34, 139, 34)));
		panel.setBounds(31, 46, 476, 296);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			Conn con = new Conn();
			
			if(e.getSource() == b1) {
				String sql = "insert into account(username, name, password, sec_q, sec_ans) values(?, ?, ?, ?, ?)";
				PreparedStatement st = con.c.prepareStatement(sql);
			
				st.setString(1, textfield.getText());
				st.setString(2, textfield_1.getText());
				st.setString(3, textfield_2.getText());
				st.setString(4, (String) combobox.getSelectedItem());
				st.setString(5, textfield_3.getText());
			
				int i = st.executeUpdate();
				if(i > 0) {
					JOptionPane.showMessageDialog(null, "Successfully Created");
				}
			
				textfield.setText("");
				textfield_1.setText("");
				textfield_2.setText("");
				textfield_3.setText("");
		
			}
			if(e.getSource() == b2) {
				this.setVisible(false);
				new login_user().setVisible(true);
			}
			
			
		}catch(Exception e1) {
			
		}
		
	}
}
