/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.templates.commands.ExampleCommand;

/**
 *
 * @author Owner
public class DriveTrain extends Subsystem{
 */
public class DriveTrain extends Subsystem{
    RobotDrive drive = new RobotDrive(4,3);
     public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ExampleCommand());
     }
    
    public void roboDrive(double throttle, double twist) {
        drive.mecanumDrive_Cartesian(twist, twist, twist, throttle);
    }
}