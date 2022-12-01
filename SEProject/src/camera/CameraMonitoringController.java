package camera;

import java.util.Scanner;
import java.util.Calendar;
import storage.Storage;
import trafficLight.TrafficLight;

public class CameraMonitoringController extends Thread {
	static boolean NorthTraffic = false, SouthTraffic = false, EastTraffic = false, WestTraffic = false;
	static String NorthStart = "", SouthStart = "", EastStart = "", WestStart = "";
	
	public void run() {
		main();
	}
	
	public static void main() {
		String northLane, eastLane, southLane, westLane;
		
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			
			do {
				System.out.print("INPUT FOR NORTH LANE: ");
				northLane = sc.nextLine();
				
				if(northLane.equals("exit"))
					System.exit(0);
				
			}while(!validInput(northLane));
		
			parseSignal(northLane, 'N');
		
			do {
				System.out.print("INPUT FOR EAST LANE: ");
				eastLane = sc.nextLine();
				
				if(eastLane.equals("exit"))
					System.exit(0);
				
			}while(!validInput(eastLane));
			
			parseSignal(eastLane, 'E');
			
			do {
				System.out.print("INPUT FOR SOUTH LANE: ");
				southLane = sc.nextLine();
				
				if(southLane.equals("exit"))
					System.exit(0);
				
			}while(!validInput(southLane));
		
			parseSignal(southLane, 'S');
			
			do {
				System.out.print("INPUT FOR WEST LANE: ");
				westLane = sc.nextLine();
				
				if(westLane.equals("exit"))
					System.exit(0);
				
			}while(!validInput(westLane));
			
			parseSignal(westLane, 'W');
			
			//System.out.println(northLane + eastLane + southLane + westLane);
		}
	}

	private static boolean validInput(String input) {
		if(input.toLowerCase().matches("(schoolbus)|(traffic)|(empty)|(vehicle)"
				+ "|(pedestrian)|(emergencyvehicle)|(accident)"))
			return true;
		else
			return false;
	}
	
	private static void parseSignal(String laneSignal, char lane) {
		String state = laneSignal.toLowerCase();
		
		
		
		if (state.equals("empty"));
		if (state.equals("vehicle"));
		// function call for vehicle detected signal
		if (state.equals("pedestrian"));
		// function call for pedestrian detected signal
		if (state.equals("schoolbus"));
		// function call for school bus detected
		if (state.equals("emergencyvehicle"));
		// function call for emergency vehicle detected
		
		
		if (state.equals("accident")) {
			
			if(lane == 'N' && !TrafficLight.NorthState.equals("accident")) {
				Hazard h = new Hazard(Character.toString(lane));
	        	h.report();
	        	Storage.storeReport(h);
			}
			
			if(lane == 'E' && !TrafficLight.EastState.equals("accident")) {
				Hazard h = new Hazard(Character.toString(lane));
	        	h.report();
	        	Storage.storeReport(h);
			}
			
			if(lane == 'S' && !TrafficLight.SouthState.equals("accident")) {
				Hazard h = new Hazard(Character.toString(lane));
	        	h.report();
	        	Storage.storeReport(h);
			}
			
			if(lane == 'W' && !TrafficLight.WestState.equals("accident")) {
				Hazard h = new Hazard(Character.toString(lane));
	        	h.report();
	        	Storage.storeReport(h);
			}
		}
		else if (state.equals("traffic")) {
			String cause = "";
			Calendar time = Calendar.getInstance();
			
			if(TrafficLight.NorthState.equals("accident") || TrafficLight.EastState.equals("accident") ||
					TrafficLight.SouthState.equals("accident") || TrafficLight.WestState.equals("accident")) {
				cause = "accident";
			}
			else {
				cause = "unknown";
			}
			
			if(lane == 'N' && !TrafficLight.NorthState.equals("traffic")) {
				NorthStart = time.getTime().toString();
				System.out.println("Traffic Detected!\n Lane: " + lane + "\n Cause: " + cause + "\n Time: " + NorthStart);
				NorthTraffic = true;
			}
			
			if(lane == 'E' && !TrafficLight.EastState.equals("traffic")) {
				EastStart = time.getTime().toString();

				System.out.println("Traffic Detected!\n Lane: " + lane + "\n Cause: " + cause + "\n Time: " + EastStart);
				EastTraffic = true;

			}
			
			if(lane == 'S' && !TrafficLight.SouthState.equals("traffic")) {
				SouthStart = time.getTime().toString();

				System.out.println("Traffic Detected!\n Lane: " + lane + "\n Cause: " + cause + "\n Time: " + SouthStart);
				SouthTraffic = true;

			}
			
			if(lane == 'W' && !TrafficLight.WestState.equals("traffic")) {
				WestStart = time.getTime().toString();

				System.out.println("Traffic Detected!\n Lane: " + lane + "\n Cause: " + cause + "\n Time: " + WestStart);
				WestTraffic = true;

			}
		}
		
		else if(NorthTraffic && (lane == 'N' && state.equals("empty"))) {
			Calendar time = Calendar.getInstance();
			NorthTraffic = false;
		
			System.out.println("Traffic Resolved!\n Lane: " + lane + "\n Start Time: " + NorthStart + "\n End Time: " + time.getTime().toString());
		}
		
		else if(EastTraffic && (lane == 'E' && state.equals("empty"))) {
			Calendar time = Calendar.getInstance();
			EastTraffic = false;

			System.out.println("Traffic Resolved!\n Lane: " + lane + "\n Start Time: " + EastStart + "\n End Time: " + time.getTime().toString());

			
		}
		else if(SouthTraffic && (lane == 'S' && state.equals("empty"))) {
			Calendar time = Calendar.getInstance();
			SouthTraffic = false;
			System.out.println("Traffic Resolved!\n Lane: " + lane + "\n Start Time: " + SouthStart + "\n End Time: " + time.getTime().toString());

		}
		else if(WestTraffic && (lane == 'W' && state.equals("empty"))) {
			Calendar time = Calendar.getInstance();
			WestTraffic = false;

			System.out.println("Traffic Resolved!\n Lane: " + lane + "\n Start Time: " + WestStart + "\n End Time: " + time.getTime().toString());

		}
		
		
		TrafficLight.setLaneState(laneSignal, lane);
			
	}

}
