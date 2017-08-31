package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        turnLeft();
        moveTimes(3);
        turnRight();
        moveTimes(4);
        putBeeper();
        turnRight();
        move();
        turnRight();
        move();
        putBeeper();
        move();
        turnLeft();
        move();
        turnLeft();
        putBeeper();
        moveTimes(2);
        putBeeper();
        turnRight();
        move();
        turnRight();
        move();
        putBeeper();
        moveTimes(2);
        putBeeper();
        turnLeft();
        move();
        turnLeft();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        turnRight();
        move();
        turnRight();
        move();
        putBeeper();
        turnLeft();
        move();
        turnLeft();
        move();
        putBeeper();
        turnLeft();
        moveTimes(7);
        
    }
    
    public void moveTimes(int x) {
        for(int count = 0; count < x; count++) {
            move();
        }
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
