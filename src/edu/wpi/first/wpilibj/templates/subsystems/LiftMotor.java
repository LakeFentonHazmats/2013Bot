/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;

/**
 *
 * @author Owner
 */
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.ExampleCommand;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.Lift;
/**
 *
 * @author Nicster34
 */
public class LiftMotor extends Subsystem{
    Victor intakeMotor1 = new Victor(RobotMap.intakeMotor1);
    Victor intakeMotor2 = new Victor(RobotMap.intakeMotor2);
    public void initDefaultCommand() {
        setDefaultCommand(new Lift());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        
    }
     
    
   
    public void intakeDriveFoward (){
        intakeMotor1.set(0);
    }
    public void intakeDriveStop (){
        intakeMotor2.set(0);
    }

}