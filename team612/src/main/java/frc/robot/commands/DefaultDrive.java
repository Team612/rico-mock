/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

public class DefaultDrive extends Command {
  //Cartesian plane movement stuff
  public double LeftX;
  public double LeftY;
  public double RightX;

  //Dead Zone for for side to side movement
  public double DeadZone = 0.25;

  //Distance for Ultrasonic sensor 
  public double distance = Robot.drive_train.ultra_sonic.getRangeInches();

  public DefaultDrive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.drive_train);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    /*
    Robot.drive_train.FL.set(OI.driver.getY(Hand.kLeft));
    Robot.drive_train.BL.set(OI.driver.getY(Hand.kLeft));

    Robot.drive_train.FR.set(OI.driver.getY(Hand.kRight));
    Robot.drive_train.BR.set(OI.driver.getY(Hand.kRight));
    */
    LeftX = OI.driver.getX(Hand.kLeft);
    LeftY = OI.driver.getY(Hand.kLeft);
    RightX = OI.driver.getX(Hand.kRight);

    if(Math.abs(LeftX) < DeadZone){
      LeftX = 0;
    }
    if(Math.abs(LeftY) < DeadZone){
      LeftY = 0;
    }
    if(Math.abs(RightX) < DeadZone){
      RightX = 0;
    }

    if(distance < 4){
      
      if (LeftY < 0) {
        Robot.drive_train.mecanumDrive.driveCartesian(LeftX, LeftY, RightX);
      } else {
        Robot.drive_train.mecanumDrive.driveCartesian(0, 0, 0);
      }


    } else {
      Robot.drive_train.mecanumDrive.driveCartesian(LeftX, LeftY, RightX);
    }
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
