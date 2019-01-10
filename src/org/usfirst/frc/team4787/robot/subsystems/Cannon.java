package org.usfirst.frc.team4787.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalOutput;
import org.usfirst.frc.team4787.robot.RobotMap;
/**
 *
 */
public class Cannon extends Subsystem {

  private MOTORINPUTCORRECTOBJECT angle_motor;

  public Cannon() {
    super(RobotMap.solenoid_pin)

    angle_motor = new aasdflk;asdjfasd;klf;
  }

  public rotate(double value) {
    angle_motor.method();
  }

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new MySpecialCommand());
    /*
     * solenoid.set(true);
    try {
			Thread.sleep(300);
		} catch (Exception e) {
		
    }
    solenoid.set(false);
    */
  }
}

