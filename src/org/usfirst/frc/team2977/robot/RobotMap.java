package org.usfirst.frc.team2977.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//Motors
	public static int fR = 0;
	public static int fL = 1;
	public static int bR = 2;
	public static int bL = 3;
	
	//Shooter
	public static int shootie = 5;
	
	//Intake
	public static int intake = 6;
	
	//Elevator
	public static int elevatorPort = 7;
	
	//Climber
	public static int climberPort = 8;
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
