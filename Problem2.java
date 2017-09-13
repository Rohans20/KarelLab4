
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Problem1
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        while (!nextToABeeper()) {
            movingAlongWall();
        }
        turnOff();
    }
   
    public void movingAlongWall() {
        turnLeft();
        if (!frontIsClear()) {
            turnRight();
            if (!frontIsClear()) {
                turnRight();
            }
            putBeeper();
            move();
        }
        else {
            move();
        }
       
    }
            
    public boolean isLeftClear() {
        if (frontIsClear()) {
            return true;
        }
        else {
            return false;
        }
    }
}

