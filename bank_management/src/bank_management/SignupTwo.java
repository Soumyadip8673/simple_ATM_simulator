package bank_management;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignupTwo extends JFrame {

	private JPanel contentPane;
	JTextField textField;
	JTextField textField_1;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnNo;
	JRadioButton rdbtnNewRadioButton_1;
	JRadioButton rdbtnNo_1;
	JButton btnNewButton_1;
	JComboBox comboBox;
	JButton btnNewButton;
	JComboBox comboBox_1;
	JComboBox comboBox_1_1;
	JComboBox comboBox_1_1_1;
	JComboBox comboBox_1_1_1_1;
	String formNo;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupTwo frame = new SignupTwo("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public SignupTwo(String formNo) {
		this.formNo = formNo;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 580);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PAGE2: ADDITIONAL DETAILS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(203, 10, 457, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FROM NO." + formNo);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_1.setBounds(696, 10, 169, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Religion:");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_2.setBounds(89, 82, 93, 32);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Category:");
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(89, 124, 93, 32);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Income:");
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(89, 166, 93, 32);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Educational Qualification:");
		lblNewLabel_2_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_2_1_1_1.setBounds(89, 208, 194, 32);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Occupation:");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_2_1_1_1_1.setBounds(89, 250, 93, 32);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("PAN Number:");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_2_1_1_1_1_1.setBounds(89, 292, 116, 32);
		contentPane.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Aadhar Number:");
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(89, 334, 131, 32);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("Senior Citizen:");
		lblNewLabel_2_1_1_1_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(89, 376, 116, 32);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("Existing Account:");
		lblNewLabel_2_1_1_1_1_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_2_1_1_1_1_1_1_1_1.setBounds(89, 418, 152, 32);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1_1);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Hindu", "Muslim", "Sikh", "Christian", "Other"}));
		comboBox.setBounds(301, 90, 394, 21);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "General", "SC", "ST", "OBC", "Other"}));
		comboBox_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		comboBox_1.setBounds(301, 132, 394, 21);
		contentPane.add(comboBox_1);
		
		comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"", "Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000"}));
		comboBox_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		comboBox_1_1.setBounds(301, 174, 394, 21);
		contentPane.add(comboBox_1_1);
		
		comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"", "Non-Graduate", "Graduate", "Post Graduate", "Doctorate", "Others"}));
		comboBox_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		comboBox_1_1_1.setBounds(301, 214, 394, 21);
		contentPane.add(comboBox_1_1_1);
		
		comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"", "Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"}));
		comboBox_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		comboBox_1_1_1_1.setBounds(301, 258, 394, 21);
		contentPane.add(comboBox_1_1_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		textField.setBounds(301, 300, 394, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(301, 343, 394, 21);
		contentPane.add(textField_1);
		
		rdbtnNewRadioButton = new JRadioButton("Yes");
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					rdbtnNo.setSelected(false);	
				}
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(336, 384, 131, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNo = new JRadioButton("No");
		rdbtnNo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnNo.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);	
				}
			}
		});
		
		rdbtnNo.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		rdbtnNo.setBounds(487, 384, 103, 21);
		contentPane.add(rdbtnNo);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Yes");
		rdbtnNewRadioButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setBounds(336, 426, 131, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		rdbtnNo_1 = new JRadioButton("No");
		rdbtnNo_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		rdbtnNo_1.setBounds(487, 426, 103, 21);
		contentPane.add(rdbtnNo_1);
		
		rdbtnNewRadioButton_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnNewRadioButton_1.isSelected()) {
					rdbtnNo_1.setSelected(false);
				}
			}
		});
		
		rdbtnNo_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnNo_1.isSelected()) {
					rdbtnNewRadioButton_1.setSelected(false);
				}
			}
		});
		
		btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNo.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNo_1.setSelected(false);
				comboBox.setSelectedItem("");
				comboBox_1.setSelectedItem("");
				comboBox_1_1.setSelectedItem("");
				comboBox_1_1_1.setSelectedItem("");
				comboBox_1_1_1_1.setSelectedItem("");
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton.setBounds(74, 481, 116, 42);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String formno =  "" + formNo;
				String Religion = (String)comboBox.getSelectedItem();
				String Category = (String)comboBox_1.getSelectedItem();
				String Income = (String)comboBox_1_1.getSelectedItem();
				String Educational_Qualification = (String) comboBox_1_1_1.getSelectedItem();
				String Occupation = (String)comboBox_1_1_1_1.getSelectedItem();
				String Pan = textField.getText();
				String AadharNo = textField_1.getText();
				String SeniorCitizen = null;
				if (rdbtnNewRadioButton.isSelected()) {
					SeniorCitizen = "Yes";
				}else {
					SeniorCitizen = "No";
				}
				String ExistingAccount = null;
				if(rdbtnNewRadioButton_1.isSelected()) {
					ExistingAccount = "Yes";
				}else {
					ExistingAccount = "No";
				}
				
				try {
					Conn c = new Conn();
					String query = "insert into signuptwo values('"+formno+"','"+Religion+"','"+Category+"','"+Income+"','"+Educational_Qualification+"',"
							+ "'"+Occupation+"','"+Pan+"','"+AadharNo+"','"+SeniorCitizen+"','"+ExistingAccount+"')";
					c.s.executeUpdate(query);
					setVisible(false);
					new SignupThree(formNo).setVisible(true);
				} catch (Exception e1){
					System.out.println(e1);
				}
				
				
							}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton_1.setBounds(711, 481, 116, 42);
		contentPane.add(btnNewButton_1);
	}
}
