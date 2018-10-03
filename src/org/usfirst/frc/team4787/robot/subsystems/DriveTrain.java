package org.usfirst.frc.team4787.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Joystick;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Talon front_left;
	private Talon back_left;
	private Talon front_right;
	private Talon back_right;
	private SpeedControllerGroup motor_left;
	private SpeedControllerGroup motor_right; 
	private DifferentialDrive motor_drive;
	
	public DriveTrain() {
		super();
		
		front_left = new Talon(0);
		back_left = new Talon(1);
		front_right = new Talon(2);
		back_right = new Talon(3);
		motor_left = new SpeedControllerGroup(front_left, back_left);
		motor_right = new SpeedControllerGroup(front_right, back_right); 
		motor_drive = new DifferentialDrive(motor_left, motor_right);
	}
    
	public void initDefaultCommand() {	
	}
	
    public void stopMotors() {
    	motor_drive.tankDrive(0, 0);
    }
    
    public void drive(double lSpeed, double rSpeed) {	
    	motor_drive.tankDrive(lSpeed, rSpeed);
    }
    
    public void drive(Joystick joy) {
    	
    }
    
}

