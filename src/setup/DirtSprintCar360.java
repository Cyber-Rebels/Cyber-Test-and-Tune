package setup;

public class DirtSprintCar360 {
	
	private String track;
	
	// Tires
	private int tireLFPSI;
	private int tireRFPSI;
	private int tireLRPSI;
	private int tireRRPSI;
	private double staggerFront;
	private double staggerRear;
	
	// Chassis Front
	private int steeringRatio;
	private int pitarmLegnth;
	private int steeringOffset;
	private int frontToeIn;
	private int wingAngleNose;
	private int wingAngleTop;
	private int wingPosition;
	
	// Chassis Left Front
	private double torsionBarDiameterLF;
	private double torsionBarStopLF;
	private double stiffnessBumpLF;
	private double stiffnessReboundLF;
	
	// Chassis Right Front
	private double torsionBarDiameterRF;
	private double torsionBarStopRF;
	private double stiffnessBumpRF;
	private double stiffnessReboundRF;
	
	// Chassis Left Rear
	private double torsionBarDiameterLR;
	private double torsionBarStopLR;
	private double stiffnessBumpLR;
	private double stiffnessReboundLR;
	private int bumpRubberRate;
	private float packer;
	private double wheelSpacingLR;
	
	// Chassis Right Rear
	private double torsionBarDiameterRR;
	private double torsionBarStopRR;
	private double stiffnessBumpRR;
	private double stiffnessReboundRR;
	private double wheelSpacingRR;
	
	// Chassis Rear
	private int fuel;
	private double rearEndRatio;
	
