package setup;

public class Car {

	private String track;

	// Adjustments
	private double powerAdjust;
	private double weightPenalty;

	// Tires
	private double tireLeftFrontColdPressure;
	private double tireRightFrontColdPressure;
	private double tireLeftRearColdPressure;
	private double tireRightRearColdPressure;

	// Chassis Front
	private double chassisFrontSteeringRatio;
	private double chassisFrontSteeringOffset;

	// Chassis Left Front
	private double chassisLeftFrontBumpStiffness;
	private double chassisLeftFrontReboundStiffness;

	// Chassis Right Front
	private double chassisRightFrontBumpStiffness;
	private double chassisRightFrontReboundStiffness;

	// Chassis Left Rear
	private double chassisLeftRearBumpStiffness;
	private double chassisLeftRearReboundStiffness;
	private double chassisLeftRearBumpRubberRate;

	// Chassis Right Rear
	private double chassisRightRearBumpStiffness;
	private double chassisRightRearReboundStiffness;

	// Chassis Rear
	private double chassisRearRearEndRatio;

	// Getters and Setters
	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public double getPowerAdjust() {
		return powerAdjust;
	}

	public void setPowerAdjust(double powerAdjust) {
		this.powerAdjust = powerAdjust;
	}

	public double getWeightPenalty() {
		return weightPenalty;
	}

	public void setWeightPenalty(double weightPenalty) {
		this.weightPenalty = weightPenalty;
	}

	public double getTireLeftFrontColdPressure() {
		return tireLeftFrontColdPressure;
	}

	public void setTireLeftFrontColdPressure(double tireLeftFrontColdPressure) {
		this.tireLeftFrontColdPressure = tireLeftFrontColdPressure;
	}

	public double getTireRightFrontColdPressure() {
		return tireRightFrontColdPressure;
	}

	public void setTireRightFrontColdPressure(double tireRightFrontColdPressure) {
		this.tireRightFrontColdPressure = tireRightFrontColdPressure;
	}

	public double getTireLeftRearColdPressure() {
		return tireLeftRearColdPressure;
	}

	public void setTireLeftRearColdPressure(double tireLeftRearColdPressure) {
		this.tireLeftRearColdPressure = tireLeftRearColdPressure;
	}

	public double getTireRightRearColdPressure() {
		return tireRightRearColdPressure;
	}

	public void setTireRightRearColdPressure(double tireRightRearColdPressure) {
		this.tireRightRearColdPressure = tireRightRearColdPressure;
	}

	public double getChassisFrontSteeringRatio() {
		return chassisFrontSteeringRatio;
	}

	public void setChassisFrontSteeringRatio(double chassisFrontSteeringRatio) {
		this.chassisFrontSteeringRatio = chassisFrontSteeringRatio;
	}

	public double getChassisFrontSteeringOffset() {
		return chassisFrontSteeringOffset;
	}

	public void setChassisFrontSteeringOffset(double chassisFrontSteeringOffset) {
		this.chassisFrontSteeringOffset = chassisFrontSteeringOffset;
	}

	public double getChassisLeftFrontBumpStiffness() {
		return chassisLeftFrontBumpStiffness;
	}

	public void setChassisLeftFrontBumpStiffness(double chassisLeftFrontBumpStiffness) {
		this.chassisLeftFrontBumpStiffness = chassisLeftFrontBumpStiffness;
	}

	public double getChassisLeftFrontReboundStiffness() {
		return chassisLeftFrontReboundStiffness;
	}

	public void setChassisLeftFrontReboundStiffness(double chassisLeftFrontReboundStiffness) {
		this.chassisLeftFrontReboundStiffness = chassisLeftFrontReboundStiffness;
	}

	public double getChassisRightFrontBumpStiffness() {
		return chassisRightFrontBumpStiffness;
	}

	public void setChassisRightFrontBumpStiffness(double chassisRightFrontBumpStiffness) {
		this.chassisRightFrontBumpStiffness = chassisRightFrontBumpStiffness;
	}

	public double getChassisRightFrontReboundStiffness() {
		return chassisRightFrontReboundStiffness;
	}

	public void setChassisRightFrontReboundStiffness(double chassisRightFrontReboundStiffness) {
		this.chassisRightFrontReboundStiffness = chassisRightFrontReboundStiffness;
	}

	public double getChassisLeftRearBumpStiffness() {
		return chassisLeftRearBumpStiffness;
	}

	public void setChassisLeftRearBumpStiffness(double chassisLeftRearBumpStiffness) {
		this.chassisLeftRearBumpStiffness = chassisLeftRearBumpStiffness;
	}

	public double getChassisLeftRearReboundStiffness() {
		return chassisLeftRearReboundStiffness;
	}

	public void setChassisLeftRearReboundStiffness(double chassisLeftRearReboundStiffness) {
		this.chassisLeftRearReboundStiffness = chassisLeftRearReboundStiffness;
	}

	public double getChassisLeftRearBumpRubberRate() {
		return chassisLeftRearBumpRubberRate;
	}

	public void setChassisLeftRearBumpRubberRate(double chassisLeftRearBumpRubberRate) {
		this.chassisLeftRearBumpRubberRate = chassisLeftRearBumpRubberRate;
	}

	public double getChassisRightRearBumpStiffness() {
		return chassisRightRearBumpStiffness;
	}

	public void setChassisRightRearBumpStiffness(double chassisRightRearBumpStiffness) {
		this.chassisRightRearBumpStiffness = chassisRightRearBumpStiffness;
	}

	public double getChassisRightRearReboundStiffness() {
		return chassisRightRearReboundStiffness;
	}

	public void setChassisRightRearReboundStiffness(double chassisRightRearReboundStiffness) {
		this.chassisRightRearReboundStiffness = chassisRightRearReboundStiffness;
	}

	public double getChassisRearRearEndRatio() {
		return chassisRearRearEndRatio;
	}

	public void setChassisRearRearEndRatio(double chassisRearRearEndRatio) {
		this.chassisRearRearEndRatio = chassisRearRearEndRatio;
	}
}