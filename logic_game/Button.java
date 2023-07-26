import greenfoot.*;

public class Button extends Actor {
    private String buttonText;

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

    public void onClick() {
        // Implement the action you want the button to perform here
        // For example, change the position of the Snake when the button is clicked
    
        Snake snake = (Snake) getWorld().getObjects(Snake.class).get(0); // Assuming there's only one Snake
        if(snake.getX() == 100){
            snake.setLocation(500,100);
        }else{
            snake.setLocation(100,100);
        }
    }
}
