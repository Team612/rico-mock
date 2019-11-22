/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

public class DefaultDrive extends Command {
  public DefaultDrive() {
    // Keeps it running.
    requires(Robot.drivetrain);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // Most programming is done here.
    Robot.drivetrain.talon_fr.set(OI.driver.getY(Hand.kRight)*-1);
    // Negeative one reverses right joystick so that left and right go in same direction.
    // Remember to add static to the other mentions.
    // .getY controls Y-axis (x-axis later). Hand.kRight means that it's for the right talons.
    Robot.drivetrain.talon_fl.set(OI.driver.getY(Hand.kLeft));
    // essentially direct it to the object "drivetrain," which is under Robot.java. There, it'll direct to the talons.
    // .set. OI.driver is object for controller.
    Robot.drivetrain.talon_br.set(OI.driver.getY(Hand.kRight)*-1);
    Robot.drivetrain.talon_bl.set(OI.driver.getY(Hand.kLeft));
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
