/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.templates.commands.ExampleCommand;
/**
 *
 * @author 200198
 */
public class Shooter extends Subsystem{
    DoubleSolenoid shooterArm = new DoubleSolenoid(1,2);
    
    
    
    public void initDefaultCommand() {
        setDefaultCommand(new ExampleCommand());
    }
    
    public void armForward() {
        shooterArm.set(DoubleSolenoid.Value.kForward);
    }
    
    public void armOff() {
        shooterArm.set(DoubleSolenoid.Value.kOff);
    }
    public boolean armGet() {
        return shooterArm.get() == DoubleSolenoid.Value.kForward;
    }
    
}
