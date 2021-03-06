import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Color;

/**
 * Write a description of class Marine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Marine extends Actor
{
    /**
     * Act - do whatever the Marine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    double time =0;
    public void act() 
    {
        move(3);
        turnAtEdge();
        randomTurn();
        
        if (time % 60 ==0 )
        {
            double x = getX() + 20*Math.cos(getRotation());
            double y = getY() + 20*Math.sin(getRotation());
        getWorld().addObject(new Bullet(getRotation()),(int)x ,(int)y );    
        }
        time = time + 1;
    }    
    
    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber(100)>90)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
    
    
    public void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(17);
        }
    }
    
    
}