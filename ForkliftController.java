/*
package org.usfirst.frc.team1318.robot.forklift;
import org.usfirst.frc.team1318.robot.ElectronicsConstants;
import org.usfirst.frc.team1318.robot.TuningConstants;
import org.usfirst.frc.team1318.robot.common.IController;
import org.usfirst.frc.team1318.robot.driver.Driver;
import org.usfirst.frc.team1318.robot.driver.Operation;


import com.google.inject.Inject;
*/


public class ForkliftController implements IController {
	private Driver driver;
	private final ForkliftComponent forklift;
	
	public ForkliftController(ForkliftComponent forklift) {
		this.forklift = forklift;
	}
	
	
	public void update() {
		int i;
		
		if(Operation.ForkliftUp) {
			this.forklift.setmotorPower(FORKLIFT_MAX_MOTOR_POWER);
			i = 1;
		}
		
		if (i = 1 && (LimitSwitchTop || LimitSwitchBottom)) {
			this.forklift.setReadyLight(on);
			else
				this.forklift.setReadyLight(false);
		}
	
	}
	
	
	public void stop() {
		this.forklift.stop();
	}
	
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
}
