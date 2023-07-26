import greenfoot.*;

public class Button extends Actor {
    private String buttonText;
    int selected = 0;

    public Button(String text) {
        buttonText = text;
        updateImage();
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            onClick();
        }
    }

    public void updateImage() {
        GreenfootImage image = new GreenfootImage(buttonText, 20, Color.WHITE, new Color(0, 128, 0, 250));
        setImage(image);
    }
     public void setSelected(int newsel) {
        this.selected = newsel;
      }
    public void onClick() {
       
        switch(selected){
        case 1:
             Snake snake = (Snake) getWorld().getObjects(Snake.class).get(0); 
            if(snake.getX() == 100){
                snake.setLocation(500,100);
            }else{
                snake.setLocation(100,100);
            }
        break;
        case 2:
            Rat rat = (Rat) getWorld().getObjects(Rat.class).get(0); 
             if(rat.getX() == 100){
                rat.setLocation(500,200);
            }else{
                rat.setLocation(100,200);
            }
        break;
        case 3:
             Cheese cheese = (Cheese) getWorld().getObjects(Cheese.class).get(0); 
             if(cheese.getX() == 100){
                cheese.setLocation(500,300);
            }else{
                cheese.setLocation(100,300);
            }
        break;
        }
       
    }
}
