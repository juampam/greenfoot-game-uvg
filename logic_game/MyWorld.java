import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        prepare();
    }
    
    private void prepare() {
        Snake snake = new Snake();
        Rat rat = new Rat();
        Cheese cheese = new Cheese();
        addObject(snake, 100, 100);
        addObject(rat, 100, 200);
        addObject(cheese, 100, 300);
        int snakeX = snake.getXPosition();
        int ratX = rat.getXPosition();
         Button button = new Button(" Mover ");
         addObject(button, 300, 350);
         int selected = 0; 
    }
}

