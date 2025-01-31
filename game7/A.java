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
    private GreenfootImage img_bkup = null;
    private int sx=100;
    private int sy=100;
    int count=15;
    public A(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( 100,100 );
    }
    public void act() 
    {
        
        getImage().scale( sx, sy );
        if(count==10){
            
            ((MyWorld)getWorld()).showTextEx("3", 390, 240, 256, false, Color.WHITE );
            Greenfoot.delay(80);
            ((MyWorld)getWorld()).showTextEx("2", 390, 240, 256, false, Color.WHITE );
            Greenfoot.delay(80);
            ((MyWorld)getWorld()).showTextEx("1", 390, 240, 256, false, Color.WHITE );
            Greenfoot.delay(80);
            ((MyWorld)getWorld()).showTextEx("START", 390, 240, 256, false, Color.WHITE );

        }else if(count==1){
            ((MyWorld)getWorld()).showTextEx("", 390, 240, 256, false, Color.WHITE );

        }
        count=count-1;
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
            sx=sx+10;
            sy=sy+10;
            GreenfootImage img = new GreenfootImage(img_bkup);
            img.scale( sx,sy );
            setImage(img);
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

