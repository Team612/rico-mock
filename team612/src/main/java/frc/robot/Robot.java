package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.ServoCamera;

public class Robot extends TimedRobot 
{

    public static final ServoCamera driver_servo = new ServoCamera();
    public static final Arm arm = new Arm();

    public static final DriveTrain drive_train = new DriveTrain();
    public static OI oi;

    private Command autonomousCommand;
    private SendableChooser<Command> chooser = new SendableChooser<>();

    @Override
    public void robotInit() 
    {
        oi = new OI();
    }

    @Override
    public void disabledInit() 
    {
        
    }

    @Override
    public void disabledPeriodic() 
    {
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit() 
    {
        autonomousCommand = chooser.getSelected();

        if (autonomousCommand != null) 
        {
            autonomousCommand.start();
        }
    }

    @Override
    public void autonomousPeriodic() 
    {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() 
    {
        if (autonomousCommand != null) 
        {
            autonomousCommand.cancel();
        }
    }

    @Override
    public void teleopPeriodic() 
    {
        Scheduler.getInstance().run();
    }

    @Override
    public void testPeriodic() 
    {
        
    }
    
}
