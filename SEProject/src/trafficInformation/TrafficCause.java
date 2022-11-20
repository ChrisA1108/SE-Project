package trafficInformation;

import java.util.ArrayList;

public class TrafficCause implements TrafficCauseInterface {
    private static ArrayList<String[]> causes = new ArrayList<>();

    public TrafficCause() {
    }

    public String getTrafficCause(int c) {
        return ((String[])causes.get(c))[0];
    }

    public String getTrafficCauseName(int c) {
        return ((String[])causes.get(c))[1];
    }

    public String getTrafficTime(int c) {
        return ((String[])causes.get(c))[2];
    }

    public String getLane(int c) {
        return ((String[])causes.get(c))[3];
    }

    public static void addNewCause(String cause, String name, String time, String lane) {
        causes.add(new String[]{cause, name, time, lane});
    }
}
