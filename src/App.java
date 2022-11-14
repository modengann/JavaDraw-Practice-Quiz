/**
 * Task: Design code that will: 
 *  -Create "raindrops" on the screen at a clicked location. The raindrops should have a random size 
 *    between 5 and 15 pixels
 *  -Raindrops should fall at a constant speed
 *  -If raindrops hit the bottom of the screen, they should be removed from the screen and from any
 *   list they are stored in.
 *  -There is a brick bouncing back and forth on the screen. If the rain drops hit the bouncey brick,
 *   the rain should disappear.
 * 
 *  Specifications:
 *  You are NOT allowed to modify any existing code. 
 *  Use appropriate loops! Not everything is a for-each loop, not everything should be a while loop.
 * 
 *  A+ work:
 *  Add a creative twist of your own with explanatory comments. Any extra work should demonstrate mastery
 *  of both ArrayLists and their usage with JavaDraw
 */

import javadraw.*;

public class App extends Window{
    public static void main(String[] args) throws Exception {
        Window.open();
    }

    public void start(){
        Rectangle brick = new Rectangle(screen, 100, 400, 100, 50);
        int direction = 1;
        while(true){
            direction = bounceyBrick(brick, direction);
            screen.update();
            screen.sleep(1/30.0);
        }
    }

    public int bounceyBrick(Rectangle r, int d){
        r.move(10*d, 0);
        if(r.x() + r.width() > screen.width() || r.x() < 0){
            d *= -1;
        }
        return d;
    }
}
