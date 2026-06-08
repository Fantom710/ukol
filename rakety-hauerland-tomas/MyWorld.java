import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Hauerland Tomáš) 
 * @version (20.5.2026)
 */
public class MyWorld extends World
{

    public MyWorld()
    {    
        super(600, 400, 1);
        stanice();
        rampa();
    }
    public void stanice()
    {
        for (int i = 0;i < 10;i++)
        {
            int x = 0; //nepamatuju si jak udelat ten odstup 50 pixelu
            int y = Greenfoot.getRandomNumber(100)+100;
            addObject(new Stanice(), x, y);
        }
    }
    public void rampa()
    {
        addObject(new OdpalovaciRampa(), getWidth()/2, getHeight()-50);
    }
}
