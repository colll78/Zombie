import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Color;
import java.util.List;
import java.util.Set;



/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Actor
{
    private int marinesEaten;
    
    public Zombie()  //Initializes Zombie
    {
        marinesEaten = 0;
    }
    
    public void act() 
    {
        move(2);
        checkKeyPress();
        lookforMarines();
        checkWorld();
    }
    
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(4);
        } 


    }
    
    public void lookforMarines()
    {
        Marine marine = (Marine) getOneIntersectingObject(Marine.class);
        if (marine != null) {       
        removeTouching(Marine.class);
        marinesEaten = marinesEaten + 1;
        Greenfoot.playSound("slurp.wav");
    }
        getWorld().showText("Marines:" + marinesEaten,100,30);
       
       Bullet bullet = (Bullet) getOneIntersectingObject(Bullet.class);
        if (bullet != null) {       
        World world;
        world = getWorld();
        world.removeObject(this);  
        Greenfoot.playSound("Pain.wav");
    }
    }
    
    public void checkWorld()
    {
        if(isAtEdge())
        {
           if(this.getX() == getWorld().getWidth())
           {
           getWorld().addObject(this,0,this.getY());
           getWorld().removeObject(this);
           }
            if(this.getY() == getWorld().getHeight())
           {
           getWorld().addObject(this,this.getX(),0);
           getWorld().removeObject(this);
           }
    }
}
}
