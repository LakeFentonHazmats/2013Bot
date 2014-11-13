/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;
import edu.wpi.first.wpilibj.templates.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;
/**
 *
 * @author 200198
 */
public class Autonomous extends CommandBase {
    DigitalInput limitSwitch = new DigitalInput(1);
    Servo servo = new Servo(1);
    public Autonomous() {
            requires (driveTrain);
}
    protected void initialize() {
        servo.set(1);
}
    protected void execute() {
        
        if (limitSwitch.get()){
            driveTrain.roboTestDrive(-0.5, 0,0);
        }
        else {
            shooter.armForward();
        }
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
        
    }
    protected void interrupted() {
        driveTrain.roboTestDrive(0, 0,0);
        shooter.armOff();
    }
}