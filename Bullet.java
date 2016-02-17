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
      
        removeBullet();
       
        // Ends game if no zombie
        // if(getWorld().getObjects(Zombie.class).isEmpty()) {
       //   Greenfoot.stop();
       // }
        
       
     
        
       
    }
    
      public void removeBullet()
    {
       boolean deleteMe = false;
        if(isAtEdge())
        {  
         World myWorld = getWorld();
         deleteMe = true;
         
       }
      Actor zombie = getOneIntersectingObject(Zombie.class);
      if(zombie != null) 
           {
           World myWorld = getWorld();
           --Zombie.lives;
           deleteMe = true;
           if(Zombie.lives <= 0){
           getWorld().showText("Lives:" + 0,60,15);
           getWorld().removeObject(zombie); 
           }
        }
         
        if (deleteMe == true){
       getWorld().removeObject(this);
    }
    }
    
}

