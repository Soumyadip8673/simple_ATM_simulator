package bank_management;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.awt.event.ItemEvent;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class SignupThree extends JFrame {

	private JPanel contentPane;
	String formNo;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnCurrentAccount;
	JRadioButton rdbtnNewRadioButton_1_1;
	JRadioButton rdbtnNewRadioButton_1_1_1;
	JCheckBox chckbxNewCheckBox;
	JCheckBox chckbxMobileBanking;
	JCheckBox chckbxNewCheckBox_1_1;
	JCheckBox chckbxInternetBanking;
	JCheckBox chckbxNewCheckBox_2_1;
	JCheckBox chckbxNewCheckBox_2_1_1;
	JCheckBox chckbxNewCheckBox_1;
	JButton btnNewButton;
	JButton btnClear;
	String pin;

	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupThree frame = new SignupThree("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SignupThree(String formNo) {
		this.formNo = formNo;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 580);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PAGE 3: ACCOUNT DETAILS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(244, 10, 369, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FORM NO."+ formNo);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_1.setBounds(725, 20, 154, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Account Type:");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2.setBounds(63, 70, 172, 28);
		contentPane.add(lblNewLabel_2);
		
		rdbtnNewRadioButton = new JRadioButton("Saving Account");
		rdbtnNewRadioButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(118, 104, 135, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnCurrentAccount = new JRadioButton("Current Account");
		rdbtnCurrentAccount.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		rdbtnCurrentAccount.setBounds(118, 158, 172, 21);
		contentPane.add(rdbtnCurrentAccount);
		
		rdbtnNewRadioButton_1_1 = new JRadioButton("Recurring Diposit Account");
		rdbtnNewRadioButton_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		rdbtnNewRadioButton_1_1.setBounds(381, 158, 232, 21);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		rdbtnNewRadioButton_1_1_1 = new JRadioButton("Fixed Diposit Account");
		rdbtnNewRadioButton_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		rdbtnNewRadioButton_1_1_1.setBounds(381, 106, 183, 21);
		contentPane.add(rdbtnNewRadioButton_1_1_1);
		
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					rdbtnCurrentAccount.setSelected(false);
					rdbtnNewRadioButton_1_1.setSelected(false);
					rdbtnNewRadioButton_1_1_1.setSelected(false);
				}
			}
		});
		
		rdbtnCurrentAccount.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnCurrentAccount.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1_1.setSelected(false);
					rdbtnNewRadioButton_1_1_1.setSelected(false);
				}
			}
		});
		
		rdbtnNewRadioButton_1_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnNewRadioButton_1_1.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnCurrentAccount.setSelected(false);
					rdbtnNewRadioButton_1_1_1.setSelected(false);
				}
			}
		});
		
		rdbtnNewRadioButton_1_1_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnNewRadioButton_1_1_1.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnCurrentAccount.setSelected(false);
					rdbtnNewRadioButton_1_1.setSelected(false);
				}
			}
		});
		JLabel lblNewLabel_2_1 = new JLabel("Card Number:");
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(63, 218, 154, 28);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("[Your 16 Digit Card Number]");
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(63, 242, 183, 28);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("It would appear on ATM card/Cheque book and Statements");
		lblNewLabel_2_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_2_1_1_1.setBounds(344, 242, 380, 28);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Pin:");
		lblNewLabel_2_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_2.setBounds(63, 308, 124, 28);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("XXXX-XXXX-XXXX-0123");
		
		lblNewLabel_2_1_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_3.setBounds(344, 218, 352, 28);
		contentPane.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("(4 Digit Password)");
		lblNewLabel_2_1_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_2_1_1_2.setBounds(63, 332, 183, 28);
		contentPane.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("XXXX");
		lblNewLabel_2_1_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_2_1.setBounds(344, 308, 124, 28);
		contentPane.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Services Required:");
		lblNewLabel_2_1_2_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_2_2.setBounds(63, 381, 200, 28);
		contentPane.add(lblNewLabel_2_1_2_2);
		
		chckbxNewCheckBox = new JCheckBox("ATM Card");
		chckbxNewCheckBox.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		chckbxNewCheckBox.setBounds(142, 415, 111, 28);
		contentPane.add(chckbxNewCheckBox);
		
		chckbxMobileBanking = new JCheckBox("Mobile Banking");
		chckbxMobileBanking.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		chckbxMobileBanking.setBounds(142, 446, 148, 28);
		contentPane.add(chckbxMobileBanking);
		
		chckbxNewCheckBox_1_1 = new JCheckBox("Cheque Book");
		chckbxNewCheckBox_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15)); 
		chckbxNewCheckBox_1_1.setBounds(142, 476, 148, 28);
		contentPane.add(chckbxNewCheckBox_1_1);
		
		chckbxInternetBanking = new JCheckBox("Internet Banking");
		chckbxInternetBanking.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		chckbxInternetBanking.setBounds(313, 415, 148, 28);
		contentPane.add(chckbxInternetBanking);
		
		chckbxNewCheckBox_2_1 = new JCheckBox("EMAIL Alerts & SMS Alerts");
		chckbxNewCheckBox_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		chckbxNewCheckBox_2_1.setBounds(313, 446, 209, 28);
		contentPane.add(chckbxNewCheckBox_2_1);
		
		chckbxNewCheckBox_2_1_1 = new JCheckBox("E-Statement");
		chckbxNewCheckBox_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		chckbxNewCheckBox_2_1_1.setBounds(313, 476, 141, 28);
		contentPane.add(chckbxNewCheckBox_2_1_1);
		
		chckbxNewCheckBox_1 = new JCheckBox("I hereby declares that the above entered details correct to the best of my knowledge.");
		chckbxNewCheckBox_1.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		chckbxNewCheckBox_1.setBounds(23, 516, 557, 21);
		contentPane.add(chckbxNewCheckBox_1);
		
		btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String formno = "" + formNo;
				String AccountType = null;
				if (rdbtnNewRadioButton.isSelected()) {
					AccountType = "Saving Account";
				}else if (rdbtnCurrentAccount.isSelected()) {
					AccountType = "Current Account";
				}else if (rdbtnNewRadioButton_1_1.isSelected()) {
					AccountType = "Fixed Diposit Account";
				}else {
					AccountType = "Recurring Diposit Account";
				}
				
				Random random = new Random(); 
				String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L) 	;
				pin = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
				lblNewLabel_2_1_3.setText("Card Number: "+cardnumber.substring(0,4)+"XXXXXXXX"+cardnumber.substring(12));
				
				String ServiceRequired = null;
				if (chckbxNewCheckBox.isSelected()) {
					ServiceRequired = ServiceRequired + " ATM Card";
				}else if (chckbxMobileBanking.isSelected()) {
					ServiceRequired = ServiceRequired + " Mobile Banking";
				}else if (chckbxNewCheckBox_1_1.isSelected()) {
					ServiceRequired = ServiceRequired + " Cheque Book";
				}else if (chckbxInternetBanking.isSelected()) {
					ServiceRequired = ServiceRequired + " Internet Banking";
				}else if (chckbxNewCheckBox_2_1.isSelected()) {
					ServiceRequired = ServiceRequired + " Email Alerts & SMS Alerts";
				}else {
					ServiceRequired = ServiceRequired + " E-Statement";
				}
				
				try {
					Conn c = new Conn();
					String query = "insert into signupthree values('"+formno+"','"+AccountType+"','"+cardnumber+"','"+pin+"','"+ServiceRequired+"')";
					String query1 = "insert into login values('"+formno+"','"+cardnumber+"','"+pin+"')";
					c.s.executeUpdate(query);
					c.s.executeUpdate(query1);
					
					JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber +  "\n Pin: " + pin);
					setVisible(false);
					new Deposit(pin).setVisible(true);					 
				} catch (Exception e1){
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton.setBounds(766, 452, 105, 37);
		contentPane.add(btnNewButton);
		
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton.setSelected(false);
				rdbtnCurrentAccount.setSelected(false);
				rdbtnNewRadioButton_1_1.setSelected(false);
				rdbtnNewRadioButton_1_1_1.setSelected(false);
				chckbxNewCheckBox.setSelected(false);
				chckbxMobileBanking.setSelected(false);
				chckbxNewCheckBox_1_1.setSelected(false);
				chckbxInternetBanking.setSelected(false);
				chckbxNewCheckBox_2_1.setSelected(false);
				chckbxNewCheckBox_2_1_1.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
			}
		});
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnClear.setBounds(766, 500, 105, 37);
		contentPane.add(btnClear);
	}

}
