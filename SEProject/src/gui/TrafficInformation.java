package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JEditorPane;

public class TrafficInformation {

	private JFrame frmRightofwayTraffic;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrafficInformation window = new TrafficInformation();
					window.frmRightofwayTraffic.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TrafficInformation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRightofwayTraffic = new JFrame();
		frmRightofwayTraffic.setResizable(false);
		frmRightofwayTraffic.setTitle("RIGHT-OF-WAY - TRAFFIC INFORMATION");
		frmRightofwayTraffic.setBounds(100, 100, 967, 672);
		frmRightofwayTraffic.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		// UPPER PANELS // YOU CAN COPY AND PASTE JUST MAKE SURE TO CHANGE frmRightofwayTraffic.xxxx to
		// match yours
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(0, 98, 951, 55);
		frmRightofwayTraffic.getContentPane().add(panel_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(192, 192, 192));
		panel_1_1_1.setBounds(0, 155, 951, 5);
		frmRightofwayTraffic.getContentPane().add(panel_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 224, 224));
		panel_1.setBounds(0, 0, 140, 99);
		frmRightofwayTraffic.getContentPane().add(panel_1);
		panel_1.setLayout(null);	
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 951, 99);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(359, 0, 210, 115);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea txtrTrafficInformation = new JTextArea();
		txtrTrafficInformation.setEditable(false);
		txtrTrafficInformation.setBounds(11, 41, 209, 47);
		panel_2.add(txtrTrafficInformation);
		txtrTrafficInformation.setFont(new Font("Arial", Font.PLAIN, 22));
		txtrTrafficInformation.setText("Traffic Information");
		
		// If home tab is pressed then dispose current frame
		// and call home tab to be opened
		JTextPane txtpnHome = new JTextPane();
		txtpnHome.setEditable(false);
		txtpnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmRightofwayTraffic.dispose();
				HomeScreen.main();
			}
		});
		txtpnHome.setFont(new Font("Arial", Font.PLAIN, 22));
		txtpnHome.setBackground(new Color(192, 192, 192));
		txtpnHome.setText("Home");
		txtpnHome.setBounds(28, 34, 92, 31);
		panel.add(txtpnHome);
		
		// Traffic Controls tab is Pressed
		JTextPane txtpnTrafficControls = new JTextPane();
		txtpnTrafficControls.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmRightofwayTraffic.dispose();
				TrafficControls.main();
			}
		});
		txtpnTrafficControls.setBounds(150, 34, 200, 45);
		panel.add(txtpnTrafficControls);
		txtpnTrafficControls.setFont(new Font("Arial", Font.PLAIN, 22));
		txtpnTrafficControls.setBackground(new Color(192, 192, 192));
		txtpnTrafficControls.setEditable(false);
		txtpnTrafficControls.setText("Traffic Controls");
		
		
		
	}
}
