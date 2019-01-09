package org.usfirst.frc.team4787.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalOutput;

/**
 *
 */
public class Cannon extends Subsystem {

	int solenoidport = 1;
	
	DigitalOutput solenoid = new DigitalOutput(solenoidport);
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	solenoid.set(true);
    	try {
			Thread.sleep(300);
		} catch (Exception e) {
		}
    	solenoid.set(false);
    }
}

