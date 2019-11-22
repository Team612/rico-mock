/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
 
package frc.robot.commands;
 
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Arm;
import frc.robot.OI;
import frc.robot.Robot;
 
public class DefaultArm extends Command {
  
  double SPEED = 1;

 public DefaultArm() {
   // Use requires() here to declare subsystem dependencies
   // eg. requires(chassis);
   requires(Robot.arm);
 }
 
 // Called just before this Command runs the first time
 @Override
 protected void initialize() {
 
 }
 
 // Called repeatedly when this Command is scheduled to run
 @Override
 protected void execute() {
   Robot.arm.arm_Talon.set(OI.gunner.getY(Hand.kLeft) * SPEED);
 
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
 
 // subsystems is scheduled to run
 @Override
 protected void interrupted() {
 }
}
 
