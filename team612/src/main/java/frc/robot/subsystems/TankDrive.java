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
import frc.robot.commands.DefaultTank;

/**
 * Add your docs here.
 */
public class TankDrive extends Subsystem {

  public WPI_TalonSRX talon_FL = new WPI_TalonSRX(RobotMap.TANK_PORT_FL);
  public WPI_TalonSRX talon_FR = new WPI_TalonSRX(RobotMap.TANK_PORT_FR);
  public WPI_TalonSRX talon_BL = new WPI_TalonSRX(RobotMap.TANK_PORT_BL);
  public WPI_TalonSRX talon_BR = new WPI_TalonSRX(RobotMap.TANK_PORT_BR);
 
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new DefaultTank());
  }
}
