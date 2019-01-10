package org.usfirst.frc.team4787.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4787.robot.RobotMap;
/**
 *
 */
public class SolenoidSubsystem extends Subsystem {

	private Solenoid sol; 
	
	public SolenoidSubsystem(solenoidPin) {
		super();
		
		sol = new Solenoid(solenoidPin);
	}
	
	public void set(boolean value) {
		sol.set(value);
	}
	
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new MySpecialCommand());
  }
}

