package trafficLight;

import java.awt.*;
import javax.swing.*;


public class TrafficLightDisplay extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	boolean laneNorthColorRed = true, laneNorthColorGreen = false, laneNorthColorYellow = false;
	boolean laneEastColorRed = false, laneEastColorGreen = true, laneEastColorYellow = false;
	boolean laneSouthColorRed = true, laneSouthColorGreen = false, laneSouthColorYellow = false;
	boolean laneWestColorRed = false, laneWestColorGreen = true, laneWestColorYellow = false;

	
	public TrafficLightDisplay() {
		
	setSize(500, 500);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	setResizable(false);
	
	}
	
	public static void main() {
		
		new TrafficLightDisplay();
		
		
	}
	
	public void paint(Graphics g) {

		// North Light Stages
		g.setColor(Color.gray.darker().darker());	    
	    g.fillRect(275, 0, 150, 500);
		g.setColor(Color.black);
	    g.fillRect(275, 50, 150, 50);
	    if(laneNorthColorRed) {
	    	g.setColor(Color.red);
	    	g.fillOval(275, 50, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(325, 50, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(375, 50, 50, 50);
	    }
	    if(laneNorthColorYellow) {
	    	g.setColor(Color.gray);
	    	g.fillOval(275, 50, 50, 50);
	    	g.setColor(Color.yellow);
	    	g.fillOval(325, 50, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(375, 50, 50, 50);
	    	
	    }
	    if(laneNorthColorGreen) {
	    	g.setColor(Color.gray);
	    	g.fillOval(275, 50, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(325, 50, 50, 50);
	    	g.setColor(Color.green);
	    	g.fillOval(375, 50, 50, 50);
	    }
	    
	    // East Light Stages
	    g.setColor(Color.gray.darker().darker());	    
	    g.fillRect(0, 275, 500, 150);
	    g.setColor(Color.black);
	    g.fillRect(425, 275, 50, 150);
	    if(laneEastColorRed) {
	    	g.setColor(Color.red);
	    	g.fillOval(425, 275, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(425, 325, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(425, 375, 50, 50);
	    }
	    if(laneEastColorYellow) {
	    	g.setColor(Color.gray);
	    	g.fillOval(425, 275, 50, 50);
	    	g.setColor(Color.yellow);
	    	g.fillOval(425, 325, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(425, 375, 50, 50);

	    }
	    if(laneEastColorGreen) {
	    	g.setColor(Color.gray);
	    	g.fillOval(425, 275, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(425, 325, 50, 50);
	    	g.setColor(Color.green);
	    	g.fillOval(425, 375, 50, 50);
	    }
	    
	    // South Light Stages
	    g.setColor(Color.gray.darker().darker());	    
	    g.fillRect(75, 0, 150, 500);
	    g.setColor(Color.black);
	    g.fillRect(75, 425, 150, 50);
	    if(laneSouthColorRed) {
	    	g.setColor(Color.red);
	    	g.fillOval(75, 425, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(125, 425, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(175, 425, 50, 50);
	    }
	    if(laneSouthColorYellow) {
	    	g.setColor(Color.gray);
	    	g.fillOval(75, 425, 50, 50);
	    	g.setColor(Color.yellow);
	    	g.fillOval(125, 425, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(175, 425, 50, 50);

	    }
	    if(laneSouthColorGreen) {
	    	g.setColor(Color.gray);
	    	g.fillOval(75, 425, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(125, 425, 50, 50);
	    	g.setColor(Color.green);
	    	g.fillOval(175, 425, 50, 50);
	    }
	    
	    
	    // West Light Stages
	    g.setColor(Color.gray.darker().darker());	    
	    g.fillRect(0, 100, 500, 150);
	    g.setColor(Color.black);
	    g.fillRect(25, 100, 50, 150);
	    if(laneWestColorRed) {
	    	g.setColor(Color.red);
	    	g.fillOval(25, 100, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(25, 150, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(25, 200, 50, 50);
	    }
	    if(laneWestColorYellow) {
	    	g.setColor(Color.gray);
	    	g.fillOval(25, 100, 50, 50);
	    	g.setColor(Color.yellow);
	    	g.fillOval(25, 150, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(25, 200, 50, 50);

	    }
	    if(laneWestColorGreen) {
	    	g.setColor(Color.gray);
	    	g.fillOval(25, 100, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(25, 150, 50, 50);
	    	g.setColor(Color.green);
	    	g.fillOval(25, 200, 50, 50);
	    }

	    
	    
	}

}
