import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackGround extends World
{
    Status status;
    /**
     * Constructor for objects of class BackGround.
     * 
     */
    public BackGround()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        this.status = new Status(100,100,"Slowed");
        addObject(status,100,100);
    }

    public void act()
    {
        
        if(Greenfoot.isKeyDown("left"))
            if (status.getCurrentCountDown() > 0)
            status.update(1);
        if(Greenfoot.isKeyDown("right"))
            if (status.getCurrentCountDown() < status.getMaxCountDown())
            status.update(-1);
    }
}

