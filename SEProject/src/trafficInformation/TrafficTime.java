package trafficInformation;

public interface TrafficTime {
	
	void setTime(String start, String end);
	
	String getTime();
	
	public void setLane(String lane);
	
	public String getLane();
	
}
