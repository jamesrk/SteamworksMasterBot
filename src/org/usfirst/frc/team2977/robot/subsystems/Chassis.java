package org.usfirst.frc.team2977.robot.subsystems;

import org.usfirst.frc.team2977.robot.Robot;
import org.usfirst.frc.team2977.robot.RobotMap;
import org.usfirst.frc.team2977.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chassis extends Subsystem {
    
	public Victor fL = new Victor(RobotMap.fL);
	public Victor fR = new Victor(RobotMap.fR);
	public Victor bL = new Victor(RobotMap.bL);
	public Victor bR = new Victor(RobotMap.bR);
	
	public void Drive() {
		fL.set((Robot.oi.stick.getRawAxis(1)) - Robot.oi.stick.getRawAxis(4) - Robot.oi.stick.getRawAxis(0));
		fR.set(-(Robot.oi.stick.getRawAxis(1)) - Robot.oi.stick.getRawAxis(4) - Robot.oi.stick.getRawAxis(0));
		bL.set(-(Robot.oi.stick.getRawAxis(1)) + Robot.oi.stick.getRawAxis(4) - Robot.oi.stick.getRawAxis(0));
		bR.set(-(Robot.oi.stick.getRawAxis(1)) - Robot.oi.stick.getRawAxis(4) + Robot.oi.stick.getRawAxis(0));
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoysticks());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

