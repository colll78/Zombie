import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private int direction, speed;
    public Bullet(int dir)
    {
        direction = dir;
        speed = 5;
    }
    public void act()
    {
        setRotation(direction);
        move(speed);
        if(isAtEdge())
        {
           getWorld().removeObject(this);
        }
   
    }
    
    
}

