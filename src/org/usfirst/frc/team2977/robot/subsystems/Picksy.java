package org.usfirst.frc.team2977.robot.subsystems;

import org.usfirst.frc.team2977.robot.Robot;
import org.usfirst.frc.team2977.robot.commands.PicksyMove;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Picksy extends Subsystem {
	
	AnalogInput PixyA = new AnalogInput(0);
	DigitalInput PixyD = new DigitalInput(9);
	
	
	public void Godzilla() {
		double pA = PixyA.getAverageVoltage();
		boolean pD = PixyD.get();
		PixyA.setAverageBits(10);
		if(pA > 0 && pD == true){
			SmartDashboard.putNumber("Pixy Voltage", (pA * 100) - 220.336892);
		}
		else if (pD == false){
			SmartDashboard.putNumber("Pixy Voltage", 9999);
		} else {
			SmartDashboard.putNumber("Pixy Voltage", 18069);	
		}
		SmartDashboard.putBoolean("Are you seeing it?", pD);
	}
	public void GodzillaWalking() {
		if(PixyA.getAverageVoltage() > 1 && PixyD.get() == true) {
			Robot.chassis.TurnRight(.2);
		}
		if (PixyA.getAverageVoltage() < 1 && PixyD.get() == true) {
			Robot.chassis.TurnLeft(.2);
		}
		if (PixyD.get() == false){
			Robot.chassis.Stop();
		}
		else {
			Robot.chassis.Stop();
		}
		
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new PicksyMove());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

