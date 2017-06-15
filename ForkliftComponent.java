/*
package org.usfirst.frc.team1318.robot.forklift;
import org.usfirst.frc.team1318.robot.common.IDashboardLogger;
import org.usfirst.frc.team1318.robot.common.wpilibmocks.IMotor;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
*/



public class ForkliftComponent {

	private final IMotor motor;
	private final ISolenoid readyLight;
	private final ISolenoid touchSensor;
	
	
	public ForkliftComponent(@Named("FORKLIFT_MOTOR") IMotor motor) {
		this.motor = motor;
	}
	
	
	public void setmotorPower(double power) {
		this.motor.set(power);
	}
	
	public void setReadyLight(boolean on) {
		this.readyLight.set(on);
	}
	
	public touchSensorOn() {
		return this.touchSensor.get();
	}
	
	public void stop() {
		this.motor.setPower(0.0);
		this.readyLight.setReadyLight(false);
		
	}
}
