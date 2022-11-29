package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import trafficLight.TrafficLight;

public class TrafficControls {

	private JFrame frmRightofwayTrafficControls;
	private JTextField txtTrafficLightLane;

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
		frmRightofwayTrafficControls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(new Color(224, 224, 224));
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
				
				//IF traffic information tab is pressed then dispose current
				// open traffic information frame
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
				
				// UPPER PANELS // YOU CAN COPY AND PASTE JUST MAKE SURE TO CHANGE frmRightofwayTraffic.xxxx to
						// match yours
				JPanel panel_1_1_1 = new JPanel();
				panel_1_1_1.setBounds(121, 123, 830, 5);
				panel_1.add(panel_1_1_1);
				panel_1_1_1.setBackground(new Color(192, 192, 192));
				
				JPanel panel_1_1 = new JPanel();
				panel_1_1.setBounds(0, 99, 951, 25);
				panel_1.add(panel_1_1);
				panel_1_1.setBackground(Color.WHITE);
				
				JPanel panel_2 = new JPanel();
				panel_1_1.add(panel_2);
				panel_2.setBackground(new Color(255, 255, 255));
				panel_2.setLayout(null);
				
				JPanel panel_4 = new JPanel();
				panel_4.setBounds(0, 123, 121, 470);
				panel_4.setBackground(new Color(255, 255, 255));
				panel_1.add(panel_4);
				panel_4.setLayout(null);
				
				JPanel panel_5 = new JPanel();
				panel_5.setBackground(new Color(224, 224, 224));
				panel_5.setBounds(0, 0, 121, 90);
				panel_4.add(panel_5);
				panel_5.setLayout(null);
				
				JTextPane txtpnLightTiming = new JTextPane();
				txtpnLightTiming.setEditable(false);
				txtpnLightTiming.setBackground(new Color(224, 224, 224));
				txtpnLightTiming.setFont(new Font("Arial", Font.PLAIN, 18));
				txtpnLightTiming.setText("Light Timing");
				txtpnLightTiming.setBounds(10, 35, 111, 33);
				panel_5.add(txtpnLightTiming);
				
				JPanel panel_6 = new JPanel();
				panel_6.setBackground(new Color(192, 192, 192));
				panel_6.setBounds(121, 212, 5, 381);
				panel_1.add(panel_6);
				
				JPanel panel_7 = new JPanel();
				panel_7.setBackground(new Color(128, 128, 128));
				panel_7.setBounds(131, 150, 495, 38);
				panel_1.add(panel_7);
				panel_7.setLayout(null);
				
				txtTrafficLightLane = new JTextField();
				txtTrafficLightLane.setFont(new Font("Arial", Font.PLAIN, 16));
				txtTrafficLightLane.setText("Traffic Lane                Traffic Light Times: Red        Green        Yellow");
				txtTrafficLightLane.setBackground(new Color(192, 192, 192));
				txtTrafficLightLane.setBounds(3, 3, 488, 32);
				txtTrafficLightLane.setEditable(false);
				txtTrafficLightLane.setHorizontalAlignment(SwingConstants.LEFT);
				panel_7.add(txtTrafficLightLane);
				txtTrafficLightLane.setColumns(10);
				
				JPanel panel_8 = new JPanel();
				panel_8.setBackground(new Color(0, 128, 0));
				panel_8.setBounds(628, 217, 313, 351);
				panel_1.add(panel_8);
				panel_8.setLayout(null);
				
				JPanel panel_9 = new JPanel();
				panel_9.setBackground(new Color(0, 0, 0));
				panel_9.setBounds(92, 0, 51, 351);
				panel_8.add(panel_9);
				panel_9.setLayout(null);
				
				JTextArea txtrNorthLane_1_1 = new JTextArea();
				txtrNorthLane_1_1.setForeground(new Color(255, 255, 255));
				txtrNorthLane_1_1.setWrapStyleWord(true);
				txtrNorthLane_1_1.setToolTipText("");
				txtrNorthLane_1_1.setText("SOUTH");
				txtrNorthLane_1_1.setLineWrap(true);
				txtrNorthLane_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
				txtrNorthLane_1_1.setEditable(false);
				txtrNorthLane_1_1.setBackground(new Color(0, 0, 0));
				txtrNorthLane_1_1.setBounds(20, 237, 21, 114);
				panel_9.add(txtrNorthLane_1_1);
				
				JPanel panel_9_2 = new JPanel();
				panel_9_2.setBackground(new Color(0, 0, 0));
				panel_9_2.setBounds(181, 0, 51, 351);
				panel_8.add(panel_9_2);
				panel_9_2.setLayout(null);
				
