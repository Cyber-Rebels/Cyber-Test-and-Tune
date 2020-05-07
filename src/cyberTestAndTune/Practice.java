package cyberTestAndTune;

import java.util.ArrayList;

public class Practice {
	
	private ArrayList<Double> lapTimes = new ArrayList<Double>();
	
	public void addLap(Double time) {
		lapTimes.add(time);
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
}
