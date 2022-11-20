package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import javax.swing.JTextPane;
import javax.swing.JTabbedPane;

public class Login {

	private JFrame frmRightofwayApplication;
	private JPasswordField passwordField;
	int attempts = 5;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmRightofwayApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frmRightofwayApplication = new JFrame();
		frmRightofwayApplication.setResizable(false);
		frmRightofwayApplication.setFont(new Font("Arial", Font.PLAIN, 42));
		frmRightofwayApplication.setForeground(new Color(255, 255, 255));
		frmRightofwayApplication.setTitle("Right-Of-Way Application");
		frmRightofwayApplication.setBackground(new Color(255, 255, 255));
		frmRightofwayApplication.getContentPane().setBackground(new Color(240, 240, 240));
		frmRightofwayApplication.setBounds(100, 100, 967, 672);
		frmRightofwayApplication.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmRightofwayApplication.getContentPane().setLayout(null);
		frmRightofwayApplication.getContentPane().setBackground(Color.white);
		
		JLabel Logo = new JLabel("");
		Logo.setBounds(10, 151, 494, 299);
		Logo.setLabelFor(frmRightofwayApplication);
		Logo.setHorizontalAlignment(SwingConstants.LEFT);
		Logo.setBackground(new Color(0, 0, 0));
		Logo.setIcon(new ImageIcon(Login.class.getResource("/gui/Logo.jpg")));
		frmRightofwayApplication.getContentPane().add(Logo);
		
		JLabel lblNewLabel = new JLabel("ADMIN LOGIN");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 42));
		lblNewLabel.setBounds(554, 176, 288, 86);
		frmRightofwayApplication.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(516, 373, 117, 28);
		frmRightofwayApplication.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Username:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(510, 320, 123, 28);
		frmRightofwayApplication.getContentPane().add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(643, 377, 148, 20);
		frmRightofwayApplication.getContentPane().add(passwordField);
		
		JFormattedTextField usernameField = new JFormattedTextField();
		usernameField.setBounds(642, 325, 149, 20);
		frmRightofwayApplication.getContentPane().add(usernameField);
	
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected())
					passwordField.setEchoChar((char)0);
				else
					passwordField.setEchoChar('*');
			}
		});
		chckbxNewCheckBox.setBounds(797, 375, 123, 23);
		frmRightofwayApplication.getContentPane().add(chckbxNewCheckBox);
		
		JButton loginButton = new JButton("LOGIN");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				char[] passwordInput = passwordField.getPassword();
				String usernameInput = usernameField.getText();
				
				// If username and password are correct then opens home page JFrame 
				// else updates attempts remaining and if it reaches 0 the appication closes
				if(isCorrectLogin(passwordInput, usernameInput)) {
					frmRightofwayApplication.dispose();
					HomeScreen.main();
				}
				else {
					
					JTextPane txtpnAttemptsRemaining = new JTextPane();
					txtpnAttemptsRemaining.setForeground(new Color(255, 0, 0));
					txtpnAttemptsRemaining.setFont(new Font("Arial", Font.PLAIN, 16));
					txtpnAttemptsRemaining.setText("Attempts Remaining: " + attempts);
					txtpnAttemptsRemaining.setBounds(579, 281, 165, 28);
					frmRightofwayApplication.getContentPane().add(txtpnAttemptsRemaining);
					if(attempts != 0)
						attempts--;
					else if(attempts == 0)
						frmRightofwayApplication.dispose();
					
					JTextPane txtpnInvalidUsernameOr = new JTextPane();
					txtpnInvalidUsernameOr.setForeground(new Color(255, 0, 0));
					txtpnInvalidUsernameOr.setFont(new Font("Arial", Font.PLAIN, 16));
					txtpnInvalidUsernameOr.setText("INVALID USERNAME OR PASSWORD!");
					txtpnInvalidUsernameOr.setBounds(554, 259, 324, 20);
					frmRightofwayApplication.getContentPane().add(txtpnInvalidUsernameOr);
				}
				

			}
			
		});
		
		
		
		loginButton.setBounds(582, 485, 243, 23);
		frmRightofwayApplication.getContentPane().add(loginButton);
		
		JButton btnNewButton_2 = new JButton("Forgot Password?");
		btnNewButton_2.setBounds(526, 414, 149, 23);
		frmRightofwayApplication.getContentPane().add(btnNewButton_2);
		
		
	}

	// Method is not in correct place, it will be placed in more secure location in the future
	// here for testing purposes
	protected boolean isCorrectLogin(char[] passwordInput, String username) {
		char[] savedPassword = {'P','a','s','s','w','o','r','d'};
		
		return Arrays.equals(passwordInput, savedPassword) && username.equals("Admin");
		
		
	}
}
