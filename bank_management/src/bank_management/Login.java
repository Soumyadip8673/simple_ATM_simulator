package bank_management;

import javax.swing.*;     // Swing is a name of a package
import java.awt.*;        // 
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Login extends JFrame{
	private JTextField textField;       // JFrame is used to make a frame 
	private JPasswordField passwordField;
    
    Login() {
        
        setTitle("Auttomatic Teller Machine");
        getContentPane().setLayout(null);
        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));  // ImageIcon is use to import an image
//        Image i2 = i1.getImage().getScaledInstance(102,88, Image.SCALE_DEFAULT);   // IT is use to scale the image
//        ImageIcon i3 = new ImageIcon (i2);
//        JLabel label2 = new JLabel(new ImageIcon(Login.class.getResource("icons/logo.jpg")));
//        getContentPane().setLayout(null);
        
        JLabel text = new JLabel ("Welcome to MyBank.com");
        text.setBounds(201, 21, 286, 54);
        text.setHorizontalAlignment(SwingConstants.LEFT);
        text.setFont(new Font("Times New Roman", Font.BOLD, 25));
        getContentPane().add (text);
        
        getContentPane().setBackground (new Color(175, 238, 238));      // 'getConyentpane().setBackground' is use to change the background color.
        
        JLabel lblNewLabel = new JLabel("CARD NUMBER:");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 17));
        lblNewLabel.setBounds(107, 144, 153, 45);
        getContentPane().add(lblNewLabel);
        
        JLabel lblPin = new JLabel("PIN:");
        lblPin.setForeground(new Color(0, 0, 0));
        lblPin.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblPin.setBounds(143, 182, 39, 54);
        getContentPane().add(lblPin);
        
        textField = new JTextField();
        textField.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        textField.setBounds(274, 150, 223, 26);
        getContentPane().add(textField);
        textField.setColumns(10);	
        
        JButton btnNewButton = new JButton("SIGN IN");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		Conn conn=new Conn();
        		String cardnumber=textField.getText();
        		String pinNumber=passwordField.getText();
        		
        		String query="select * from login where cardnumber='"+cardnumber+"' and pin='"+pinNumber+"'";
        		
        		try {
        			ResultSet rs=conn.s.executeQuery(query);
        			
        			if(rs.next()) {
        				setVisible(false);
        				new AtmHome(pinNumber).setVisible(true);
        				
        			}
        			else {
        				JOptionPane.showMessageDialog(null, "Incorrect card number or pin.\nPlease try again");
        			}
        		}catch(Exception ex) {
        			System.out.println(ex);
        		}
        	}
        });
        
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
        btnNewButton.setBounds(225, 269, 114, 29);
        getContentPane().add(btnNewButton);
        
        JButton btnClear = new JButton("CLEAR");
        btnClear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		textField.setText("");
        		passwordField.setText("");
        	}
        });
        btnClear.setForeground(Color.BLACK);
        btnClear.setFont(new Font("Times New Roman", Font.BOLD, 18));
        btnClear.setBounds(383, 269, 114, 29);
        getContentPane().add(btnClear);
        
        JButton btnSignUp = new JButton("SIGN UP");
        btnSignUp.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		new SignupOne().setVisible(true);
        	}
        });
        btnSignUp.setForeground(Color.BLACK);
        btnSignUp.setFont(new Font("Times New Roman", Font.BOLD, 18));
        btnSignUp.setBounds(225, 326, 286, 45);
        getContentPane().add(btnSignUp);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(274, 198, 223, 26);
        getContentPane().add(passwordField);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\soumu\\eclipse-workspace\\bank_management\\src\\icons\\grafika_banking.png"));
        lblNewLabel_1.setBounds(304, 136, 468, 327);
        getContentPane().add(lblNewLabel_1);
        
        setSize(776, 500);    // setSize is used to set the height and weight of the frame
        setVisible (true);            // setVisible is use to start visible the frame to the user.
        setLocation(350, 200);      // setLocation is used to set the location in your screen where the frame will be shown (Default location is Upper most Left corner)
    }

    public static void main(String args[]) {
        new Login();
    }
}
