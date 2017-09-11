package spaace;
 
import processing.core.PApplet;
import processing.core.PImage;
 
@SuppressWarnings("serial")
public class Spaace3 extends PApplet 
{
    PImage background;
    PImage paddleImage;
    
   
     
    public Paddle player;
   
    
     
    public void setup() 
    {
   
        size(858,536);
        background = loadImage("space.jpg");
        
        
            paddleImage = loadImage("landman.png");
            
         
        player = new Paddle(paddleImage, width/2, height * 4/5);
    }
 
    private PImage loadImage(String string, boolean b) {
		// TODO Auto-generated method stub
		return null;
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
            size(256, 470);
            paddleImage = loadImage("jetpackman.png");
            size(272, 417);
            paddleImage = loadImage("landman.png");
            
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
            player.moveDown = true;
            
            
        } 
        
    }
     
    public class Paddle{
        public boolean moveUp;
		public boolean moveLeft;
		public boolean moveRight;
		PImage sprite;
        float xPos;
        float yPos;
		private float speed2;
		private boolean moveDown;
		private float speed;
         
       
      
         
        public Paddle(PImage paddleSprite, float startX, float startY){
            sprite = paddleSprite;
            xPos = startX;
            yPos = startY;
        }
         
        public void updateImage(String string) {
			// TODO Auto-generated method stub
			
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
                this.yPos += this.speed2;
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
            if(this.yPos > -100)
            {
                
                moveDown = true;
            }
            if(this.yPos + this.sprite.height < height){
                
            }

            
            
        }
    }
    
    
     
    public static void main(String _args[]) {
        PApplet.main(new String[] { spaace.Spaace3.class.getName() });
    }
    
}