	// Getter and setters
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public int getTireLFPSI() {
		return tireLFPSI;
	}
	public void setTireLFPSI(int tireLFPSI) {
		this.tireLFPSI = tireLFPSI;
	}
	public int getTireRFPSI() {
		return tireRFPSI;
	}
	public void setTireRFPSI(int tireRFPSI) {
		this.tireRFPSI = tireRFPSI;
	}
	public int getTireLRPSI() {
		return tireLRPSI;
	}
	public void setTireLRPSI(int tireLRPSI) {
		this.tireLRPSI = tireLRPSI;
	}
	public int getTireRRPSI() {
		return tireRRPSI;
	}
	public void setTireRRPSI(int tireRRPSI) {
		this.tireRRPSI = tireRRPSI;
	}
	public double getStaggerFront() {
		return staggerFront;
	}
	public void setStaggerFront(double staggerFront) {
		this.staggerFront = staggerFront;
	}
	public double getStaggerRear() {
		return staggerRear;
	}
	public void setStaggerRear(double staggerRear) {
		this.staggerRear = staggerRear;
	}
	public int getSteeringRatio() {
		return steeringRatio;
	}
	public void setSteeringRatio(int steeringRatio) {
		this.steeringRatio = steeringRatio;
	}
	public int getPitarmLegnth() {
		return pitarmLegnth;
	}
	public void setPitarmLegnth(int pitarmLegnth) {
		this.pitarmLegnth = pitarmLegnth;
	}
	public int getSteeringOffset() {
		return steeringOffset;
	}
	public void setSteeringOffset(int steeringOffset) {
		this.steeringOffset = steeringOffset;
	}
	public int getFrontToeIn() {
		return frontToeIn;
	}
	public void setFrontToeIn(int frontToeIn) {
		this.frontToeIn = frontToeIn;
	}
	public int getWingAngleNose() {
		return wingAngleNose;
	}
	public void setWingAngleNose(int wingAngleNose) {
		this.wingAngleNose = wingAngleNose;
	}
	public int getWingAngleTop() {
		return wingAngleTop;
	}
	public void setWingAngleTop(int wingAngleTop) {
		this.wingAngleTop = wingAngleTop;
	}
	public int getWingPosition() {
		return wingPosition;
	}
	public void setWingPosition(int wingPosition) {
		this.wingPosition = wingPosition;
	}
	public double getTorsionBarDiameterLF() {
		return torsionBarDiameterLF;
	}
	public void setTorsionBarDiameterLF(double torsionBarDiameterLF) {
		this.torsionBarDiameterLF = torsionBarDiameterLF;
	}
	public double getTorsionBarStopLF() {
		return torsionBarStopLF;
	}
	public void setTorsionBarStopLF(double torsionBarStopLF) {
		this.torsionBarStopLF = torsionBarStopLF;
	}
	public double getStiffnessBumpLF() {
		return stiffnessBumpLF;
	}
	public void setStiffnessBumpLF(double stiffnessBumpLF) {
		this.stiffnessBumpLF = stiffnessBumpLF;
	}
	public double getStiffnessReboundLF() {
		return stiffnessReboundLF;
	}
	public void setStiffnessReboundLF(double stiffnessReboundLF) {
		this.stiffnessReboundLF = stiffnessReboundLF;
	}
	public double getTorsionBarDiameterRF() {
		return torsionBarDiameterRF;
	}
	public void setTorsionBarDiameterRF(double torsionBarDiameterRF) {
		this.torsionBarDiameterRF = torsionBarDiameterRF;
	}
	public double getTorsionBarStopRF() {
		return torsionBarStopRF;
	}
	public void setTorsionBarStopRF(double torsionBarStopRF) {
		this.torsionBarStopRF = torsionBarStopRF;
	}
	public double getStiffnessBumpRF() {
		return stiffnessBumpRF;
	}
	public void setStiffnessBumpRF(double stiffnessBumpRF) {
		this.stiffnessBumpRF = stiffnessBumpRF;
	}
	public double getStiffnessReboundRF() {
		return stiffnessReboundRF;
	}
	public void setStiffnessReboundRF(double stiffnessReboundRF) {
		this.stiffnessReboundRF = stiffnessReboundRF;
	}
	public double getTorsionBarDiameterLR() {
		return torsionBarDiameterLR;
	}
	public void setTorsionBarDiameterLR(double torsionBarDiameterLR) {
		this.torsionBarDiameterLR = torsionBarDiameterLR;
	}
	public double getTorsionBarStopLR() {
		return torsionBarStopLR;
	}
	public void setTorsionBarStopLR(double torsionBarStopLR) {
		this.torsionBarStopLR = torsionBarStopLR;
	}
	public double getStiffnessBumpLR() {
		return stiffnessBumpLR;
	}
	public void setStiffnessBumpLR(double stiffnessBumpLR) {
		this.stiffnessBumpLR = stiffnessBumpLR;
	}
	public double getStiffnessReboundLR() {
		return stiffnessReboundLR;
	}
	public void setStiffnessReboundLR(double stiffnessReboundLR) {
		this.stiffnessReboundLR = stiffnessReboundLR;
	}
	public int getBumpRubberRate() {
		return bumpRubberRate;
	}
	public void setBumpRubberRate(int bumpRubberRate) {
		this.bumpRubberRate = bumpRubberRate;
	}
	public float getPacker() {
		return packer;
	}
	public void setPacker(float packer) {
		this.packer = packer;
	}
	public double getWheelSpacingLR() {
		return wheelSpacingLR;
	}
	public void setWheelSpacingLR(double wheelSpacingLR) {
		this.wheelSpacingLR = wheelSpacingLR;
	}
	public double getTorsionBarDiameterRR() {
		return torsionBarDiameterRR;
	}
	public void setTorsionBarDiameterRR(double torsionBarDiameterRR) {
		this.torsionBarDiameterRR = torsionBarDiameterRR;
	}
	public double getTorsionBarStopRR() {
		return torsionBarStopRR;
	}
	public void setTorsionBarStopRR(double torsionBarStopRR) {
		this.torsionBarStopRR = torsionBarStopRR;
	}
	public double getStiffnessBumpRR() {
		return stiffnessBumpRR;
	}
	public void setStiffnessBumpRR(double stiffnessBumpRR) {
		this.stiffnessBumpRR = stiffnessBumpRR;
	}
	public double getStiffnessReboundRR() {
		return stiffnessReboundRR;
	}
	public void setStiffnessReboundRR(double stiffnessReboundRR) {
		this.stiffnessReboundRR = stiffnessReboundRR;
	}
	public double getWheelSpacingRR() {
		return wheelSpacingRR;
	}
	public void setWheelSpacingRR(double wheelSpacingRR) {
		this.wheelSpacingRR = wheelSpacingRR;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	public double getRearEndRatio() {
		return rearEndRatio;
	}
	public void setRearEndRatio(double rearEndRatio) {
		this.rearEndRatio = rearEndRatio;
	}
}
