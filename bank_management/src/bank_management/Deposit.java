package bank_management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;

public class Deposit extends JFrame {

	private JPanel contentPane;
	JTextField textField;
	JButton btnNewButton,btnBack;
	String pinNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deposit frame = new Deposit("");
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
	public Deposit(String pinNumber) {
		this.pinNumber=pinNumber;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter amount you want to deposit (minimum deposit is RS 500) :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel.setBounds(22, 21, 555, 34);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 17));
		textField.setBounds(41, 86, 469, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Deposit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String credit=textField.getText();
				Date date=new Date();
				
				if(credit.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter amount to deposit cash");
				}
				else {
					try {
						Conn conn=new Conn();
						String query="insert into bank values('"+pinNumber+"','"+date+"','credit','"+credit+"');";
						
						conn.s.executeUpdate(query);
						JOptionPane.showMessageDialog(null,"RS. "+credit+" credited successfully!!!!");
						setVisible(false);
						new AtmHome(pinNumber).setVisible(true);
						
					}catch(Exception ex) {
						System.out.println("Error!!!\n"+ex);
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton.setBounds(152, 342, 243, 45);
		contentPane.add(btnNewButton);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new AtmHome(pinNumber).setVisible(true);
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnBack.setBounds(152, 410, 243, 45);
		contentPane.add(btnBack);
	}

}
