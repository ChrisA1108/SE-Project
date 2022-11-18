package camera;

import java.util.Scanner;

public class CameraMonitoringController {
	
	public static void main(String[] args) {
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
		if(input.toLowerCase().matches("(schoolbus)|(traffic)|(empty)|(vechicle)"
				+ "|(pedestrian)|(emergencyvechicle)|(accident)"))
			return true;
		else
			return false;
	}
	
	private static void parseSignal(String laneSignal, char lane) {
		String state = laneSignal.toLowerCase();
		
		if(state == "empty");
			// function call for empty lane singal
		if(state == "vechicle");
			// function call for vechicle detected signal
		if(state == "traffic");
			// function call for traffic detected signal
		if(state == "pedestrian");
			// function call for pedestrian detected singal
		if(state == "schoolbus");
			// function call for school bus detected
		if(state == "emergencyvechicle");
			// function call for emergency vechicle detected
		if(state == "accident");
			// functino call for accident detected
			
		
	}

}
