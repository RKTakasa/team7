import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A extends Actor
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale( 100, 100 );
        // Add your action code here.
        if( Greenfoot.isKeyDown( "right" ) ){
            setRotation(0);
            move(5);
        }
        if( Greenfoot.isKeyDown( "left" ) ){
            setRotation(180);
            move(5);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(270);
            move(5);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            setRotation(90);
            move(5);
        }
    }    
}
