package trafficLight;

public class TrafficLight extends Thread{
	
	public static int NorthGreenTimer = 5, NorthRedTimer = 5, NorthYellowTimer = 2;
	public static int EastGreenTimer = 5, EastRedTimer = 5, EastYellowTimer = 2;
	static boolean singlePaint = false, singlePaint2 = false, singlePaint3 = false, singlePaint4 = false, singlePaint5 = false,
			 singlePaint6 = false, singlePaint7 = false;
	
	public static String EastState = "", NorthState = ""
			, SouthState = "", WestState = "";
	
	public void run() {
		try {
			main();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void setLaneState(String state, char lane) {
		if(lane == 'N') 
			NorthState = state;
		else if(lane == 'E')
			EastState = state;
		else if(lane == 'S')
			SouthState = state;
		else if(lane == 'W')
			WestState = state;
	}
	
	public static void main() throws InterruptedException {
		
		TrafficLightDisplay f = new TrafficLightDisplay();
	
		while(true) {
			
			//System.out.println(NorthState + EastState + SouthState + WestState);
			if((NorthState.equals("emergencyvehicle") || SouthState.equals("emergencyvehicle")) &&
					!(EastState.equals("emergencyvehicle") || WestState.equals("emergencyvehicle"))) {
				
				singlePaint2 = false;
				singlePaint3 = false;
				singlePaint4 = false;
				singlePaint5 = false;
				singlePaint6 = false;
				singlePaint7 = false;
				
				changeNorthToGreenLight(f);
				
				f.laneSouthColorGreen = true;
				f.laneSouthColorRed = false;
				f.laneSouthColorYellow = false;
				
				f.laneEastColorGreen = false;
				f.laneEastColorRed = true;
				f.laneEastColorYellow = false;
				
				f.laneWestColorGreen = false;
				f.laneWestColorRed = true;
				f.laneWestColorYellow = false;
				
				
				
				if(!singlePaint) {
					f.repaint();
					singlePaint = true;
				}
				Thread.sleep(1000);
			}
			else if((EastState.equals("emergencyvehicle") || WestState.equals("emergencyvehicle")) &&
					!(NorthState.equals("emergencyvehicle") || SouthState.equals("emergencyvehicle"))) {
				
				singlePaint = false;
				singlePaint3 = false;
				singlePaint4 = false;
				singlePaint5 = false;
				singlePaint6 = false;
				singlePaint7 = false;
				
				if(!singlePaint2)
					changeNorthSouthToRedLight(f);
				
				f.laneEastColorGreen = true;
				f.laneEastColorRed = false;
				f.laneEastColorYellow = false;
				
				f.laneWestColorGreen = true;
				f.laneWestColorRed = false;
				f.laneWestColorYellow = false;
				
				
				
				if(!singlePaint2) {
					f.repaint();
					singlePaint2 = true;
				}
				Thread.sleep(1000);
			}
			else if((EastState.equals("emergencyvehicle") || WestState.equals("emergencyvehicle")) &&
					(NorthState.equals("emergencyvehicle") || SouthState.equals("emergencyvehicle"))) {
				
				singlePaint = false;
				singlePaint2 = false;
				singlePaint4 = false;
				singlePaint5 = false;
				singlePaint6 = false;
				singlePaint7 = false;

				changeNorthSouthToRedLight(f);
				
				changeEastWestToRedLight(f);
				
				if(!singlePaint3) {
					f.repaint();
					singlePaint3 = true;
				}
				Thread.sleep(1000);
			}
			else if((EastState.equals("vehicle") || WestState.equals("vehicle")) &&
					(NorthState.equals("empty") && SouthState.equals("empty"))) {
				singlePaint = false;
				singlePaint2 = false;
				singlePaint3 = false;
				singlePaint5 = false;
				singlePaint6 = false;
				singlePaint7 = false;
				
				if(f.laneNorthColorGreen) {
					f.laneNorthColorGreen = false;
					f.laneSouthColorGreen = false;
					f.laneNorthColorYellow = true;
					f.laneSouthColorYellow = true;
					f.repaint();
					northYellowLightTimer();
					f.laneNorthColorRed = true;
					f.laneSouthColorRed = true;
					f.laneNorthColorYellow = false;
					f.laneSouthColorYellow = false;
					f.repaint();
				}
				
				f.laneEastColorGreen = true;
				f.laneWestColorGreen = true;
				f.laneEastColorRed = false;
				f.laneWestColorRed = false;
				
				if(!singlePaint4) {
					f.repaint();
					singlePaint4 = true;
				}
				
				Thread.sleep(1000);
				
				
			}
			/// fix
			else if((NorthState.equals("vehicle") || SouthState.equals("vehicle")) &&
					(EastState.equals("empty") && WestState.equals("empty"))) {
				singlePaint = false;
				singlePaint2 = false;
				singlePaint3 = false;
				singlePaint4 = false;
				singlePaint6 = false;
				singlePaint7 = false;
				
				if(f.laneEastColorGreen) {
					f.laneEastColorGreen = false;
					f.laneWestColorGreen = false;
					f.laneEastColorGreen = true;
					f.laneWestColorGreen = true;
					f.repaint();
					northYellowLightTimer();
					f.laneEastColorGreen = true;
					f.laneWestColorGreen = true;
					f.laneEastColorGreen = false;
					f.laneWestColorGreen = false;
					f.repaint();
				}
				
				f.laneNorthColorGreen = true;
				f.laneSouthColorGreen = true;
				f.laneNorthColorRed = false;
				f.laneSouthColorRed = false;
				
				if(!singlePaint5) {
					f.repaint();
					singlePaint5 = true;
				}
				
				Thread.sleep(1000);
				
				
			}
			
			else if((NorthState.equals("schoolbus") || SouthState.equals("schoolbus")) &&
					((EastState.equals("vehicle") || EastState.equals("traffic") || EastState.equals("empty")) && 
							(WestState.equals("vehicle") || WestState.equals("traffic") || WestState.equals("empty"))) ) {
				singlePaint = false;
				singlePaint2 = false;
				singlePaint3 = false;
				singlePaint4 = false;
				singlePaint7 = false;
				
				if(f.laneEastColorGreen) {
					f.laneEastColorGreen = false;
					f.laneEastColorYellow = true;
					f.laneWestColorGreen = false;
					f.laneWestColorYellow = true;
					f.repaint();
					eastYellowLightTimer();
					f.laneEastColorYellow = false;
					f.laneEastColorRed = true;
					f.laneWestColorYellow = false;
					f.laneWestColorRed = true;
					f.repaint();
				}
				
				f.laneNorthColorGreen = true;
				f.laneSouthColorGreen = true;
				f.laneNorthColorRed = false;
				f.laneSouthColorRed = false;
				
				if(!singlePaint6) {
					f.repaint();
					singlePaint6 = true;
				}
				
				Thread.sleep(1000);
				
			}
			
			else if((NorthState.equals("schoolbus") || SouthState.equals("schoolbus")) &&
					((EastState.equals("vehicle") || EastState.equals("traffic") || EastState.equals("empty")) && 
							(WestState.equals("vehicle") || WestState.equals("traffic") || WestState.equals("empty"))) ) {
				singlePaint = false;
				singlePaint2 = false;
				singlePaint3 = false;
				singlePaint4 = false;
				singlePaint5 = false;
				singlePaint6 = false;
				
				if(f.laneNorthColorGreen) {
					f.laneNorthColorGreen = false;
					f.laneSouthColorGreen = false;
					f.laneNorthColorYellow = true;
					f.laneSouthColorYellow = true;
					f.repaint();
					northYellowLightTimer();
					f.laneNorthColorRed = true;
					f.laneSouthColorRed = true;
					f.laneNorthColorYellow = false;
					f.laneSouthColorYellow = false;
					f.repaint();
				}
				
				f.laneEastColorGreen = true;
				f.laneWestColorGreen = true;
				f.laneEastColorRed = false;
				f.laneWestColorRed = false;
				
				if(!singlePaint7) {
					f.repaint();
					singlePaint7 = true;
				}
				
				Thread.sleep(1000);
				
			}
				
			else {
				singlePaint = false;
				singlePaint2 = false;
				singlePaint3 = false;
				singlePaint4 = false;
				singlePaint5 = false;
				singlePaint6 = false;
				singlePaint7 = false;
				
				
				if(f.laneEastColorGreen) {
					eastGreenLightTimer();
					// East Light
					f.laneEastColorGreen = false;
					f.laneEastColorYellow = true;
					// West Light
					f.laneWestColorGreen = false;
					f.laneWestColorYellow = true;
					f.repaint();
					eastYellowLightTimer();
					// East Light
					f.laneEastColorYellow = false;
					f.laneEastColorRed = true;
					// West Light
					f.laneWestColorYellow = false;
					f.laneWestColorRed = true;
					f.repaint();
					eastRedLightTimer();
					f.laneNorthColorGreen = true;
					f.laneSouthColorGreen = true;
					f.repaint();
				}
				
				else if(f.laneNorthColorGreen) {
					northGreenLightTimer();
					// North Light
					f.laneNorthColorGreen = false;
					f.laneNorthColorYellow = true;
					// South Light
					f.laneSouthColorGreen = false;
					f.laneSouthColorYellow = true;
					f.repaint();
					northYellowLightTimer();
					// North Light
					f.laneNorthColorYellow = false;
					f.laneNorthColorRed = true;
					// South Light
					f.laneSouthColorYellow = false;
					f.laneSouthColorRed = true;
					f.repaint();
					northRedLightTimer();
					f.laneEastColorGreen = true;
					f.laneWestColorGreen = true;
					f.repaint();
				}
			}
		}
	}
	
	private static void changeNorthToGreenLight(TrafficLightDisplay lane) {
		lane.laneNorthColorGreen = true;
		lane.laneNorthColorRed = false;
		lane.laneNorthColorYellow = false;
	}
	
	private static void changeNorthSouthToRedLight(TrafficLightDisplay lane) throws InterruptedException {
		
			lane.laneNorthColorGreen = false;
			lane.laneNorthColorRed = true;
			lane.laneNorthColorYellow = false;
			lane.laneSouthColorGreen = false;
			lane.laneSouthColorRed = true;
			lane.laneSouthColorYellow = false;
	
	}
	
	private static void changeEastWestToRedLight(TrafficLightDisplay lane) throws InterruptedException {
		
		lane.laneWestColorGreen = false;
		lane.laneWestColorRed = true;
		lane.laneWestColorYellow = false;
		lane.laneEastColorGreen = false;
		lane.laneEastColorRed = true;
		lane.laneEastColorYellow = false;

}
	
	private static void northGreenLightTimer() throws InterruptedException {
		for(int i = NorthGreenTimer; i >= 1; i--)
			Thread.sleep(1000);
	}
	
	private static void northRedLightTimer() throws InterruptedException {
		for(int i = NorthRedTimer; i >= 1; i--)
			Thread.sleep(1000);
	}
	
	private static void northYellowLightTimer() throws InterruptedException {
		for(int i = NorthYellowTimer; i >= 1; i--)
			Thread.sleep(1000);
	}
	
	private static void eastGreenLightTimer() throws InterruptedException {
		for(int i = EastGreenTimer; i >= 1; i--)
			Thread.sleep(1000);
	}
	
	private static void eastRedLightTimer() throws InterruptedException {
		for(int i = EastRedTimer; i >= 1; i--)
			Thread.sleep(1000);
		
	}
	
	private static void eastYellowLightTimer() throws InterruptedException {
		for(int i = EastYellowTimer; i >= 1; i--)
			Thread.sleep(1000);
	}
	
	
	public static void setTrafficLights(String lane, int red, int green, int yellow) {
		if (lane.equals("North")) {
			TrafficLight.NorthGreenTimer = green;
			TrafficLight.NorthRedTimer = red;
			TrafficLight.NorthYellowTimer = yellow;
		}
		if (lane.equals("East")) {
			TrafficLight.EastGreenTimer = green;
			TrafficLight.EastRedTimer = red;
			TrafficLight.EastYellowTimer = yellow;
		}
	}

}
