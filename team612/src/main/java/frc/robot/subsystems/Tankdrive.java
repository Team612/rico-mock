/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

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
  public  WPI_TalonSRX talon_fr = new WPI_TalonSRX(RobotMap.TALON_PORT_FR);
  public  WPI_TalonSRX talon_br = new WPI_TalonSRX(RobotMap.TALON_PORT_BR);
  public  WPI_TalonSRX talon_fl = new WPI_TalonSRX(RobotMap.TALON_PORT_FL);
  public  WPI_TalonSRX talon_bl = new WPI_TalonSRX(RobotMap.TALON_PORT_BL);


  @Override
  public void initDefaultCommand() {
    talon_fr.setNeutralMode(NeutralMode.Brake);
    talon_br.setNeutralMode(NeutralMode.Brake);
    talon_fl.setNeutralMode(NeutralMode.Brake);
    talon_bl.setNeutralMode(NeutralMode.Brake);
    // Set the default command for a subsystem here.
    setDefaultCommand(new DefaultTankdrive());
  }
}
