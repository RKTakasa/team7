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
        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "left" ) ){
            setLocation( x-5,y );
        }
        if( Greenfoot.isKeyDown( "right" ) ){
            setLocation( x+5,y );
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setLocation( x,y-5 );
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            setLocation( x,y+5 );
        }
        Actor actor = getOneIntersectingObject( atari.class );
        if( actor != null ){
            Greenfoot.stop();
        }     
    }    
}
