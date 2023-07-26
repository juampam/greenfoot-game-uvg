import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rat extends Actor
{
     
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            onClick();
        }
    }
    public int getXPosition() {
        return getX();
    }
    public void onClick(){
        Button button = (Button) getWorld().getObjects(Button.class).get(0); 
        button.setSelected(2);
    }
}
