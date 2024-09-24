// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * Act - do whatever the Pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(0);
        if (Greenfoot.isKeyDown("w")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-3);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor Pig;
        if (0!=true) {
        }
    }
}
