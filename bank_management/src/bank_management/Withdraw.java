package bank_management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Withdraw extends JFrame {

	private JPanel contentPane;
	JTextField textField;
	JButton btnNewButton,btnClear;
	String pinNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Withdraw frame = new Withdraw("");
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
	public Withdraw(String pinNumber) {
		this.pinNumber=pinNumber;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 522);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Maximum withdrawl amount is : RS 10,000");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(110, 10, 387, 40);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setBounds(35, 182, 450, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterAmount = new JLabel("Please enter your amount : ");
		lblEnterAmount.setForeground(new Color(255, 255, 255));
		lblEnterAmount.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEnterAmount.setBounds(35, 139, 301, 33);
		contentPane.add(lblEnterAmount);
		
		btnNewButton = new JButton("Withdraw");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String debit=textField.getText();
				Date date=new Date();  //java.util package
				
				if(debit.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter an amount");
				}
				else {
					try {
						Conn conn=new Conn();
						String query="insert into bank values('"+pinNumber+"','"+date+"','debit','"+debit+"');";
						
						conn.s.executeUpdate(query);
						JOptionPane.showMessageDialog(null,"RS. "+debit+" debited from yout account !!!!");
						setVisible(false);
						new AtmHome(pinNumber).setVisible(true);
						
					}catch(Exception ex) {
						System.out.println("Error!!!\n"+ex);
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(179, 356, 241, 40);
		contentPane.add(btnNewButton);
		
		btnClear = new JButton("Back");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new AtmHome(pinNumber).setVisible(true); 	
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(179, 419, 241, 40);
		contentPane.add(btnClear);
	}
}
