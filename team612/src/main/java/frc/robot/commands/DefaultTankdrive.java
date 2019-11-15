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

public class DefaultTankdrive extends Command {
  double SPEED = 0.5;
  public DefaultTankdrive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.tankdrive);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //Robot.arm.arm_Talon.set(OI.gunner.getY(Hand.kLeft) * SPEED);
    

    if((Math.abs(OI.driver.getY(Hand.kLeft)) > 0.1 )) {
      Robot.tankdrive.talon_fl.set(OI.driver.getRawAxis(1) * SPEED);
      Robot.tankdrive.talon_bl.set(OI.driver.getRawAxis(1) * SPEED);
    }
    if ((Math.abs(OI.driver.getY(Hand.kRight)) > 0.1 )) {
      Robot.tankdrive.talon_fr.set(OI.driver.getRawAxis(5) * SPEED);
      Robot.tankdrive.talon_br.set(OI.driver.getRawAxis(5) * SPEED);
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