				JTextArea txtrNorthLane_1 = new JTextArea();
				txtrNorthLane_1.setForeground(new Color(255, 255, 255));
				txtrNorthLane_1.setBounds(20, 0, 21, 114);
				panel_9_2.add(txtrNorthLane_1);
				txtrNorthLane_1.setBackground(new Color(0, 0, 0));
				txtrNorthLane_1.setFont(new Font("Arial", Font.PLAIN, 18));
				txtrNorthLane_1.setLineWrap(true);
				txtrNorthLane_1.setWrapStyleWord(true);
				txtrNorthLane_1.setToolTipText("");
				txtrNorthLane_1.setEditable(false);
				txtrNorthLane_1.setText("NORTH");
				
				JPanel panel_9_3 = new JPanel();
				panel_9_3.setBackground(new Color(0, 0, 0));
				panel_9_3.setBounds(-19, 107, 332, 51);
				panel_8.add(panel_9_3);
				panel_9_3.setLayout(null);
				
				JTextArea txtrNorthLane_1_1_1_1 = new JTextArea();
				txtrNorthLane_1_1_1_1.setForeground(new Color(255, 255, 255));
				txtrNorthLane_1_1_1_1.setWrapStyleWord(true);
				txtrNorthLane_1_1_1_1.setToolTipText("");
				txtrNorthLane_1_1_1_1.setText("WEST");
				txtrNorthLane_1_1_1_1.setLineWrap(true);
				txtrNorthLane_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
				txtrNorthLane_1_1_1_1.setEditable(false);
				txtrNorthLane_1_1_1_1.setBackground(new Color(0, 0, 0));
				txtrNorthLane_1_1_1_1.setBounds(36, 11, 67, 29);
				panel_9_3.add(txtrNorthLane_1_1_1_1);
				
				JPanel panel_9_3_1 = new JPanel();
				panel_9_3_1.setBackground(new Color(0, 0, 0));
				panel_9_3_1.setBounds(0, 188, 332, 51);
				panel_8.add(panel_9_3_1);
				panel_9_3_1.setLayout(null);
				
				JTextArea txtrNorthLane_1_1_1 = new JTextArea();
				txtrNorthLane_1_1_1.setForeground(new Color(255, 255, 255));
				txtrNorthLane_1_1_1.setWrapStyleWord(true);
				txtrNorthLane_1_1_1.setToolTipText("");
				txtrNorthLane_1_1_1.setText("EAST");
				txtrNorthLane_1_1_1.setLineWrap(true);
				txtrNorthLane_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
				txtrNorthLane_1_1_1.setEditable(false);
				txtrNorthLane_1_1_1.setBackground(new Color(0, 0, 0));
				txtrNorthLane_1_1_1.setBounds(237, 11, 67, 29);
				panel_9_3_1.add(txtrNorthLane_1_1_1);
				
				JPanel panel_10 = new JPanel();
				panel_10.setBounds(141, 199, 477, 397);
				panel_1.add(panel_10);
				panel_10.setLayout(null);
				
				JTextArea txtrNorthLane = new JTextArea();
				txtrNorthLane.setBackground(new Color(240, 240, 240));
				txtrNorthLane.setEditable(false);
				txtrNorthLane.setFont(new Font("Arial", Font.PLAIN, 24));
				txtrNorthLane.setText("North Lane");
				txtrNorthLane.setBounds(10, 41, 130, 30);
				panel_10.add(txtrNorthLane);
				
				JTextArea txtrEastLane = new JTextArea();
				txtrEastLane.setText("East Lane");
				txtrEastLane.setFont(new Font("Arial", Font.PLAIN, 24));
				txtrEastLane.setEditable(false);
				txtrEastLane.setBackground(SystemColor.menu);
				txtrEastLane.setBounds(10, 202, 130, 30);
				panel_10.add(txtrEastLane);
				
				JTextArea txtrSouthLane = new JTextArea();
				txtrSouthLane.setText("South Lane");
				txtrSouthLane.setFont(new Font("Arial", Font.PLAIN, 24));
				txtrSouthLane.setEditable(false);
				txtrSouthLane.setBackground(SystemColor.menu);
				txtrSouthLane.setBounds(10, 82, 130, 30);
				panel_10.add(txtrSouthLane);
				
				JTextArea txtrWestLane = new JTextArea();
				txtrWestLane.setText("West Lane");
				txtrWestLane.setFont(new Font("Arial", Font.PLAIN, 24));
				txtrWestLane.setEditable(false);
				txtrWestLane.setBackground(SystemColor.menu);
				txtrWestLane.setBounds(10, 243, 130, 30);
				panel_10.add(txtrWestLane);
				
