package trafficLight;

public class TrafficLight extends Thread{
	
	static int time = 10;
	
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
			greenLightTimer();
			
			if(f.laneEastColorGreen) {
				f.laneEastColorGreen = false;
				f.laneEastColorYellow = true;
				f.repaint();
				Thread.sleep(5000);
				f.laneEastColorYellow = false;
				f.laneEastColorRed = true;
				f.repaint();
				Thread.sleep(2000);
				f.laneNorthColorGreen = true;
				f.repaint();
			}
			else if(f.laneNorthColorGreen) {
				f.laneNorthColorGreen = false;
				f.laneNorthColorYellow = true;
				f.repaint();
				Thread.sleep(5000);
				f.laneNorthColorYellow = false;
				f.laneNorthColorRed = true;
				f.repaint();
				Thread.sleep(2000);
				f.laneEastColorGreen = true;
				f.repaint();
			}
				
			
		}
		
		
	}
	
	private static void greenLightTimer() throws InterruptedException {
		System.out.println("Green Light Timer: ");
		for(int i = time; i >= 0; i--) {
			System.out.print(i + " ");
			Thread.sleep(1000);
		}
		System.out.println();
	}

	public static void setTime(int time) {
		TrafficLight.time = time;
	}

}
