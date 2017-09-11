package spaace;
 
import processing.core.PApplet;
import processing.core.PImage;
 
@SuppressWarnings("serial")
public class Spaace2 extends PApplet 
{
    PImage background;
    PImage paddleImage;
    public static boolean running = true;
    public Paddle player;
     
    public void setup() 
    {
        size(858,536);
        background = loadImage("space.jpg");
        paddleImage = loadImage("wheatly.png");
        player = new Paddle(paddleImage, width/2, height * 4/5);
    }
    
    
    public void draw() 
    {
        player.update();         
        background(background);
        player.drawPaddle();
    }
     
    public void keyPressed() 
    {
    	
        if(key == 'd' || key == 'D') 
        {
        		player.moveLeft = false;
        		 
            player.moveRight = true;
            System.out.println("Right Pressed");
        } 
        if(key == 'a' || key == 'A')
        {
        		player.moveRight = false;
            player.moveLeft = true;
            System.out.println("Left Pressed");
        }
        if(key == 'w' || key == 'W')
        {
            player.moveUp = true;
            System.out.println("Up Pressed");
            //draw();
        }
        if(key == 's' || key == 'S')
        {
            player.moveDown = true;
            player.moveUp = false;
            System.out.println("Down Pressed");
            player.sprite = loadImage("demon1.gif");
        }
        
        System.out.println("loop ending");
        draw();
        //ADD A CHECK FOR IF ESC IS PRESSED TO CLOSE THE PROGAM 
        
    }
     
    public void keyReleased() 
    {
        if(key == 'd' || key == 'D') 
        {
            player.moveRight = false;
        } 
        if(key == 'a' || key == 'A')
        {
            player.moveLeft = false;
        }
        if(key == 'w' || key == 'W') 
        {
            player.moveUp = false;
            player.sprite = loadImage("wheatly.png");
            draw();
        } 
        if(key == 's' || key == 'S')
        {
            player.moveDown = false;
            //draw();
        }
        
     draw();
     
    }
     
    public class Paddle{
        PImage sprite;
        float xPos;
        float yPos;
         
        int speed = 10;
        public boolean moveRight = false;
        public boolean moveLeft = false;
        public boolean moveUp = false;
        public boolean moveDown = false;
         
        public Paddle(PImage paddleSprite, float startX, float startY){
            sprite = paddleSprite;
            xPos = startX;
            yPos = startY;
        }
         
        public void drawPaddle(){
            image(sprite, xPos, yPos);
        }
         
        public void update()
        {
        	
        		
       
            if(this.moveRight)
            {
                this.xPos += this.speed;
            }
            if(this.moveLeft)
            {
                this.xPos -= this.speed;
            }
            if(this.moveUp)
            {
                this.yPos -= this.speed;
            }
            if(this.moveDown)
            {
                this.yPos += this.speed;
            }
            checkBounds();
           System.out.println("Left:" + this.moveLeft + " Right:" + this.moveRight
            		+ " Up:" + this.moveUp + " Down:" + this.moveDown);

        }
         
        public void checkBounds()
        {
            if(this.xPos < 0)
            {
                this.xPos = width - this.sprite.width;
               // moveLeft = false;
            }
            if(this.xPos + this.sprite.width > width){
                this.xPos = 0;
                //moveRight = false;
            }
            if(this.yPos < 0)
            {
               // this.yPos = 0;
                this.yPos = height -  this.sprite.height;
            		//moveDown = false;
            }
            if(this.yPos + this.sprite.height > height){
                //this.yPos = height - this.sprite.height;
                this.yPos = 0;
               // moveUp = false;
            }
        }
    }
     
    public static void main(String _args[]) {
        PApplet.main(new String[] { spaace.Spaace2.class.getName() });
        while (running = true)
        {
        		//keyPressed();
        		//keyReleased();
        }
    }
    
}