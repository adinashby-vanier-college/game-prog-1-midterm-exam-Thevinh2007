// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class gameWinWorld extends World
{

    /**
     * Constructor for objects of class gameWinWorld.
     */
    public gameWinWorld()
    {
        super(860, 860, 1);
        showtextWithBigGreenFont("YOU WON !", 280, 460);
    }

    /**
     * 
     */
    public void showtextWithBigGreenFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.GREEN);
        bg.drawString(message, x, y);
    }
}
