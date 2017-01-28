package org.usfirst.frc.team2977.robot.subsystems;

import org.usfirst.frc.team2977.robot.RobotMap;
import org.usfirst.frc.team2977.robot.commands.ClimbTime;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {
    
	Talon climby = new Talon(RobotMap.climberPort);
	
	public void ClimbMethod() {
		climby.set(1);
	}
	
	public void StopClimbing() {
		climby.set(0);
	}
    
    public void initDefaultCommand() {
    	setDefaultCommand(new ClimbTime());    	
    }
}

