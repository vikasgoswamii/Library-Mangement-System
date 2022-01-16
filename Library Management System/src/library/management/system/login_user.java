package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class login_user extends JFrame implements ActionListener{
	
	private JPanel panel;
	private JTextField textField;
	private JPasswordField passwordfield;
	private JButton b1,b2,b3;
	
	public login_user() {
		
		setLayout(null);
		setBackground(new Color(169, 169, 169));//Set background color 
		setBounds(600, 300, 600, 400);//set the frame size
		
		panel = new JPanel();//make a panel which performs like div tag in HTML
		panel.setBackground(new Color(176, 224, 230));
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel l1 = new JLabel("UserName : ");//make a label 
		l1.setBounds(124, 89, 95, 24);
		panel.add(l1);

		JLabel l2 = new JLabel("Password : ");//make a Password label
		l2.setBounds(124, 124, 95, 24);
		panel.add(l2);

		textField = new JTextField();//making the textfield for username
		textField.setBounds(210, 93, 157, 20);
		panel.add(textField);
		
		passwordfield = new JPasswordField();//textfield for password
		passwordfield.setBounds(210, 128, 157, 20);
		panel.add(passwordfield);
		
		/*JLabel l3 = new JLabel("");//
		l3.setBounds(377, 79, 46, 34);
		panel.add(l3);
		
		JLabel l4 = new JLabel("");
		l4.setBounds(377, 124, 46, 34);
		panel.add(l3);*/
		
		b1 = new JButton("Login");//making login button
		b1.addActionListener(this);//set a event of current class
		
		b1.setForeground(new Color(46, 139, 87));
		b1.setBackground(new Color(250, 250, 210));
		b1.setBounds(210, 179, 90, 39);
		panel.add(b1);
		
		b2 = new JButton("SignUp");//making Signup button
		b2.addActionListener(this);
		
		b2.setForeground(new Color(139, 69, 19));
		b2.setBackground(new Color(255, 235, 205));
		b2.setBounds(320, 181, 113, 39);
		panel.add(b2);
		
		b3 = new JButton("Forgot Password");//Button for forget password
		b3.addActionListener(this);
		
		b3.setForeground(new Color(205, 92, 92));
		b3.setBackground(new Color(253, 245, 230));
		b3.setBounds(210, 231, 279, 39);
		panel.add(b3);
		
		JLabel l5 = new JLabel("trouble in Login?");//Making the label for better understanding
		l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l5.setForeground(new Color(255,0,0));
		l5.setBounds(70, 240, 130, 20);
		panel.add(l5);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(176, 224, 230));
		panel2.setBounds(24, 40, 434, 263);
		panel.add(panel2);

	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1) {//event occure 
			Boolean status = false;//Initailly Status
			try {
				Conn con = new Conn();
				String sql = "select * from account where username=? and password=?";
				PreparedStatement st = con.c.prepareStatement(sql);
				
				st.setString(1, textField.getText());//getting the values in the textfield
				st.setString(2, passwordfield.getText());//
				
				ResultSet rs = st.executeQuery();//Retrieve the data and store in the rs variable
				if(rs.next()) {
					this.setVisible(false);//close the loggin(current) Window
					new Loading().setVisible(true);//open Loading window
				}else
					JOptionPane.showConfirmDialog(null, "Invalid Login....!");//pop-window for Invalid details
			}
			catch(Exception e2) {
					e2.printStackTrace();
			}
		}
		if(ae.getSource() == b2) {//Event for button signup
			setVisible(false);
			Signup su = new Signup();//Opening signup Window
			su.setVisible(true);
		}
		if(ae.getSource() == b3) {//event for button forget
			setVisible(false);
			Forget forget = new Forget();//opening the forget window
			forget.setVisible(true);
		}
	}
	public static void main(String []args) {
		new login_user().setVisible(true);
	}
}
