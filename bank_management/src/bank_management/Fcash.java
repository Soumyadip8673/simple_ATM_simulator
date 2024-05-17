package bank_management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.util.Date;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Fcash extends JFrame {

	private JPanel contentPane;
	String pinNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fcash frame = new Fcash("");
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
	public Fcash(String pinNumber) {
		this.pinNumber=pinNumber;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 544);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fast Cash : Select an amount to withdraw");
		lblNewLabel.setForeground(new Color(245, 255, 250));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setBounds(106, 10, 411, 53);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("RS. 100");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String debit="100";
				Date date=new Date();  //java.util package
				
				try {
					Conn conn=new Conn();
					String query="insert into bank values('"+pinNumber+"','"+date+"','debit','"+debit+"');";
					
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null,"RS. "+debit+" debited from yout account !!!!");
					setVisible(false);
					new AtmHome(pinNumber).setVisible(true);
					
				}catch(Exception ex) {
					System.out.println("Error!!!\n"+ex);
				}}
		});
		btnNewButton.setFont(new Font("SimSun", Font.BOLD, 18));
		btnNewButton.setBounds(67, 198, 185, 39);
		contentPane.add(btnNewButton);
		
		JButton btnRs = new JButton("RS. 500");
		btnRs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String debit="500";
				Date date=new Date();  //java.util package
				
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
		});
		btnRs.setFont(new Font("SimSun", Font.BOLD, 18));
		btnRs.setBounds(67, 260, 185, 39);
		contentPane.add(btnRs);
		
		JButton btnRs_1 = new JButton("RS. 5000");
		btnRs_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String debit="5000";
				Date date=new Date();  //java.util package
				
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
		});
		btnRs_1.setFont(new Font("SimSun", Font.BOLD, 18));
		btnRs_1.setBounds(67, 322, 185, 39);
		contentPane.add(btnRs_1);
		
		JButton btnRs_2 = new JButton("RS. 200");
		btnRs_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String debit="200";
				Date date=new Date();  //java.util package
				
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
		});
		btnRs_2.setFont(new Font("SimSun", Font.BOLD, 18));
		btnRs_2.setBounds(376, 198, 185, 39);
		contentPane.add(btnRs_2);
		
		JButton btnRs_3 = new JButton("RS. 1000");
		btnRs_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String debit="1000";
				Date date=new Date();  //java.util package
				
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
		});
		btnRs_3.setFont(new Font("SimSun", Font.BOLD, 18));
		btnRs_3.setBounds(376, 260, 185, 39);
		contentPane.add(btnRs_3);
		
		JButton btnRs_4 = new JButton("RS. 10000");
		btnRs_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String debit="10000";
				Date date=new Date();  //java.util package
				
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
		});
		btnRs_4.setFont(new Font("SimSun", Font.BOLD, 18));
		btnRs_4.setBounds(376, 322, 185, 39);
		contentPane.add(btnRs_4);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new AtmHome(pinNumber).setVisible(true);
			}
		});
		btnBack.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 19));
		btnBack.setBounds(408, 401, 185, 39);
		contentPane.add(btnBack);
	}
}
