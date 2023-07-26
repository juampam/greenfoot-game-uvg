import greenfoot.*;

public class Snake extends Actor
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
        button.setSelected(1);
    }
}