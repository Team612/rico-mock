/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultArm;
import frc.robot.commands.DefaultTankdrive;

/**
 * Add your docs here.
 */
public class Tankdrive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public  Talon talon_fr = new Talon(RobotMap.TALON_PORT_FR);
  public  Talon talon_br = new Talon(RobotMap.TALON_PORT_BR);
  public  Talon talon_fl = new Talon(RobotMap.TALON_PORT_FL);
  public  Talon talon_bl = new Talon(RobotMap.TALON_PORT_BL);


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DefaultTankdrive());
  }
}
