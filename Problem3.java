 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Problem2
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        turnWest();
        checkRight();
        moveAlongWall();
    }
   
    public void turnWest() {
    while (!facingWest()) {
        turnLeft();
    }
}
    
    public void moveAlongWall() {
        turnRight();
        while (!nextToABeeper()){
        while (checkRight() == true) {
            turnLeft();
            putBeeper();
            move();
            turnRight();
        }
        while (checkRight() == false) {
            turnLeft();
            if (!frontIsClear()) {
                turnLeft();
            }
            move();
            turnRight();
        }
    } 
        turnOff();
}
}

