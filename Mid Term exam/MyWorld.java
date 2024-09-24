// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(860, 860, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pig pig =  new  Pig();
        addObject(pig, 159, 686);
        Snake snake =  new  Snake();
        addObject(snake, 575, 198);
        Burger burger =  new  Burger();
        addObject(burger, 176, 138);
        Burger burger2 =  new  Burger();
        addObject(burger2, 681, 14);
        Burger burger3 =  new  Burger();
        addObject(burger3, 237, 494);
        burger2.setLocation(707, 75);
        Burger burger4 =  new  Burger();
        addObject(burger4, 418, 110);
        Burger burger5 =  new  Burger();
        addObject(burger5, 262, 688);
        Burger burger6 =  new  Burger();
        addObject(burger6, 566, 736);
        Burger burger7 =  new  Burger();
        addObject(burger7, 662, 534);
        Burger burger8 =  new  Burger();
        addObject(burger8, 424, 433);
        Burger burger9 =  new  Burger();
        addObject(burger9, 655, 364);
        Burger burger10 =  new  Burger();
        addObject(burger10, 733, 249);
        Burger burger11 =  new  Burger();
        addObject(burger11, 213, 283);
        Burger burger12 =  new  Burger();
        addObject(burger12, 86, 77);
        Burger burger13 =  new  Burger();
        addObject(burger13, 452, 624);
        burger6.setLocation(693, 743);
        burger3.setLocation(-74, 488);
        burger3.setLocation(112, 499);
        burger.setLocation(131, 261);
        burger11.setLocation(322, 246);
        burger.setLocation(143, 275);
    }
}
