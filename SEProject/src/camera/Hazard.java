package camera;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import trafficInformation.TrafficCause;

public class Hazard {
    private String time;
    private String lane;
    private String hazardType;
    private String date;

    public Hazard() {
        this.time = "System time: " + LocalTime.now().toString();
        this.lane = "U";
        this.hazardType = "Accident";
    }

    public Hazard(String l) {
    	String pattern = "MM-dd-yyyy";
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    	String date = simpleDateFormat.format(new Date());
    	
    	this.date = date;
        this.time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")).toString();
        this.lane = l;
        this.hazardType = "Car accident";
    }

    public Hazard(String l, String hType) {
        this.time = "System time: " + LocalTime.now().toString();
        this.lane = l;
        this.hazardType = hType;
    }

    public Hazard(String l, String hType, String t) {
        this.time = t;
        this.lane = l;
        this.hazardType = hType;
    }

    public void report() {
        TrafficCause.addNewCause(this.hazardType, "accident", this.time, this.lane);
        System.out.println("Hazard report generated: ");
        System.out.println(" date: " + this.date);
        System.out.println(" time: " + this.time);
        System.out.println(" lane: " + this.lane);
        System.out.println(" type: " + this.hazardType);
    }
    
    public String[] getReport() {
    	String[] report = {time, lane, hazardType, date};
    	
    	return report;
    }
}
