package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        faceEast();
        move();
        isRoom();
        move();
        move();
        isRoom();
        move();
        move();
        isRoom();
        move();
        isRoom();
        move();
        move();
        isRoom();
    }
    
    public void isRoom(){
        faceNorth();
        if(frontIsClear()){
            move();
            if(!frontIsClear()){
                faceWest();
                if(!frontIsClear()){
                    faceEast();
                    if(!frontIsClear()){
                        faceSouth();
                        if(frontIsClear()){
                            putBeeper();
                            move();
                            faceEast();
                        }
                    }
                }
            } else {
                faceSouth();
                move();
                faceEast();
            }
        }
    }
    
    public void faceNorth(){
        while(!facingNorth()){
            turnLeft();
        }
    }
    
    public void faceSouth(){
        while(!facingSouth()){
            turnLeft();
        }
    }
    
    public void faceWest(){
        while(!facingWest()){
            turnLeft();
        }
    }
    
    public void faceEast(){
        while(!facingEast()){
            turnLeft();
        }
    }
}

