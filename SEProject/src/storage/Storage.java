package storage;

import java.util.ArrayList;
import java.util.List;

import camera.Hazard;
import trafficInformation.TrafficTimes;

public class Storage {
	
	public static ArrayList<String[]> reports = new ArrayList<>();
	public static List<TrafficTimes> times = new ArrayList<>();
	
	
	
	public static void storeReport(Hazard r) {
		reports.add(r.getReport());
	}
	
	protected static void storeTrafficTime(String lane, String start, String end) {
		TrafficTimes time = new TrafficTimes();
		time.startTime = start;
		time.endTime = end;
		time.lane = lane;
		times.add(time);
	}
	
	public List<TrafficTimes> getTrafficTimes() {
		return times;
	}
	
	


}
