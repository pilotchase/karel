package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void moveTimes(int x) {
        int count = 1;
        while(count <= x) {
            move();
            count++;
        }
    }
    
    public void flip() {
        turnLeft();
        turnLeft();
    }
    
    /**
     * Fetch Beeper # 1
     */
    public void fetch() {
        moveTimes(2);
        turnLeft();
        moveTimes(2);
        pickBeeper();
        flip();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    
    public void arrange() {
        flip();
        moveTimes(2);
        turnLeft();
        moveTimes(2);
        putBeeper();
        flip();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    
    public void finalPoint() {
        turnRight();
        moveTimes(2);
        turnRight();
        moveTimes(2);
        turnRight();
    }
    
    public void rearrangeBeepers() {
        fetch();
        arrange();
        finalPoint();
    }
   
}