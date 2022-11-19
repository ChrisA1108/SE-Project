package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomeScreen {

	private JFrame frmRightofwayHome;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
					window.frmRightofwayHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRightofwayHome = new JFrame();
		frmRightofwayHome.setResizable(false);
		frmRightofwayHome.setAlwaysOnTop(true);
		frmRightofwayHome.setTitle("RIGHT-OF-WAY - HOME");
		frmRightofwayHome.setBounds(100, 100, 967, 672);
		frmRightofwayHome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmRightofwayHome.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(130, 0, 821, 99);
		frmRightofwayHome.getContentPane().add(panel);
		panel.setLayout(null);
		
		// If Traffic Information tab is pressed then dispose frame
		// and call traffic information frame
		JTextPane txtpnTrafficInformation = new JTextPane();
		txtpnTrafficInformation.setEditable(false);
		txtpnTrafficInformation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmRightofwayHome.dispose();
				TrafficInformation.main();
			}
		});
		txtpnTrafficInformation.setBackground(new Color(192, 192, 192));
		txtpnTrafficInformation.setBounds(230, 40, 192, 43);
		panel.add(txtpnTrafficInformation);
		txtpnTrafficInformation.setFont(new Font("Arial", Font.PLAIN, 22));
		txtpnTrafficInformation.setText("Traffic Information");
		
		JTextPane txtpnTrafficControls = new JTextPane();
		txtpnTrafficControls.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmRightofwayHome.dispose();
				TrafficControls.main();
			}
		});
		txtpnTrafficControls.setEditable(false);
		txtpnTrafficControls.setBounds(21, 40, 157, 32);
		panel.add(txtpnTrafficControls);
		txtpnTrafficControls.setBackground(new Color(192, 192, 192));
		txtpnTrafficControls.setFont(new Font("Arial", Font.PLAIN, 22));
		txtpnTrafficControls.setText("Traffic Controls");
	
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(0, 98, 951, 55);
		frmRightofwayHome.getContentPane().add(panel_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(192, 192, 192));
		panel_1_1_1.setBounds(0, 155, 951, 5);
		frmRightofwayHome.getContentPane().add(panel_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 130, 99);
		frmRightofwayHome.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnHome = new JTextPane();
		txtpnHome.setEditable(false);
		txtpnHome.setBounds(28, 34, 75, 39);
		panel_1.add(txtpnHome);
		txtpnHome.setFont(new Font("Arial", Font.PLAIN, 22));
		txtpnHome.setText("Home");
	}
}
