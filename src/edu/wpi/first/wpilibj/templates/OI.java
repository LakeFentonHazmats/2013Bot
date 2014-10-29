
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.Climb;
import edu.wpi.first.wpilibj.templates.commands.Shoot;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    Joystick stick = new Joystick(1);
    Joystick chain = new Joystick(2);
    Button abutton = new JoystickButton(stick, 1);
    Button rightbutton5 = new JoystickButton(stick, 5);
    Button rightbutton6 = new JoystickButton(chain, 1);

    public OI(){
        abutton.whenPressed(new Climb());
        rightbutton6.whenPressed(new Shoot());
    }
    
    public double getLeftSpeed() {
        return stick.getY();
    }
     
    public double getRightSpeed() {
        return stick.getRawAxis(3);
    }
    
    public double getLiftSpeed() {
        return stick.getRawAxis(5);
}
}

