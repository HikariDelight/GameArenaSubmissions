public class Baddie
{

        private int x = 800;
        private int y = 400;
        private int width = 100;

        Ball head = new Ball(x+55, y-170 , width, "RED");
        Rectangle body = new Rectangle(x, y-100, width+20, width+50, "RED");

        public void addTo(GameArena arena)
        {
            arena.addBall(head);
            arena.addRectangle(body);
        }
    
       
     /**
	 * Constructor. Creates a Ball with the given parameters.
	 * @param xPosition The x co-ordinate of centre of the Ball (in pixels)
	 * @param yPosition The y co-ordinate of centre of the Ball (in pixels)
	 * @param widthNum The diameter of the Ball (in pixels)
	 */
    public Baddie(int xPosition, int yPosition, int widthNum)
    {
        this.x= xPosition ;
        this.y = yPosition ;
        this.width = widthNum;
    }	
    
}