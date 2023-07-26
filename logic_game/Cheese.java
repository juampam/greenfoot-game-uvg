import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cheese extends Actor
{
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            onClick();
        }
}

public void onClick(){
        Button button = (Button) getWorld().getObjects(Button.class).get(0); // Assuming there's only one Snake
        button.setSelected(3);
    }
}
