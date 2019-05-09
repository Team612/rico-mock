package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultDrive;


public class Drivetrain extends Subsystem {

    // TODO: Change back to WPI_TalonSRX

    private Talon talon_FL = new Talon(RobotMap.TALON_PORT_FL);
    private Talon talon_FR = new Talon(RobotMap.TALON_PORT_FR);
    private Talon talon_BL = new Talon(RobotMap.TALON_PORT_BL);
    private Talon talon_BR = new Talon(RobotMap.TALON_PORT_BR);

    private MecanumDrive drivetrain;

    public Drivetrain() {

        /*
        talon_FR.setNeutralMode(NeutralMode.Brake);
        talon_FL.setNeutralMode(NeutralMode.Brake);
        talon_BR.setNeutralMode(NeutralMode.Brake);
        talon_BL.setNeutralMode(NeutralMode.Brake);
        */

        drivetrain = new MecanumDrive(talon_FL, talon_BL, talon_FR, talon_BR);
    }

    public Talon getTalon(int num){
        switch(num) {
            case 1:
                return talon_FL;
            case 2:
                return talon_FR;
            case 3:
                return talon_BL;
            case 4:
                return talon_BR;
            default:
                return null;
        }
    }
    public MecanumDrive getDriveTrain() {
        return drivetrain;
    }
    public void initDefaultCommand() {
        setDefaultCommand(new DefaultDrive());
        // .setNeutralMode(NeutralMode.Brake); for each Talon
    }

}

