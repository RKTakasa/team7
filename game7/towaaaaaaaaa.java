import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class towaaaaaaaaa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class towaaaaaaaaa extends Actor
{
    /**
     * Act - do whatever the towaaaaaaaaa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img_bkup = null;
    private int width=50;
    private int height= 50;
    private int A = 0;
    private int B = 360;
    public towaaaaaaaaa(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( width,height );
    }
    public void act() 
    {
        int C = A + (int)(Math.random()*((B-A)+1));
        setRotation(C);
        move(5);
        
    }    
}
