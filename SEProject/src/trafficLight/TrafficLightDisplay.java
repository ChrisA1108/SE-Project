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
	
	public TrafficLightDisplay() {
		
	setSize(400, 400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	
	}
	
	public static void main() {
		
		new TrafficLightDisplay();
		
		
	}
	
	public void paint(Graphics g) {

		g.setColor(Color.black);
	    g.fillRect(20, 50, 50, 150);
	    if(laneNorthColorRed) {
	    	g.setColor(Color.red);
	    	g.fillOval(20, 50, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(20, 100, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(20, 150, 50, 50);
	    }
	    if(laneNorthColorYellow) {
	    	g.setColor(Color.gray);
	    	g.fillOval(20, 50, 50, 50);
	    	g.setColor(Color.yellow);
	    	g.fillOval(20, 100, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(20, 150, 50, 50);
	    	
	    }
	    if(laneNorthColorGreen) {
	    	g.setColor(Color.gray);
	    	g.fillOval(20, 50, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(20, 100, 50, 50);
	    	g.setColor(Color.green);
	    	g.fillOval(20, 150, 50, 50);
	    }
	    
	    g.setColor(Color.black);
	    g.fillRect(200, 50, 50, 150);
	    if(laneEastColorRed) {
	    	g.setColor(Color.red);
	    	g.fillOval(200, 50, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(200, 100, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(200, 150, 50, 50);
	    }
	    if(laneEastColorYellow) {
	    	g.setColor(Color.gray);
	    	g.fillOval(200, 50, 50, 50);
	    	g.setColor(Color.yellow);
	    	g.fillOval(200, 100, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(200, 150, 50, 50);

	    }
	    if(laneEastColorGreen) {
	    	g.setColor(Color.gray);
	    	g.fillOval(200, 50, 50, 50);
	    	g.setColor(Color.gray);
	    	g.fillOval(200, 100, 50, 50);
	    	g.setColor(Color.green);
	    	g.fillOval(200, 150, 50, 50);
	    }
	    
	    
	}

}
