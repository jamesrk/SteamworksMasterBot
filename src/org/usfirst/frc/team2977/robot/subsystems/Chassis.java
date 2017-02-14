package org.usfirst.frc.team2977.robot.subsystems;

import org.usfirst.frc.team2977.robot.RobotMap;
import org.usfirst.frc.team2977.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chassis extends Subsystem {
    
	public Talon fL = new Talon(RobotMap.fL);
	public Talon fR = new Talon(RobotMap.fR);
	public Talon bL = new Talon(RobotMap.bL);
	public Talon bR = new Talon(RobotMap.bR);
	
	public void MechDrive(double axis1, double axis4, double axis0) {
		fL.set(-axis1 - axis4 - axis0);
		fR.set(axis1 - axis4 - axis0);
		bL.set(-axis1 + axis4 - axis0);
		bR.set(-axis1 - axis4 + axis0);
	}
	
	public void TurnRight(double speed) {
		fL.set(speed);
		fR.set(-speed);
		bL.set(speed);
		bR.set(-speed);
	}
	
	public void TurnLeft(double speed) {
		fL.set(-speed);
		fR.set(speed);
		bL.set(-speed);
		bR.set(speed);
	}
	
	public void Stop() {
		fL.set(0);
		fR.set(0);
		bL.set(0);
		bR.set(0);
	}
	
	public void DriveA() {
		fL.set(1);
		fR.set(1);
		bL.set(1);
		bR.set(1);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	// I am good memer and pornhub is free

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoysticks());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
} 

