package storage;

import java.util.ArrayList;

import camera.Hazard;

public class Storage {
	
	public static ArrayList<String[]> reports = new ArrayList<>();
	
	
	
	
	public static void storeReport(Hazard r) {
		reports.add(r.getReport());
	}
	
	public static void main(String[] args) {
		String[] report = {"time", "lane"};
		reports.add(report);
		
		String[] temp = reports.get(0);
		
		System.out.print(temp[0]);
		
		
	}


}
