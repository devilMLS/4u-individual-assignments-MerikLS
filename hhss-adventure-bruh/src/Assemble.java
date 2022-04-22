
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Merik
 */
public class Assemble {

    private ArrayList<Scan> rooms;
    private Scan currentRoom;
    
    
    private Scan findRoom(String name){
        int i = 0;
        while(i < 93){
            if(Scan.getName(i).equals(name)){
                return Scan.getName(i);
            }
            i = i + 4;
        }
        return null;
    }
    
    public boolean canMove(int roomDirection){
        return this.currentRoom.canMove(roomDirection);
    }
    
    public void move(int roomDirection){
        if(canMove(roomDirection)){
            String newRoomName = this.currentRoom.getNextRoomName(roomDirection);
            System.out.println(newRoomName);
            this.currentRoom = findRoom(newRoomName);
        }
    }
    
    public BufferedImage getImage(int roomDirection){
        return this.currentRoom.getImage(roomDirection);
    }
}
    


