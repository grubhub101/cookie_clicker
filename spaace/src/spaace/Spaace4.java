package spaace;
 
import processing.core.PApplet;
import processing.core.PImage;
 
@SuppressWarnings("serial")
public class Spaace4 extends PApplet 
{
    PImage background;
    PImage paddleImage;
    PImage portal;
    PImage portal2;
    public Paddle player;
    int px = -50;
    int py = 150;
     
    public void setup() 
    {
        size(858,536);
        background = loadImage("space.jpg");
        paddleImage = loadImage("wheatly.png");
        portal = loadImage("landman.png");
        portal2 = loadImage("landman.png");
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
            player.moveRight = true;
        } 
        if(key == 'a' || key == 'A')
        {
            player.moveLeft = true;
        }
        if(key == 'w' || key == 'W')
        {
            player.moveUp = true;
        }
        if(key == 's' || key == 'S')
        {
            player.moveDown = true;
        }
        
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
        } 
        if(key == 's' || key == 'S')
        {
            player.moveDown = false;
        }
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
            image(portal, -50, 150);
            image(portal, 500, 0);
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
        }
         
        public void checkBounds()
        {
            if(this.xPos < 0)
            {
                this.xPos = 0;
                moveLeft = false;
            }
            if(this.xPos + this.sprite.width > width){
                this.xPos = width - this.sprite.width;
                moveRight = false;
            }
            if(this.yPos < 0)
            {
                this.yPos = 0;
                moveDown = false;
            }
            if(this.yPos + this.sprite.height > height){
                this.yPos = height - this.sprite.height;
                moveUp = false;
            }
            if(this.xPos == px && yPos == py)
            {

                player.drawPaddle();
                
            
            }
            
        }
  
        }
    
     
    public static void main(String _args[]) {
        PApplet.main(new String[] { spaace.Spaace4.class.getName() });
    }
    
}