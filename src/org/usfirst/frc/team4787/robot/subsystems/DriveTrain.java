package org.usfirst.frc.team4787.robot.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PIDController;

import org.usfirst.frc.team4787.robot.RobotMap;

/**
 *
 */
public class DriveTrain extends PIDSubsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Talon front_left;
	private Talon back_left;
	private Talon front_right;
	private Talon back_right;
	private SpeedControllerGroup motor_left;
	private SpeedControllerGroup motor_right; 
	private DifferentialDrive motor_drive;
	private AnalogGyro m_gyro;
	
	public DriveTrain() {
		//sets the pid values, might need feed forward
		super(1,1,1);
		
		
		front_left = new Talon(RobotMap.motor_front_left);
		back_left = new Talon(RobotMap.motor_back_left);
		front_right = new Talon(RobotMap.motor_front_right);
		back_right = new Talon(RobotMap.motor_back_right);
		motor_left = new SpeedControllerGroup(front_left, back_left);
		motor_right = new SpeedControllerGroup(front_right, back_right); 
		motor_drive = new DifferentialDrive(motor_left, motor_right);
		m_gyro = new AnalogGyro(RobotMap.gyro);
		
		m_gyro.calibrate();
	}
    
	public void initDefaultCommand() {	
	}
	
    public void stopMotors() {
    	motor_drive.tankDrive(0, 0);
    }
    
    public void drive(double lSpeed, double rSpeed) {	
    	motor_drive.tankDrive(lSpeed, rSpeed);
    }
    
    //for auto
    public void setAngle(double angle) {
    	setSetpoint(angle);
    }

	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		
		return m_gyro.getAngle();
	}

	@Override
	protected void usePIDOutput(double output) {
		// TODO Auto-generated method stub
		drive(output, -output);
		
	}
    
    //public void drive(Joystick joy) {
    //	this.drive(-joy.getY(), -joy.getThrottle());
    //}
    

    ///umm this would not work??? 
}

