
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim6488
 */
public class Mapping {

    public static final int N = 0;
    public static final int E = 1;
    public static final int S = 2;
    public static final int W = 3;
    
    private String name;
    private String[] imageName;
    private BufferedImage[] image;
    private String[] location;
    private boolean[] canMove;
    private String[] moveName;
    private String[] nextDirection;

    public Mapping(Scanner input) {
//        // get a room name
        this.name = input.nextLine();
        
        // load image file
        this.image = new BufferedImage[4];
        this.canMove = new boolean[4];
        this.moveName = new String[4];

        for (int i = 0; i < this.canMove.length; i++) {
            // get direction
            String direction = input.next();
            imageName[i] = input.next();
            try {
            String filename = "images/" + this.imageName[i];
            this.image[i] = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
            
            // can move
            boolean move = input.nextBoolean();
            // scan in room name
            if(canMove[i] == false){
            String nextRoom = input.next();
            nextDirection[i] = input.nextLine().trim();
            // switch case for direction
            switch (nextDirection[i]) {
                case "N":
                    this.canMove[Mapping.N] = move;
                    this.moveName[Mapping.N] = nextRoom;
                    break;
                case "E":
                    this.canMove[Mapping.E] = move;
                    this.moveName[Mapping.E] = nextRoom;
                    break;
                case "S":
                    this.canMove[Mapping.S] = move;
                    this.moveName[Mapping.S] = nextRoom;
                    break;
                case "W":
                    this.canMove[Mapping.W] = move;
                    this.moveName[Mapping.W] = nextRoom;
                    break;
            }
            }else{
                input.nextLine().trim();
            }
        }

    }

    public String getName() {
        return this.name;
    }

    public BufferedImage getImage(int direction) {
        return this.image[direction];
    }

    public boolean canMove(int direction) {
        return this.canMove[direction];
    }

    public String getNextRoomName(int direction) {
        return this.moveName[direction];
    }
    public void getDirection(int direction){
        return this.direction;
    }
}
