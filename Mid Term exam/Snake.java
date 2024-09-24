// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snake extends Actor
{

    /**
     * Make the snake start at a random pointing position
     */
    public Snake()
    {
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        transformBurgerToSnake();
        if (isGameLose()) {
            transitionToGameLoseWorld();
        }
        
    }

    /**
     * If the pig gets eaten then we lose
     */
    public boolean isGameLose()
    {
        World world = getWorld();
        if (world.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameLoseWorld()
    {
        World gameLoseWorld =  new  gameLoseWorld();
        Greenfoot.setWorld(gameLoseWorld);
        Greenfoot.playSound("lose.wav");
    }

    /**
     * Fonction to move the snake around
     */
    public void moveAround()
    {
        move(3);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * Fonction to eat the pig
     */
    public void eat()
    {
        Actor pig = getOneIntersectingObject(Pig.class);
        if (pig != null) {
            World world = getWorld();
            world.removeObject(pig);
        }
    }

    /**
     * Fonction to transfomr the burgers to snakes
     */
    public void transformBurgerToSnake()
    {
        Actor burger = getOneIntersectingObject(Burger.class);
        if (burger != null) {
            World world = getWorld();
            int x = burger.getX();
            int y = burger.getY();
            world.removeObject(burger);
            Snake snake =  new  Snake();
            world.addObject(snake, x, y);
        }
    }
}
