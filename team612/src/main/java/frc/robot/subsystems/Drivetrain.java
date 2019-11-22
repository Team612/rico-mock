/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public WPI_TalonSRX FL = new WPI_TalonSRX(RobotMap.TALON_PORT_FL);
  public WPI_TalonSRX FR = new WPI_TalonSRX(RobotMap.TALON_PORT_FR);
  public WPI_TalonSRX BL = new WPI_TalonSRX(RobotMap.TALON_PORT_BL);
  public WPI_TalonSRX BR = new WPI_TalonSRX(RobotMap.TALON_PORT_BR);
  public MecanumDrive mecanumDrive; 
  
  public DriveTrain() {
    mecanumDrive = new MecanumDrive(FL, BL, FR, BR);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DefaultDrive());
  }
}
