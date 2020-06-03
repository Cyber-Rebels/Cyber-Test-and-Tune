package practice;

import java.util.ArrayList;
import setup.*;

public class Practice {
	
	private String car;
	private ArrayList<Double> lapTimes = new ArrayList<Double>();
	
	//Cars
	DirtSprintCar360 dirtSprintCar360 = new DirtSprintCar360();
	
	public void addLap(Double time) {
		lapTimes.add(time);
	}
	
	public String getCar() {
		return car;
	}
	
	public void setCar(String car) {
		this.car = car;
	}
	
	public Double getLapTime(int lap) {
		return lapTimes.get(--lap);
	}
	
	public void setLapTime(int lap, Double time) {
		
		int lapsCompleted = lapTimes.size();
		
		if (lap - lapsCompleted == 1)
			addLap(time);
		else if (lap - lapsCompleted < 1)
			lapTimes.set(--lap, time);
		else {
			StringBuffer error = new StringBuffer();
			error.append("Error: Cannot edit lap ");
			error.append(lap);
			error.append(". Only ");
			error.append(lapsCompleted);
			error.append(" laps have been completed.");
			System.out.println(error);
		}
	}
	
	public void tune(String part, Double value) {
		switch(car) {
			case "DIRTSPRINTCAR360":
				return;
			default:
				return;
		}
	}
}
