/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

//The drivetrain is a subsystem. You have to create a talon.

package frc.robot.subsystems;

import java.nio.channels.Channel;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultDrive;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  // This is where you create a talon as a class.
  // Template: public, Talon-name of thing you're making, insert name of the Talon, = new, Talon
  // cont'd (RobotMap (file name,., insert name of talon,_port)
  //After this, go to the RobotMap.java and assign the Talons to a port.
  public WPI_TalonSRX talon_fl = new WPI_TalonSRX(RobotMap.talon_fl_port);
  public WPI_TalonSRX talon_fr = new WPI_TalonSRX(RobotMap.talon_fr_port);
  public WPI_TalonSRX talon_bl = new WPI_TalonSRX(RobotMap.talon_bl_port);
  public WPI_TalonSRX talon_br = new WPI_TalonSRX(RobotMap.talon_br_port);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand (new DefaultDrive());
    // setDefaultCommand(new MySpecialCommand());
  }
}
