
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        goToEdge();
        checkRight();
        moveAlongWall();
        exitRoom();
        }
    
    
   
    public void goToEdge() {
        while (frontIsClear()) {
            move();
        }
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public boolean checkRight() {
        if (!frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
  
    public void moveAlongWall() {
        while (checkRight() == false) {
            turnLeft();
            if (!frontIsClear()) {
                turnLeft();
            }
            move();
            turnRight();
        }
    } 
    
    public void exitRoom() {
        move();
        turnOff();
    }
}

