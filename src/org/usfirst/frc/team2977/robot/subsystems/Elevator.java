package org.usfirst.frc.team2977.robot.subsystems;

import org.usfirst.frc.team2977.robot.RobotMap;
import org.usfirst.frc.team2977.robot.commands.Elevater;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Elevator extends Subsystem {
    DigitalInput emptyLimit = new DigitalInput(1);
    DigitalInput fullLimit = new DigitalInput(2);
	Talon elevatey = new Talon(RobotMap.elevatorPort);
	
	public void Elevate() {
		elevatey.set(1);
	}
	
	public void ElevateNoMas() {
		elevatey.set(0);
	}
	
	public void Limitations() {
		if (emptyLimit.get() == false) {
			SmartDashboard.putString("The Helix is", "Empty");
		}
			else {
			SmartDashboard.putString("The Helix is", "Full");
			}
		if (fullLimit.get() == true) {
			SmartDashboard.putString("The Helix is", "Full");
		}
			else {
			SmartDashboard.putString("The Helix is", "Empty");
		}
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new Elevater());

    }
}

