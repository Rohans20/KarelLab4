
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        while(frontIsClear()) {
            collectBeeperSteeple();
        }
    }

    public void collectBeeperSteeple() {
        pickBeeper();
    } 
    
}