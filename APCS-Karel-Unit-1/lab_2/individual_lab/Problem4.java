package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem4 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem4(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    
    public void main() {
        // Call methods
        initPosition();
        setThree();
        pickThree();
        positionTwo();
        setTwo();
        setOne();
    }
    
    public void moveTimes(int x) {
        for(int count = 0; count < x; count++) {
            move();
        }
    }
    
    public void initPosition() {
        // Set initial position
    }
    
    public void flip() {
        turnLeft();
        turnLeft();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void setThree() {
        // Set out the 3
        for(int x = 0; x < 3; x++){
            move();
            putBeeper();
        }
        turnLeft();
        move();
        putBeeper();
        move();
        turnLeft();
        for(int x = 0; x < 3; x++){
            putBeeper();
            if(x != 2){
                move();
            }
        }
        turnRight();
        move();
        turnRight();
        moveTimes(2);
        putBeeper();
        turnLeft();
        move();
        turnLeft();
        for(int x = 0; x < 2; x++){
            putBeeper();
            move();
        }
        putBeeper();
    }
    
    public void pickThree() {
        flip();
        for(int x = 0; x < 2; x++){
            pickBeeper();
            move();
        }
        turnRight();
        pickBeeper();
        move();
        pickBeeper();
        move();
        turnRight();
        for(int x = 0; x < 2; x++){
            pickBeeper();
            move();
        }
        turnLeft();
        pickBeeper();
        moveTimes(2);
        turnLeft();
        for(int x = 0; x < 2; x++){
            pickBeeper();
            move();
        }
        pickBeeper();
        turnLeft();
        move();
        pickBeeper();
    }
    
    public void positionTwo() {
        moveTimes(6);
        turnRight();
    }
    
    public void setTwo() {
        // Set out the 2
        for(int x = 0; x < 2; x++){
            putBeeper();
            move();
            if(x == 1){
                putBeeper();
            }
        }
        turnRight();
        move();
        putBeeper();
        move();
        putBeeper();
        turnRight();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    
    public void pickTwo() {
        // Pick up 2 beepers
    }
    
    public void setOne() {
        // Set out the 1
    }

        
}
