package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Hatch;

public class Robot extends TimedRobot 
{
    public static final Hatch s_hatch = new Hatch();
    public static final Drivetrain drivetrain = new Drivetrain();

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
