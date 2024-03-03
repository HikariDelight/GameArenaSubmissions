import java.lang.reflect.Constructor;

public class Goodie
{
        private int x = 150;
        private int y = 400;
        private int width = 100;

        Ball head = new Ball(x+55, y-170 , width, "GREEN");
        Rectangle body = new Rectangle(x, y-100, width+20, width+50, "GREEN");

        public void addTo(GameArena arena)
        {
            arena.addBall(head);
            arena.addRectangle(body);
        }

        public void move(GameArena arena)
        {
            if (arena.rightPressed())
            {
                //Moves Code 
                head.move(10, 0); 
                body.move(10, 0); 
            }
            if (arena.leftPressed())
            {
                head.move(-10, 0);
                body.move(-10, 0);
            }
            if (arena.upPressed()) 
            {
                head.move(0, -10);  
                body.move(0, -10);  
            }
            if (arena.downPressed())
            {
                head.move(0, 10);  
                body.move(0, 10);  
            }
        }
     /**
	 * Constructor. Creates a Ball with the given parameters.
	 * @param xPosition The x co-ordinate of centre of the Ball (in pixels)
	 * @param yPosition The y co-ordinate of centre of the Ball (in pixels)
	 * @param widthNum The diameter of the Ball (in pixels)
	 */
        public Goodie(int xPosition, int yPosition, int widthNum)
        {
            this.x= xPosition ;
            this.y = yPosition ;
            this.width = widthNum;
        }
        
        /*public void handleUserInput(GameArena arena) 
        {
            if (arena.isUpPressed()) {
                move(0, -5); // Move up
            }
            if (arena.isDownPressed()) {
                move(0, 5); // Move down
            }
            if (arena.isLeftPressed()) {
                move(-5, 0); // Move left
            }
            if (arena.isRightPressed()) {
                move(5, 0); // Move right
            }
        }
        */
}
