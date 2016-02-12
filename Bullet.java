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
         destroyEnemies();
         if (getWorld().getObjects(Zombie.class).isEmpty()) {
          Greenfoot.stop();
     }
        if(isAtEdge())
        {
           getWorld().removeObject(this);
        }
       
    }
    
      public void destroyEnemies()
    {
         
      Actor zombie = getOneIntersectingObject(Zombie.class);
      if(zombie != null) 
           {
           World myWorld = getWorld();
           getWorld().removeObject(zombie); 
           getWorld().removeObject(this);
           }
         
    }
    
}

