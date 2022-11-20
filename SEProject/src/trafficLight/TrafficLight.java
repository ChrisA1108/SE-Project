package trafficLight;

public class TrafficLight extends Thread{
	
	public static int greenTimer = 5, redTimer = 5, yellowTimer = 5;
	
	public void run() {
		try {
			main();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main() throws InterruptedException {
		
		TrafficLightDisplay f = new TrafficLightDisplay();
	
		while(true) {
			
			
			if(f.laneEastColorGreen) {
				eastGreenLightTimer();
				f.laneEastColorGreen = false;
				f.laneEastColorYellow = true;
				f.repaint();
				eastYellowLightTimer();
				f.laneEastColorYellow = false;
				f.laneEastColorRed = true;
				f.repaint();
				eastRedLightTimer();
				f.laneNorthColorGreen = true;
				f.repaint();
			}
			else if(f.laneNorthColorGreen) {
				northGreenLightTimer();
				f.laneNorthColorGreen = false;
				f.laneNorthColorYellow = true;
				f.repaint();
				northRedLightTimer();
				f.laneNorthColorYellow = false;
				f.laneNorthColorRed = true;
				f.repaint();
				northYellowLightTimer();
				f.laneEastColorGreen = true;
				f.repaint();
			}
		}
		
		
	}
	
	private static void northGreenLightTimer() throws InterruptedException {
		//System.out.println("North Green Light Timer: ");
		for(int i = greenTimer; i >= 0; i--) {
			//System.out.print(i + " ");
			Thread.sleep(1000);
		}
		//System.out.println();
	}
	
	private static void northRedLightTimer() throws InterruptedException {
		//System.out.println("North Red Light Timer: ");
		for(int i = redTimer; i >= 0; i--) {
			//System.out.print(i + " ");
			Thread.sleep(1000);
		}
		//ystem.out.println();
	}
	
	private static void northYellowLightTimer() throws InterruptedException {
		//System.out.println("North Yellow Light Timer: ");
		for(int i = yellowTimer; i >= 0; i--) {
			//System.out.print(i + " ");
			Thread.sleep(1000);
		}
		//System.out.println();
	}
	
	private static void eastGreenLightTimer() throws InterruptedException {
		//System.out.println("East Green Light Timer: ");
		for(int i = greenTimer; i >= 0; i--) {
			//System.out.print(i + " ");
			Thread.sleep(1000);
		}
		//System.out.println();
	}
	
	private static void eastRedLightTimer() throws InterruptedException {
		//System.out.println("East Red Light Timer: ");
		for(int i = redTimer; i >= 0; i--) {
			//System.out.print(i + " ");
			Thread.sleep(1000);
		}
		//System.out.println();
	}
	
	private static void eastYellowLightTimer() throws InterruptedException {
		//System.out.println("East Yellow Light Timer: ");
		for(int i = yellowTimer; i >= 0; i--) {
			//System.out.print(i + " ");
			Thread.sleep(1000);
		}
		//System.out.println();
	}
	
	
	public static void setTrafficLights(String lane, int red, int green, int yellow) {
		TrafficLight.greenTimer = green;
		TrafficLight.redTimer = red;
		TrafficLight.yellowTimer = yellow;
	}

}
