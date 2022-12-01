package camera;

import java.util.Scanner;

import storage.Storage;
import trafficLight.TrafficLight;

public class CameraMonitoringController extends Thread {
	
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
		// function call for empty lane signal
		if (state.equals("vehicle"));
		// function call for vehicle detected signal
		if (state.equals("traffic"));
		// function call for traffic detected signal
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
		
		TrafficLight.setLaneState(laneSignal, lane);
			
	}

}
