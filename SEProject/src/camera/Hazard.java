package camera;

import java.time.LocalTime;
import trafficInformation.TrafficCause;

public class Hazard {
    private String time;
    private String lane;
    private String hazardType;

    public Hazard() {
        this.time = "System time: " + LocalTime.now().toString();
        this.lane = "U";
        this.hazardType = "Unspecified accident";
    }

    public Hazard(String l) {
        this.time = "System time: " + LocalTime.now().toString();
        this.lane = l;
        this.hazardType = "Unspecified accident";
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
        System.out.println(" time: " + this.time);
        System.out.println(" lane: " + this.lane);
        System.out.println(" type: " + this.hazardType);
    }
}
