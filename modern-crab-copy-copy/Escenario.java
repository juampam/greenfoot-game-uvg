import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario extends World
{

    /**
     * Constructor for objects of class Escenario.
     * 
     */
    public Escenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 728, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Transporte transporte = new Transporte();
        addObject(transporte,494,457);
        Serptiente serptiente = new Serptiente();
        addObject(serptiente,224,487);
        Pastor pastor = new Pastor();
        addObject(pastor,155,516);
        Oveja oveja = new Oveja();
        addObject(oveja,289,445);
        Vegetal vegetal = new Vegetal();
        addObject(vegetal,304,384);
    }
}
