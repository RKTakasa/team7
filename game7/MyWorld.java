import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    GreenfootImage back;
    GreenfootImage back_flop;
    int back_dx = -5; // スクロール速度(マイナスにすると左から右)
    int back_x = 0;
    int back_width;
    boolean flop = false;
    int x = 1;
    public MyWorld()
    {    
        super(800, 450, 1); // 画像サイズをセットする
        back = new GreenfootImage( "./images/back.jpeg" );
        back_flop = new GreenfootImage( "./images/back_flop.jpeg" );
        back_width = back.getWidth();
        
        addObject( new A(), 100, 200 );
    }
    public void act()
    {
        //
        
        back_x += back_dx;
        if( back_x > 0){
            back_x -= back_width;
            flop = !flop;
        }
        if( back_x < -back_width ){
            back_x += back_width;
            flop = !flop;
        }
        getBackground().drawImage( flop ? back_flop : back, back_x, 0 );
        getBackground().drawImage( flop ? back : back_flop, back_x+back_width, 0 );

        int A = 0;
        int B = 800;
        int a = 0;
        int b = 450;
        int i = 0;
       if(x == 1)
       {
           for(i=0; i<5; i++)
             {
                int C = A + (int)(Math.random()*((B-A)+1));
                int c = a + (int)(Math.random()*((b-a)+1));
               addObject( new towaaaaaaaaa(), C, c );
            }
            x = 0;
        }
    }
}
