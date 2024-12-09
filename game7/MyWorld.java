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
    GreenfootImage haikei_Crop;
    GreenfootImage haikei_Crop2;
    int back_dx = -5; // スクロール速度(マイナスにすると左から右)
    int back_x = 0;
    int back_width;
    boolean flop = false;
    int x = 1;
    public MyWorld()
    {    
        super(800, 450, 1); // 画像サイズをセットする
        haikei_Crop = new GreenfootImage( "./images/haikei_Crop.jpg" );
        haikei_Crop2 = new GreenfootImage( "./images/haikei_Crop2.jpg" );
        haikei_Crop.scale(getWidth(), getHeight());
        haikei_Crop2.scale(getWidth(), getHeight());
        back_width = haikei_Crop.getWidth();
        
        addObject( new A(), 100, 200 );
        int A = 300;
        int B = 800;
        int a = 0;
        int b = 450;
        int i = 0;
        for(i=0; i<5; i++)
             {
                int C = A + (int)(Math.random()*((B-A)+1));
                int c = a + (int)(Math.random()*((b-a)+1));
               addObject( new towaaaaaaaaa(), C, c );
            }
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
        getBackground().drawImage( flop ? haikei_Crop2 : haikei_Crop, back_x, 0 );
        getBackground().drawImage( flop ? haikei_Crop : haikei_Crop2, back_x+back_width, 0 );


        //showText( "スコア: "+ back_x*(-1), 100, 10 );
        
    }
}
