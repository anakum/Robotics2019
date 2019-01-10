package org.usfirst.frc.team4787.robot.commands;

import org.usfirst.frc.team4787.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CannonFire extends Command {
    
    long tStart;

    public CannonFire() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.m_Cannon);

    }

    // Called just before this Command runs the first time    protected void initialize() {
    
    }

    protected void start() {
      tStart = System.currentTimeMillis();
      Robot.m_Cannon.set(true);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
      long tEnd = System.currentTimeMillis();
      long tDelta = tEnd - tStart;
      double elapsedSeconds = tDelta / 1000.0;
      if (elapsedSeconds > 0.3) {}
      return false;
    }

    // Called once after isFinished returns true
    protected void end() {
      Robot.m_Cannon.set(false)
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
