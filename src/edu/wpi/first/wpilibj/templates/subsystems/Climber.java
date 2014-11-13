/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.templates.commands.ExampleCommand;
import edu.wpi.first.wpilibj.templates.commands.Climb;
/**
 *
 * @author 200198
 */
public class Climber extends Subsystem {
    DoubleSolenoid climberArm = new DoubleSolenoid(RobotMap.climberArm1,RobotMap.climberArm2);

    
    
    
    public void initDefaultCommand() {
        setDefaultCommand(new Climb());
    }
    
    public void armForward() {
        
    }
    
    public void armOff() {
        climberArm.set(DoubleSolenoid.Value.kOff);
    }
    public boolean armGet() {
        return climberArm.get() == DoubleSolenoid.Value.kForward;
    }
    
}
