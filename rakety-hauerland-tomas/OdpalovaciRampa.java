import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class OdpalovaciRampa here.
 * 
 * @author (Hauerland Tomáš) 
 * @version (20.5.2026)
 */
public class OdpalovaciRampa extends Actor
{
    List <Raketa> seznamRaket = new ArrayList<>();
    public void act()
    {
        pohyb();
        seznam();
    }
    public void pohyb()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi !=null)
        {
            turnTowards(mi.getX(), mi.getY());
        }
    }
    public void seznam()
    {
        Raketa r =(Raketa) getOneIntersectingObject(Raketa.class);
        if (r !=null)
        {
            seznamRaket.add(r);
        }
        if("up".equals(Greenfoot.getKey()))
        {
            //getWorld().showText("Palivo: "+Raketa.palivo, 50, 50);
            //palivo=+10;
        }
        if ("space".equals(Greenfoot.getKey()))
        {
            getWorld().addObject(new Raketa(), getX(), getY());
        }
    }
    
}
