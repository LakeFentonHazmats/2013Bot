/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;
import edu.wpi.first.wpilibj.templates.subsystems.Climber;
/**
 *
 * @author 200198
 */
public class Climb extends CommandBase {
    public Climb() {
        requires(climber);
    }
    
    
    protected void initialize() {
        
    }
    
    protected void execute() {
        climber.armForward();
    }
    
    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
        
    }
    
    protected void interrupted() {
        climber.armOff();
    }
}
