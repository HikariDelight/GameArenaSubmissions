
public class Sample
{
    public static void main(String[] args)
    {
        int arenaX = 1400;
        int arenaY = 1000;
        int x1 = arenaX/2;
        int y1 = arenaY/2;

        //Arena
        GameArena arena = new GameArena(arenaX, arenaY, true);

        //Goodie
        Ball b = new Ball(x1, y1 , 500, "Yellow");
        arena.addBall(b);

        //Badie

        while(true)
        { 
            //Gives 1 second sleep time
            /*try
            {
            Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            if (arena.rightPressed())
            {
                //Moves Code 
                b.move(10, 0); 
            }
            if (arena.leftPressed())
            {
                b.move(-10, 0);
            }
            if (arena.upPressed()) 
            {
                b.move(0, -10);    
            }
            if (arena.downPressed())
            {
                b.move(0, 10);    
            }
            
            arena.pause();
        }
    }
}

//        Rectangle r= new Rectangle(700/4, 500/4, 40, 20, "CYAN");
//        arena.addRectangle(r);
