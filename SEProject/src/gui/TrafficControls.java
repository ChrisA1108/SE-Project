package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class TrafficControls {

	private JFrame frmRightofwayTrafficControls;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrafficControls window = new TrafficControls();
					window.frmRightofwayTrafficControls.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TrafficControls() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRightofwayTrafficControls = new JFrame();
		frmRightofwayTrafficControls.setResizable(false);
		frmRightofwayTrafficControls.setTitle("RIGHT-OF-WAY - TRAFFIC CONTROLS ");
		frmRightofwayTrafficControls.setBounds(100, 100, 967, 672);
		frmRightofwayTrafficControls.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// UPPER PANELS // YOU CAN COPY AND PASTE JUST MAKE SURE TO CHANGE frmRightofwayTraffic.xxxx to
				// match yours
				JPanel panel_1_1 = new JPanel();
				panel_1_1.setBackground(Color.WHITE);
				panel_1_1.setBounds(0, 98, 951, 55);
				frmRightofwayTrafficControls.getContentPane().add(panel_1_1);
				
				JPanel panel_2 = new JPanel();
				panel_1_1.add(panel_2);
				panel_2.setBackground(new Color(255, 255, 255));
				panel_2.setLayout(null);
				
				JPanel panel_1_1_1 = new JPanel();
				panel_1_1_1.setBackground(new Color(192, 192, 192));
				panel_1_1_1.setBounds(0, 155, 951, 5);
				frmRightofwayTrafficControls.getContentPane().add(panel_1_1_1);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(new Color(255, 255, 255));
				panel_1.setBounds(0, 0, 140, 99);
				frmRightofwayTrafficControls.getContentPane().add(panel_1);
				panel_1.setLayout(null);	
				
				JPanel panel = new JPanel();
				panel.setBackground(new Color(192, 192, 192));
				panel.setBounds(0, 0, 951, 99);
				panel_1.add(panel);
				panel.setLayout(null);
				
				// If home tab is pressed then dispose current frame
				// and call home tab to be opened
				JTextPane txtpnHome = new JTextPane();
				txtpnHome.setEditable(false);
				txtpnHome.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						frmRightofwayTrafficControls.dispose();
						HomeScreen.main();
					}
				});
				txtpnHome.setFont(new Font("Arial", Font.PLAIN, 22));
				txtpnHome.setBackground(new Color(192, 192, 192));
				txtpnHome.setText("Home");
				txtpnHome.setBounds(28, 34, 92, 31);
				panel.add(txtpnHome);
				
				JPanel panel_3 = new JPanel();
				panel_3.setBackground(new Color(255, 255, 255));
				panel_3.setBounds(120, 0, 209, 99);
				panel.add(panel_3);
				panel_3.setLayout(null);
				
				JTextPane txtpnTrafficControls = new JTextPane();
				txtpnTrafficControls.setEditable(false);
				txtpnTrafficControls.setBounds(20, 37, 157, 32);
				panel_3.add(txtpnTrafficControls);
				txtpnTrafficControls.setFont(new Font("Arial", Font.PLAIN, 22));
				txtpnTrafficControls.setText("Traffic Controls");
				
				JTextArea txtrTrafficInformation = new JTextArea();
				txtrTrafficInformation.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						frmRightofwayTrafficControls.dispose();
						TrafficInformation.main();
					}
				});
				txtrTrafficInformation.setBackground(new Color(192, 192, 192));
				txtrTrafficInformation.setBounds(359, 41, 209, 47);
				panel.add(txtrTrafficInformation);
				txtrTrafficInformation.setEditable(false);
				txtrTrafficInformation.setFont(new Font("Arial", Font.PLAIN, 22));
				txtrTrafficInformation.setText("Traffic Information");
	}

}
