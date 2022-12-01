package trafficInformation;

public class TrafficTimes implements TrafficTime {
	 public String startTime = "";
	 public String endTime = "";
	 public String lane = "";

	@Override
	public void setTime(String start, String end) {
		this.startTime = start;
		this.endTime = end;
	}

	@Override
	public String getTime() {
		return this.startTime + this.endTime;
	}
	@Override
	
	public String getLane() {
		return this.lane;
	}
	@Override
	
	public void setLane(String lane) {
		this.lane = lane;
	}

}
