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
import frc.robot.subsystems.Camera;

public class DefaultCamera extends Command {
  public DefaultCamera() {
    
    // Use requires() here to declare subsystem dependencies
    requires(Robot.camera);
  }
  boolean isFront = false;
  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
   
   
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    
      isFront = !isFront;

    /*
  if(OI.driver_button_A.get() == true && isFront == true ){
    isFront = false;   
  }
  if(OI.driver_button_A.get() == true && isFront == false ){
    isFront = true;
  }
  */
   if(isFront) Camera.camera_Servo.set(0);
   else Camera.camera_Servo.set(90);

   System.out.println(isFront);
  System.out.println(Camera.camera_Servo.get());



  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
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
