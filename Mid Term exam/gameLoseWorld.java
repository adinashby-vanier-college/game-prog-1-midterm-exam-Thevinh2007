// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class gameLoseWorld extends World
{

    /**
     * Constructor for objects of class gameLoseWorld.
     */
    public gameLoseWorld()
    {
        super(860, 860, 1);
        showTextWithBigRedFont("GAME OVER! ", 280, 460);
    }

    /**
     * 
     */
    public void showTextWithBigRedFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.RED);
        bg.drawString(message, x, y);
    }
}
