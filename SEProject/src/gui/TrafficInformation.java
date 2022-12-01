package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import storage.Storage;

import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JTextPane txtpnTest = new JTextPane();
		txtpnTest.setFont(new Font("Arial", Font.PLAIN, 18));
		txtpnTest.setText("Report # \t Hazard Type \t Lane \t\t Time \t\t Date");
		txtpnTest.setBounds(176, 221, 700, 43);
		panel_1.add(txtpnTest);
		
		updateReports(panel_1);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(135, 180, 789, 424);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Refresh");
		btnNewButton.setBounds(596, 8, 146, 31);
		panel_3.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(!Storage.reports.isEmpty())
					updateReports(panel_1);
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 180, 137, 84);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JTextPane txtpnHazardReports = new JTextPane();
		txtpnHazardReports.setBackground(new Color(240, 240, 240));
		txtpnHazardReports.setBounds(33, 23, 70, 28);
		panel_4.add(txtpnHazardReports);
		txtpnHazardReports.setFont(new Font("Arial", Font.PLAIN, 18));
		txtpnHazardReports.setEditable(false);
		txtpnHazardReports.setText("Reports");
		
			
		
	}
	
	public void updateReports(JPanel panel_1) {
		int reportSize = Storage.reports.size();
		String tab = "\t\t";
		
		if (reportSize >= 1) {
			String[] tempLane = Storage.reports.get(0);
			
			JTextPane txtpnTest = new JTextPane();
			txtpnTest.setFont(new Font("Arial", Font.PLAIN, 18));
			txtpnTest.setText("     1 \t\t" + tempLane[2] + "\t  " + tempLane[1] + tab + tempLane[0] + tab + tempLane[3]);
			txtpnTest.setBounds(176, 270, 700, 43);
			panel_1.add(txtpnTest);
			
			if(reportSize >= 2) {
				tempLane = Storage.reports.get(1);
				
				JTextPane txtpnTest_2 = new JTextPane();
				txtpnTest_2.setFont(new Font("Arial", Font.PLAIN, 18));
				txtpnTest_2.setText("     2 \t\t" + tempLane[2] + "\t  " + tempLane[1] + tab + tempLane[0] + tab + tempLane[3]);
				txtpnTest_2.setBounds(176, 319, 700, 43);
				panel_1.add(txtpnTest_2);
				}
				 if(reportSize >= 3) {
					 tempLane = Storage.reports.get(2);
					 
					JTextPane txtpnTest_2_1 = new JTextPane();
					txtpnTest_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
					txtpnTest_2_1.setText("     3 \t\t" + tempLane[2] + "\t  " + tempLane[1] + tab + tempLane[0] + tab + tempLane[3]);
					txtpnTest_2_1.setBounds(176, 368, 700, 43);
					panel_1.add(txtpnTest_2_1);
				 }
				 if(reportSize >= 4) {
					tempLane = Storage.reports.get(3);
					 
					JTextPane txtpnTest_4 = new JTextPane();
					txtpnTest_4.setFont(new Font("Arial", Font.PLAIN, 18));
					txtpnTest_4.setText("     4 \t\t" + tempLane[2] + "\t  " + tempLane[1] + tab + tempLane[0] + tab + tempLane[3]);
					txtpnTest_4.setBounds(176, 417, 700, 43);
					panel_1.add(txtpnTest_4);
				 }
				 if(reportSize >= 5) {
						tempLane = Storage.reports.get(4);
						 
						JTextPane txtpnTest_5 = new JTextPane();
						txtpnTest_5.setFont(new Font("Arial", Font.PLAIN, 18));
						txtpnTest_5.setText("     5 \t\t" + tempLane[2] + "\t  " + tempLane[1] + tab + tempLane[0] + tab + tempLane[3]);
						txtpnTest_5.setBounds(176, 466, 700, 43);
						panel_1.add(txtpnTest_5);
					 }
				 if(reportSize >= 6) {
						tempLane = Storage.reports.get(5);
						 
						JTextPane txtpnTest_6 = new JTextPane();
						txtpnTest_6.setFont(new Font("Arial", Font.PLAIN, 18));
						txtpnTest_6.setText("     6 \t\t" + tempLane[2] + "\t  " + tempLane[1] + tab + tempLane[0] + tab + tempLane[3]);
						txtpnTest_6.setBounds(176, 515, 700, 43);
						panel_1.add(txtpnTest_6);
					 }
		}
	}
}
