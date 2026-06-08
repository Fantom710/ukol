import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Raketa here.
 * 
 * @author (Hauerland Tomáš) 
 * @version (20.5.2026)
 */
public class Raketa extends Actor
{
    int mnozstviPaliva = 0;
    public void act()
    {
        pohyb();
    }
    public void natankuj(int palivo)
    {
        palivo = mnozstviPaliva;
    }
    public void pohyb()
    {
        move(3);
        mnozstviPaliva--;
        if(mnozstviPaliva == 0)
        {
            move(0);
        }
    }
}
