import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Color;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setPaintOrder(Zombie.class, Marine.class);
        prepare();
        
  }
   public void act()
{
     checkPlayers();
}
 
private void checkPlayers()
{
     if (getObjects(Zombie.class).isEmpty()) {
          Greenfoot.stop();
     }
}
  private void prepare()
    {
        
        Zombie zombie = new Zombie();
        addObject(zombie,getWidth()/2,getHeight()/2);
        
        Marine marine = new Marine();
        addObject(marine,(int)(Math.random() * ((800) + 1)),(int)(Math.random() * ((600) + 1)));
        
        Marine marine2 = new Marine();
        addObject(marine2,(int)(Math.random() * ((800) + 1)),(int)(Math.random() * ((600) + 1)));
        
        Marine marine3 = new Marine();
        addObject(marine3,(int)(Math.random() * ((800) + 1)),(int)(Math.random() * ((600) + 1)));
        
        Marine marine4 = new Marine();
        addObject(marine4,(int)(Math.random() * ((800) + 1)),(int)(Math.random() * ((600) + 1)));
        
        Marine marine5 = new Marine();
        addObject(marine5,(int)(Math.random() * ((800) + 1)),(int)(Math.random() * ((600) + 1)));
        
        Marine marine6 = new Marine();
        addObject(marine6,(int)(Math.random() * ((800) + 1)),(int)(Math.random() * ((600) + 1)));
    }
}
