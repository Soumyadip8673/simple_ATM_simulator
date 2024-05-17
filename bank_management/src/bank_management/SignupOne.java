package bank_management;

import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.SystemColor;

public class SignupOne extends JFrame {
	
	String formNo;
	

	private JPanel contentPane;
	JTextField textField;
	JTextField textField_1;
	JTextField textField_2;
	JTextField textField_3;
	JTextField textField_4;
	JTextField textField_5;
	JTextField textField_6;
	JDateChooser dateChooser;
	JButton btnNewButton;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnFemale;
	JRadioButton rdbtnOther;
	JRadioButton rdbtnMarried;
	JRadioButton rdbtnUnmarried;
	JButton btnClear;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupOne frame = new SignupOne();
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
	public SignupOne() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 642);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//generating random form no.
		
		Random ranForm=new Random();
		formNo=Math.abs((ranForm.nextLong()%9000L)+1000L)+"";
		
		JLabel lblNewLabel = new JLabel("APPLICATION FORM NO. "+formNo);
		lblNewLabel.setBounds(141, 10, 421, 42);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		contentPane.add(lblNewLabel);
		
		JLabel lblPage = new JLabel("Page 1 : Personal Details");
		lblPage.setBounds(174, 51, 332, 22);
		lblPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblPage.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblPage);
		
		JLabel lblNewLabel_1 = new JLabel("Name : ");
		lblNewLabel_1.setBounds(73, 105, 69, 22);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Father's Name : ");
		lblNewLabel_1_1.setBounds(73, 155, 124, 22);
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Date of Birth : ");
		lblNewLabel_1_2.setBounds(73, 199, 107, 22);
		lblNewLabel_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Gender : ");
		lblNewLabel_1_3.setBounds(73, 242, 69, 22);
		lblNewLabel_1_3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("E mail Address : ");
		lblNewLabel_1_4.setBounds(73, 282, 124, 22);
		lblNewLabel_1_4.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Marital Status : ");
		lblNewLabel_1_5.setBounds(73, 332, 114, 22);
		lblNewLabel_1_5.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Adddress : ");
		lblNewLabel_1_6.setBounds(73, 378, 96, 22);
		lblNewLabel_1_6.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("City : ");
		lblNewLabel_1_7.setBounds(73, 427, 69, 22);
		lblNewLabel_1_7.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Pin Code : ");
		lblNewLabel_1_8.setBounds(73, 475, 96, 22);
		lblNewLabel_1_8.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("State : ");
		lblNewLabel_1_9.setBounds(73, 519, 69, 22);
		lblNewLabel_1_9.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1_9);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(212, 103, 350, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(212, 153, 350, 27);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(212, 280, 350, 27);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(212, 376, 350, 27);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(212, 425, 350, 27);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(212, 473, 350, 27);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_6.setColumns(10);
		textField_6.setBounds(212, 517, 350, 27);
		contentPane.add(textField_6);
		
		btnNewButton = new JButton("Next");
		btnNewButton.setToolTipText("click 'Next' to proceed further");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 15));
		
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(477, 568, 85, 27);
		contentPane.add(btnNewButton);
		
		rdbtnNewRadioButton = new JRadioButton("Male\r\n\r\n");
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnNewRadioButton.setBounds(214, 244, 69, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnFemale = new JRadioButton("Female\r\n\r\n");
		rdbtnFemale.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnFemale.setBounds(340, 244, 69, 21);
		contentPane.add(rdbtnFemale);
		
		rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnOther.setBounds(481, 245, 69, 21);
		contentPane.add(rdbtnOther);
		
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					rdbtnFemale.setSelected(false);
					rdbtnOther.setSelected(false);
				}
			}
		});
		
		rdbtnFemale.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnFemale.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnOther.setSelected(false);
				}
			}
		});
		
		rdbtnOther.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnOther.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnFemale.setSelected(false);
				}
			}
		});
		
		rdbtnMarried = new JRadioButton("Married");
		rdbtnMarried.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnMarried.setBounds(212, 335, 96, 21);
		contentPane.add(rdbtnMarried);
		
		rdbtnUnmarried = new JRadioButton("Unmarried");
		rdbtnUnmarried.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnUnmarried.setBounds(340, 335, 107, 21);
		contentPane.add(rdbtnUnmarried);
		
		rdbtnMarried.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnMarried.isSelected()) {
					rdbtnUnmarried.setSelected(false);
				}
			}
		});
		
		rdbtnUnmarried.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnUnmarried.isSelected()) {
					rdbtnMarried.setSelected(false);
				}
			}
		});
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				rdbtnNewRadioButton.setSelected(false);
				rdbtnFemale.setSelected(false);
				rdbtnOther.setSelected(false);
				rdbtnMarried.setSelected(false);
				rdbtnUnmarried.setSelected(false);
			}
		});
		btnClear.setToolTipText("click 'Next' to proceed further");
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Verdana", Font.BOLD, 15));
		btnClear.setBackground(Color.BLACK);
		btnClear.setBounds(212, 568, 85, 27);
		contentPane.add(btnClear);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(212, 194, 350, 27);
		contentPane.add(dateChooser);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String formno = "" + formNo;
				String name = textField.getText();
				String fname = textField_1.getText();
				String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();	
				String gender = null;
				if (rdbtnNewRadioButton.isSelected()) {
					gender = "Male";
					
				}else if(rdbtnFemale.isSelected()) {
					gender = "Female";
				}else {
					gender = "Others";
				}
				String Email = textField_2.getText(); 
				String MaritalStatus = null;
				if (rdbtnMarried.isSelected()) {
					MaritalStatus = "Married";
				}else {
					MaritalStatus = "Unmarried";
				}
				String Address = textField_3.getText();
				String City = textField_4.getText();
				String PinCode = textField_5.getText();
				String State = textField_6.getText();
				
				
				try {
					if (name.equals("")||fname.equals("")|| Email.equals("") || Address.equals("")
							|| City.equals("")||PinCode.equals("")||State.equals("")) {
						JOptionPane.showMessageDialog(null, "All Fields are Mandatory");
					} else {
						Conn c = new Conn();
						String query = "insert into Signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+Email+"','"+gender+"','"+MaritalStatus+"','"+Address+"','"+City+"','"+PinCode+"','"+State+"')";
						c.s.executeUpdate(query);
					}
				} catch (Exception e1) {
					System.out.println(e1);	
				}
				
				setVisible(false);
				new SignupTwo(formNo).setVisible(true);
//				
//				textField.setText("");
//				textField_1.setText("");
//				textField_2.setText("");
//				textField_3.setText("");
//				textField_4.setText("");
//				textField_5.setText("");
//				textField_6.setText("");
//				rdbtnNewRadioButton.setSelected(false);
//				rdbtnFemale.setSelected(false);
//				rdbtnOther.setSelected(false);
//				rdbtnMarried.setSelected(false);
//				rdbtnUnmarried.setSelected(false);
//				
			}
		});
	}
}
