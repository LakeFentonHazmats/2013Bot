/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.templates.commands.ExampleCommand;
import edu.wpi.first.wpilibj.templates.RobotMap;
import java.lang.Math;
import edu.wpi.first.wpilibj.templates.commands.DriveWithController;

/**
 *
 * @author Owner
public class DriveTrain extends Subsystem{
 */
public class DriveTrain extends Subsystem{
    Victor frontLeft = new Victor(RobotMap.frontLeftMotor);
    Victor frontRight = new Victor(RobotMap.frontRightMotor);
    Victor rearLeft = new Victor(RobotMap.rearLeftMotor);
    Victor rearRight = new Victor(RobotMap.rearRightMotor);
    double frontLeftSpeed;
    double frontRightSpeed;
    double rearLeftSpeed;
    double rearRightSpeed;
     public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithController());
     }
    
    public void roboTestDrive(double X, double Y, double Z) {
        frontLeftSpeed = X + Y + Z;
        frontRightSpeed = Y - X - Z;
        rearLeftSpeed = Y + X - Z;
        rearRightSpeed = Y - X - Z;
        
        double max = Math.abs(frontLeftSpeed);
        if (Math.abs(frontRightSpeed)>max) max = Math.abs(frontRightSpeed);
        if (Math.abs(rearLeftSpeed)>max) max = Math.abs(rearLeftSpeed);
        if (Math.abs(rearRightSpeed)>max) max = Math.abs(rearRightSpeed);
        
        if (max>1)
        {frontLeftSpeed/=max; frontRightSpeed/=max; rearLeftSpeed/=max; rearRightSpeed/=max;}
        
        frontLeft.set(frontLeftSpeed);
        frontRight.set(frontRightSpeed);
        rearLeft.set(rearLeftSpeed);
        rearRight.set(rearRightSpeed);
    }
}