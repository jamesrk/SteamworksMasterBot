package org.usfirst.frc.team2977.robot;

import org.usfirst.frc.team2977.robot.commands.ClimbTime;
import org.usfirst.frc.team2977.robot.commands.ClimberStop;
import org.usfirst.frc.team2977.robot.commands.ElevateNoMore;
import org.usfirst.frc.team2977.robot.commands.Elevater;
import org.usfirst.frc.team2977.robot.commands.InneyTakey;
import org.usfirst.frc.team2977.robot.commands.InneyTakeyStoppy;
import org.usfirst.frc.team2977.robot.commands.PicksyMove;
import org.usfirst.frc.team2977.robot.commands.Shoot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//Joystick
	public Joystick stick = new Joystick(1);
	
	//Buttons
	Button A = new JoystickButton(stick, 1);
	Button B = new JoystickButton(stick, 2);
	Button X = new JoystickButton(stick, 3);
	Button Y = new JoystickButton(stick, 4);
	Button L2 = new JoystickButton(stick, 5);
	Button R2 = new JoystickButton(stick, 6);
	Button Back = new JoystickButton(stick, 7);
	Button Start = new JoystickButton(stick, 8);
	Button L3 = new JoystickButton(stick, 9);
	Button R3 = new JoystickButton(stick, 10);
	
	//The Buttons That Operate on Axes
	//And Joysticks
	public double getLeftX() {
		return stick.getRawAxis(0);
	}
	
	public double getLeftY() {
		return stick.getRawAxis(1);
	}
	
	public double getLeftTrigger() {
		return stick.getRawAxis(2);
	}    
	
	public double getRightTrigger() {
		return stick.getRawAxis(3);
	}
	
	public double getRightX() {
		return stick.getRawAxis(4);
	}
	
	public double getRightY() {
		return stick.getRawAxis(5);
	}
	
	//Button Command Assignments
	public void RightTrigger() {
		if (stick.getRawAxis(5) >=.15 && stick.getRawAxis(5) <= 1);
			new Shoot();
	}
	
	public void Y() {
		Y.whenPressed(new InneyTakey());
		Y.whenReleased(new InneyTakeyStoppy());
	}
	
	public void A() {
		A.whenPressed(new ClimbTime());
		A.whenReleased(new ClimberStop());
	}
	
	public void B() {
		B.whenPressed(new Elevater());
		B.whenReleased(new ElevateNoMore());
	}
	
	public void L2() {
		L2.whileHeld(new PicksyMove());
	}
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}