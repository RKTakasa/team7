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
        int x = getX();
        int y = getY();
        if(x<=0){
            int C = 0 + (int)(Math.random()*((450-0)+1));
            setLocation( 800, C);
        }else{
            setLocation( x-5,y );
        }
        
    }    
}