				// North and South Lanes
				JSpinner northLaneRed = new JSpinner();
				northLaneRed.setFont(new Font("Arial", Font.PLAIN, 16));
				northLaneRed.setModel(new SpinnerNumberModel(TrafficLight.NorthRedTimer, 2, 20, 1));
				northLaneRed.setBounds(263, 60, 44, 30);
				panel_10.add(northLaneRed);
				
				JSpinner northLaneGreen = new JSpinner();
				northLaneGreen.setModel(new SpinnerNumberModel(TrafficLight.NorthGreenTimer, 2, 20, 1));
				northLaneGreen.setFont(new Font("Arial", Font.PLAIN, 16));
				northLaneGreen.setBounds(344, 60, 44, 30);
				panel_10.add(northLaneGreen);
				
				JSpinner northLaneYellow = new JSpinner();
				northLaneYellow.setModel(new SpinnerNumberModel(TrafficLight.NorthYellowTimer, 2, 5, 1));
				northLaneYellow.setFont(new Font("Arial", Font.PLAIN, 16));
				northLaneYellow.setBounds(423, 60, 44, 30);
				panel_10.add(northLaneYellow);
				
				JPanel greenBox = new JPanel();
				greenBox.setBackground(new Color(0, 255, 0));
				greenBox.setBounds(315, 60, 29, 30);
				panel_10.add(greenBox);
				
				JPanel redBox = new JPanel();
				redBox.setBackground(new Color(255, 0, 0));
				redBox.setBounds(235, 60, 29, 30);
				panel_10.add(redBox);
				
				JPanel yellowBox = new JPanel();
				yellowBox.setBackground(new Color(255, 255, 0));
				yellowBox.setBounds(396, 60, 29, 30);
				panel_10.add(yellowBox);
				
					
				// East and West Lanes
				JPanel redBox_1 = new JPanel();
				redBox_1.setBackground(Color.RED);
				redBox_1.setBounds(235, 223, 29, 30);
				panel_10.add(redBox_1);
				
				JSpinner eastLaneRed = new JSpinner();
				eastLaneRed.setModel(new SpinnerNumberModel(TrafficLight.EastRedTimer, 2, 20, 1));
				eastLaneRed.setFont(new Font("Arial", Font.PLAIN, 16));
				eastLaneRed.setBounds(263, 223, 44, 30);
				panel_10.add(eastLaneRed);
				
				JPanel greenBox_1 = new JPanel();
				greenBox_1.setBackground(Color.GREEN);
				greenBox_1.setBounds(315, 223, 29, 30);
				panel_10.add(greenBox_1);
				
				JSpinner eastLaneGreen = new JSpinner();
				eastLaneGreen.setModel(new SpinnerNumberModel(TrafficLight.EastGreenTimer, 2, 20, 1));
				eastLaneGreen.setFont(new Font("Arial", Font.PLAIN, 16));
				eastLaneGreen.setBounds(344, 223, 44, 30);
				panel_10.add(eastLaneGreen);
				
				JPanel yellowBox_1 = new JPanel();
				yellowBox_1.setBackground(Color.YELLOW);
				yellowBox_1.setBounds(396, 223, 29, 30);
				panel_10.add(yellowBox_1);
				
				JSpinner eastLaneYellow = new JSpinner();
				eastLaneYellow.setModel(new SpinnerNumberModel(TrafficLight.EastYellowTimer, 2, 5, 1));
				eastLaneYellow.setFont(new Font("Arial", Font.PLAIN, 16));
				eastLaneYellow.setBounds(423, 223, 44, 30);
				panel_10.add(eastLaneYellow);
				
				// Submit Button
				JToggleButton tglbtnNewToggleButton = new JToggleButton("Submit Changes");
				tglbtnNewToggleButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						TrafficLight.setTrafficLights("North", (Integer) northLaneRed.getValue(), (Integer) northLaneGreen.getValue(), (Integer) northLaneYellow.getValue());
						TrafficLight.setTrafficLights("East", (Integer) eastLaneRed.getValue(), (Integer) eastLaneGreen.getValue(), (Integer) eastLaneYellow.getValue());
					}
				});
				tglbtnNewToggleButton.setFont(new Font("Arial", Font.PLAIN, 16));
				tglbtnNewToggleButton.setBounds(315, 363, 150, 23);
				panel_10.add(tglbtnNewToggleButton);	
	}
}
