package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        for(int x = 0; x < 3; x++) {
            /**
             * Preconditioin: Robot is facing west, one block away from a beeper
             * Postcondition: Robot is facing east, two streets above where it started
             */
            harvestTwoRows();
        }
    }
    
    public void harvestTwoRows() {
        harvestOneRow();
        repositionRight();
        harvestOneRowNew();
        repositionLeft();
    }
    
    public void harvestOneRow() {
        for(int x = 0; x < 5; x++) {
            move();
            pickBeeper();
        }
    }
    
    public void harvestOneRowNew() {
        for(int x = 0; x < 4; x++) {
            move();
            pickBeeper();
        }
    }
    
    public void repositionRight() {
        turnLeft();
        move();
        pickBeeper();
        turnLeft();
    }
    
    public void repositionLeft() {
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        pickBeeper();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    
}

