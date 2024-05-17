package bank_management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.ResultSet;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiniState extends JFrame {

	private JPanel contentPane;
	String pinNumber;
	JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniState frame = new MiniState("");
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
	public MiniState(String pinNumber) {
		this.pinNumber=pinNumber;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rich bank");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(125, 10, 188, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblAcNo = new JLabel("A/C  no. : ");
		lblAcNo.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		lblAcNo.setBounds(46, 64, 223, 23);
		contentPane.add(lblAcNo);
		
		JLabel lblYourTotalBalance = new JLabel("Your Total balance is : RS");
		lblYourTotalBalance.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		lblYourTotalBalance.setBounds(46, 432, 257, 23);
		contentPane.add(lblYourTotalBalance);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 441, 170, -7);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(36, 97, 414, 325);
		contentPane.add(lblNewLabel_1);
		
		
		try {
			Conn conn=new Conn();
			ResultSet rs=conn.s.executeQuery("select *from login where pin ='"+pinNumber+"';");
			
			while(rs.next()) {
				lblAcNo.setText("Card Number: "+rs.getString("cardnumber").substring(0,4)+"XXXXXXXX"+rs.getString("cardnumber").substring(12));  //cardnumber -mentioned in login table
			}
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		try {
			Conn conn=new Conn();
			int currBalance=0;
			ResultSet rs=conn.s.executeQuery("select * from bank where pin='"+pinNumber+"'");		
			while(rs.next()) {
				lblNewLabel_1.setText(lblNewLabel_1.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RS."+rs.getString("amount")+"<br><br><html>");
				if(rs.getString("type").equals("credit")) {
					currBalance += Integer.parseInt(rs.getString("amount"));
				}
				else {
					currBalance -= Integer.parseInt(rs.getString("amount"));
				}
			}
			lblYourTotalBalance.setText("Your Total balance is : RS."+currBalance);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		btnNewButton_1 = new JButton("Close");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(169, 477, 85, 21);
		contentPane.add(btnNewButton_1);
		
		
	}
}
