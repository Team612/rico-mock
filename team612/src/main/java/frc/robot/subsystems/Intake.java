/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultIntake;

/**
 * @author Aryan Sinha
 */
public class Intake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  WPI_TalonSRX talonIntake = new WPI_TalonSRX(RobotMap.TALON_PORT_INTAKE);
  
  @Override
  public void initDefaultCommand() {
    talonIntake.setNeutralMode(NeutralMode.Coast);

    setDefaultCommand(new DefaultIntake());
  }

  public WPI_TalonSRX getTalon() {
    return talonIntake;
  }
}
