/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.ServoCamera;


public class DefaultServoCamera extends Command {
  public static boolean isPressed;
  public static int DirectionCamera;
  public DefaultServoCamera() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driver_servo);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    System.out.println("Running Servo Code");
    if(OI.driver_button_X.get()){
      isPressed = !isPressed;
    }

    if(isPressed){
      ServoCamera.servo_camera.setAngle(0);
      System.out.println(ServoCamera.servo_camera.getAngle());

      DirectionCamera = 1;
    }

   else{
      ServoCamera.servo_camera.setAngle(180);
      System.out.println(ServoCamera.servo_camera.getAngle());
      DirectionCamera = -1;
      
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
