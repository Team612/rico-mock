/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultClimb;

/**
 * Add your docs here.
 */
public class Climb extends Subsystem {
  public  WPI_TalonSRX frontClimb = new WPI_TalonSRX(RobotMap.CLIMB_PORT_FR);
  public WPI_TalonSRX backClimb = new WPI_TalonSRX(RobotMap.CLIMB_PORT_BK);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new DefaultClimb());
  }
}
