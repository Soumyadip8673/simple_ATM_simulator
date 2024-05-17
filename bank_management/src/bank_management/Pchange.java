package bank_management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pchange extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	JButton btnNewButton,btnBack;
	String pinNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pchange frame = new Pchange("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pchange(String pinNumber) {
		this.pinNumber=pinNumber;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Change your PIN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(186, 28, 201, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterOldPin = new JLabel("Enter new PIN : ");
		lblEnterOldPin.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		lblEnterOldPin.setBounds(25, 148, 152, 39);
		contentPane.add(lblEnterOldPin);
		
		JLabel lblNewLabel_1_1 = new JLabel("Re-Enter new PIN : ");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(25, 220, 174, 39);
		contentPane.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordField.setBounds(271, 150, 292, 39);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordField_1.setBounds(271, 220, 292, 39);
		contentPane.add(passwordField_1);
		
		btnNewButton = new JButton("Change");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String newPin=passwordField.getText();
					String rePin=passwordField_1.getText();
					
					if(!newPin.equals(rePin)) {
						JOptionPane.showMessageDialog(null, "Passwords doesn't match ");
						return;
					}
					if(newPin.equals("") || rePin.equals("")) {
						JOptionPane.showMessageDialog(null, "Please enter a valid password");
						return;
					}
					
					Conn conn=new Conn();
					String query1="update bank set pin ='"+rePin+"' where pin='"+pinNumber+"';";
					String query2="update login set pin ='"+rePin+"' where pin='"+pinNumber+"';";
					String query3="update signupthree set pin ='"+rePin+"' where pin='"+pinNumber+"';";
					
					conn.s.executeUpdate(query1);
					conn.s.executeUpdate(query2);
					conn.s.executeUpdate(query3);
					
					JOptionPane.showMessageDialog(null, "Pin changed successfully");
					
					setVisible(false);
					new AtmHome(rePin).setVisible(true);
					
					
				}catch(Exception ex) {
					System.out.println(ex);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(208, 396, 201, 32);
		contentPane.add(btnNewButton);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new AtmHome(pinNumber).setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(208, 453, 201, 32);
		contentPane.add(btnBack);
	}
}
