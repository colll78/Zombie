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
    public void destroyEnemies()
    {
        //"Enemy" can be any class that you want the bullet to destroy. 
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null) 
            {
            World myWorld = getWorld();
            getWorld().removeObject(enemy); 
            getWorld().removeObject(this);
        }
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

