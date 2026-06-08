import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stanice here.
 * 
 * @author (Hauerland Tomáš) 
 * @version (20.5.2026)
 */
public class Stanice extends Actor
{
    
    public void act()
    {
        if(isTouching(Actor.class))
        {
            getWorld().removeObject(this);
        }
    }
}
