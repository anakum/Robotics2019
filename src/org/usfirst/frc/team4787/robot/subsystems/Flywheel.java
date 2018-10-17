package org.usfirst.frc.team4787.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Flywheel extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Spark fly1;
	private Spark fly2;
	
	public Flywheel() {
		fly1 = new Spark(5);
		fly2 = new Spark(6);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double speed) {
    	fly1.set(speed);
    	fly2.set(-speed);
    }
}

