/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultArm;

/**
 * Add your docs here.
 */
public class Arm extends Subsystem {

  public WPI_TalonSRX arm_talon = new WPI_TalonSRX(RobotMap.ARM_TALLON);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    arm_talon.setNeutralMode(NeutralMode.Brake);
    // Set the default command for a subsystem here.
    setDefaultCommand(new DefaultArm());
  }
}
