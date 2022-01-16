package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Read_Me  extends JFrame{
	private JPanel contentPane;
	
	public static void main(String []args) {
		new Read_Me().setVisible(true);
	}
	
	public Read_Me() {
		super("About Us - Vikas Goswami");
		setIconImage(Toolkit.getDefaultToolkit().getImage(" "));
		setBackground(new Color(173, 216, 230));
		setBounds(500, 250, 700, 500);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("New label");
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logo.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		l1 = new JLabel(i3);
		l1.setBounds(500, 40, 100, 100);
		contentPane.add(l1);
		
		JLabel l3 = new JLabel("Library");
		l3.setForeground(new Color(0, 250, 154));
		l3.setBounds(160, 40, 150, 55);
		l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
		contentPane.add(l3);

		JLabel l4 = new JLabel("Mangement System");
		l4.setForeground(new Color(127, 255, 0));
		l4.setBounds(70, 90, 405, 40);
		l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
		contentPane.add(l4);
		

		JLabel l5 = new JLabel("Library");
		l5.setForeground(new Color(30, 144, 255));
		l5.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		l5.setBounds(185, 140, 100, 21);
		contentPane.add(l5);
		

		JLabel l6 = new JLabel("Developed By - Vikas Goswami");
		l6.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
		l6.setBounds(70, 198, 600, 35);
		contentPane.add(l6);
		

		JLabel l7 = new JLabel("Contact Us - vikasgoswami1850@gmail.com");
		l7.setBounds(70, 260, 600, 34);
		l7.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(l7);

		JLabel l8 = new JLabel("Connect on LinkedIn : vikas_goswamii	");
		l8.setBounds(70, 290, 600, 34);
		l8.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(l8);

		JLabel l9 = new JLabel("Follow Us On Instagram : vikas_goswamii");
		l9.setBounds(70, 320, 600, 34);
		l9.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(l9);
		
		JLabel l10 = new JLabel("I hope helped u more and like it!");
		l10.setForeground(new Color(47, 79, 79));
		l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		l10.setBounds(70, 400, 600, 34);
		contentPane.add(l10);
		
		contentPane.setBackground(Color.WHITE);
		
	}
}
