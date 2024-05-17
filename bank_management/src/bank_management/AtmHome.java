package bank_management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AtmHome extends JFrame {
	
	//Declaring global variables
	JButton btnNewButton,btnFastCash,btnPinChange,btnCashWithdrawl,btnMiniStatement,btnBalanceEnqiery,btnExit;
	
	String pinNumber;
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtmHome frame = new AtmHome("");
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
	public AtmHome(String pinNumber) {
		
		this.pinNumber=pinNumber;
		
		setUndecorated(true);    //to hide the undecorated part i.e. the empty portion of the window
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 543);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SELECT AN OPTION FROM BELOW :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(134, 10, 481, 47);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("Deposit Cash");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Deposit(pinNumber).setVisible(true);
			}
		});
		btnNewButton.setBounds(76, 165, 229, 58);
		contentPane.add(btnNewButton);
		
		btnFastCash = new JButton("Fast Cash");
		btnFastCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Fcash(pinNumber).setVisible(true);
			}
		});
		btnFastCash.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		btnFastCash.setBounds(76, 249, 229, 58);
		contentPane.add(btnFastCash);
		
		btnPinChange = new JButton("Pin Change");
		btnPinChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Pchange(pinNumber).setVisible(true);
			}
		});
		btnPinChange.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		btnPinChange.setBounds(76, 329, 229, 58);
		contentPane.add(btnPinChange);
		
		btnCashWithdrawl = new JButton("Cash Withdrawl");
		btnCashWithdrawl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Withdraw(pinNumber).setVisible(true);
			}
		});
		btnCashWithdrawl.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		btnCashWithdrawl.setBounds(493, 165, 229, 58);
		contentPane.add(btnCashWithdrawl);
		
		btnMiniStatement = new JButton("Mini Statement");
		btnMiniStatement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				setVisible(false);
				new MiniState(pinNumber).setVisible(true);
			}
		});
		btnMiniStatement.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		btnMiniStatement.setBounds(493, 249, 229, 58);
		contentPane.add(btnMiniStatement);
		
		btnBalanceEnqiery = new JButton("Balance Enquiry");
		btnBalanceEnqiery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new BalEnq(pinNumber).setVisible(true);
			}
		});
		btnBalanceEnqiery.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		btnBalanceEnqiery.setBounds(493, 329, 229, 58);
		contentPane.add(btnBalanceEnqiery);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			}
		});
		btnExit.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		btnExit.setBounds(575, 414, 147, 47);
		contentPane.add(btnExit);
	}
}
