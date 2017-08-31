package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Problem1
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        setPins();
        turnRight();
        move();
        turnRight();
        moveTimes(2);
        putBeeper();
        moveTimes(2);
        putBeeper();
        moveTimes(2);
        putBeeper();
        turnLeft();
        move();
        turnLeft();
        move();
        putBeeper();
        moveTimes(2);
        putBeeper();
        turnRight();
        move();
        turnRight();
        move();
        putBeeper();
        turnRight();
        moveTimes(7);
        turnRight();
        turnRight();
    }
}
