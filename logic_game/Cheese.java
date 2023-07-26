import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Forget about sheeps and wolves.
 * 
 * @author Juampa Muralles, Gustavo Joge
 * @version 3.0
 */
public class Cheese extends Actor
{
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            onClick();
        }
}

public void onClick(){
        Button button = (Button) getWorld().getObjects(Button.class).get(0);
        button.setSelected(3);
    }
}
