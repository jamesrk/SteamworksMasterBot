package org.usfirst.frc.team2977.robot.subsystems;

import org.usfirst.frc.team2977.robot.RobotMap;
import org.usfirst.frc.team2977.robot.commands.Shoot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
    
	Talon shootie = new Talon(RobotMap.shootie);
	
	public void Shooting(double alice) {
		shootie.set(alice);
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new Shoot());
    }
}

