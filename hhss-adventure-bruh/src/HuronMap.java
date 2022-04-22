
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
 * @author lalim6488
 */
public class HuronMap {
    
    private ArrayList<Mapping> rooms;
    private Mapping currentRoom;
    private Mapping direction[];
    
    public HuronMap(String filename){
        this.rooms = new ArrayList<>();
        
        Scanner input = null;
        try{
            input = new Scanner(new File(filename));
        }catch(Exception e){
            // print out red error message
            e.printStackTrace();
        }
        // get current room name
        String currentRoomName = input.nextLine();
        String direction = input.nextLine();
        // if there are rooms left, create them
        while(input.hasNext()){
            // make the room
            Mapping r = new Mapping(input);
            // add to list
            this.rooms.add(r);
        }
        
        // set the current room
        this.currentRoom = findRoom(currentRoomName);
    }
    
    private Mapping findRoom(String name){
        for(Mapping r: this.rooms){
            // compare room names
            // if they are the same
            if(r.getName().equals(name)){
                return r;
            }
        }
        // room not found
        return null;
    }
    
    public boolean canMove(int direction){
        return this.currentRoom.canMove(direction);
    }
    
    public void move(int direction){
        if(canMove(direction)){
            String newRoomName = this.currentRoom.getNextRoomName(direction);
            System.out.println(newRoomName);
            this.currentRoom = findRoom(newRoomName);
        }
    }
    
    public BufferedImage getImage(int direction){
        return this.currentRoom.getImage(direction);
    }
}
