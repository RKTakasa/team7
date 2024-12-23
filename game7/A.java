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
    public int c=3;
    public int a = 5;
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
        Actor actor = getOneIntersectingObject( towaaaaaaaaa.class );
        if( actor != null ){
            getWorld().showText( "GAME OVER", 400, 200 );
            Greenfoot.stop();
            
            //getWorld().removeObject( actor );
            
        }   
        Actor actor2 = getOneIntersectingObject( NAKAMA.class );
        if( actor2 != null ){
            //Greenfoot.stop();
            getWorld().removeObject( actor2 );
            a = a-1;
             if(a <= 0)
             {
                getWorld().showText( "GAME CLEAR", 500, 200 );
                Greenfoot.stop();
             }
        }
        
    }    
}

