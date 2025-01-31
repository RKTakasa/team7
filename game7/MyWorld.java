import greenfoot.*;
import greenfoot.core.TextLabel;
import greenfoot.WorldVisitor;
import greenfoot.util.GraphicsUtilities;
import java.util.ArrayList;
import java.awt.Graphics2D;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    class TextLabelEx extends TextLabel
    {
        boolean enable;
        int xpos;
        int ypos;
        int size;
        boolean bold;
        greenfoot.Color gfcolor;
        java.awt.Color color;
        String text;
        String[] lines;
        private GraphicsUtilities.MultiLineStringDimensions dimensions = null;
        
        @Override
        public int getX(){ return xpos;}
        
        @Override
        public int getY(){ return ypos;}
        
        @Override
        public String getText(){ return text;}     
        
        public TextLabelEx(String _text, int _xpos, int _ypos, int _size, boolean _bold, greenfoot.Color _gfcolor )
        {
            super("", 0, 0 );
            lines = new String[1];
            xpos = _xpos;
            ypos = _ypos;
            reset( _text, _size, _bold, _gfcolor );
        }
        
        public void reset( String _text, int _size, boolean _bold, greenfoot.Color _gfcolor )
        {
            if( text == _text && size == _size && bold == _bold && gfcolor == _gfcolor ) return;
            text = _text;
            size = _size;
            bold = _bold;
            gfcolor = _gfcolor;
            lines[0] = text;
            dimensions = null;
            
            if( text.length() == 0 ) enable = false;
            else enable = true;
        }

        @Override
        public void draw(Graphics2D g, int cellsize)
        {
            if( !enable ) return;
            if(dimensions == null) {
                dimensions = GraphicsUtilities.getMultiLineStringDimensions(lines, bold ? java.awt.Font.BOLD : java.awt.Font.PLAIN, size);
                color = new java.awt.Color( gfcolor.getRed(), gfcolor.getGreen(), gfcolor.getBlue(), gfcolor.getAlpha() );
            }
                
            int ydraw = ypos * cellsize - dimensions.getHeight() / 2 + cellsize / 2;
            int xdraw = xpos * cellsize - dimensions.getWidth() / 2 + cellsize / 2;
            g.translate(xdraw, ydraw);
            GraphicsUtilities.drawOutlinedText(g, dimensions, color, java.awt.Color.BLACK);
            g.translate(-xdraw, -ydraw);
        }
    }   
    
    public void showTextEx(String text, int x, int y, int size, boolean bold, greenfoot.Color color )
    {
        for( TextLabel label : WorldVisitor.getTextLabels(this) ){
            if( label.getX() == x && label.getY() == y ){
                if( label instanceof TextLabelEx ){
                    ((TextLabelEx)label).reset(text, size, bold, color);
                    return;                    
                }
            }
        }
        WorldVisitor.getTextLabels(this).add(new TextLabelEx( text, x, y, size, bold, color ) );
        
        //showText( "labels: "+WorldVisitor.getTextLabels(this).size(), 80, 20 );
    }
    
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
    int y = 1;
    public MyWorld()
    {    
        super(800, 450, 1); // 画像サイズをセットする
        haikei_Crop = new GreenfootImage( "./images/haikei_Crop.jpg" );
        haikei_Crop2 = new GreenfootImage( "./images/haikei_Crop2.jpg" );
        haikei_Crop.scale(getWidth(), getHeight());
        haikei_Crop2.scale(getWidth(), getHeight());
        back_width = haikei_Crop.getWidth();
        showText( "←↑→↓キーで移動", 120, 20 );
        showText( "仲間を５体集めてクリア", 120, 50 );
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
            for(i=0; i<5; i++)
             {
                int C = A + (int)(Math.random()*((B-A)+1));
                int c = a + (int)(Math.random()*((b-a)+1));
               addObject( new NAKAMA(), C, c );
            }
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
        getBackground().drawImage( flop ? haikei_Crop2 : haikei_Crop, back_x, 0 );
        getBackground().drawImage( flop ? haikei_Crop : haikei_Crop2, back_x+back_width, 0 );
        

        //showText( "スコア: "+ back_x*(-1), 100, 10 );

        /*if( Greenfoot.isKeyDown( "space" ) ){
=======
        if( Greenfoot.isKeyDown( "space" ) ){
>>>>>>> 182ce12b43e2ab3aab92d5fb7beed27d0cda34d1
            Greenfoot.playSound("maou_bgm_fantasy07.mp3");
         }*/
         //Greenfoot.playSound("maou_bgm_fantasy07.mp3");

        //キャラクターランダム配置テンプレ

        


    }
}
