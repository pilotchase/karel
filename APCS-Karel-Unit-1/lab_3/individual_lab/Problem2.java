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
        move();
        faceNorth();
        if(!frontIsClear()){

        } else{
                move();
                if(!frontIsClear()){
            move();
            faceEast();
            if(!frontIsClear()){
                move();
                faceWest();
                if(!frontIsClear()){
                    move();
                    faceSouth();
                    move();
                }
            } 
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

