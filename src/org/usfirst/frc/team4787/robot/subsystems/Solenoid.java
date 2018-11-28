package org.usfirst.frc.team4787.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4787.robot.RobotMap;
/**
 *
 */
public class Solenoid extends Subsystem {

	private DoubleSolenoid sol; 
	
	public Solenoid() {
		super();
		
		sol = new DoubleSolenoid(RobotMap.solenoid_pin1, RobotMap.solenoid_pin2);
	}
	
	public void setPosition(DoubleSolenoid.Value value) {
		sol.set(value);
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

