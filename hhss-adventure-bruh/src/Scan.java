
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
 * @author Merik
 */
public class Scan {

    public static final int N = 0;
    public static final int E = 1;
    public static final int S = 2;
    public static final int W = 3;

    private String currentName;
    private String currentDirection;
    private String[] name;
    private String[] imageName;
    private BufferedImage[] image;
    private boolean[] canMove;
    private String[] moveName;
    private String[] direction;
    private String[] nextDirection;

    public Scan(Scanner input) {
        this.image = new BufferedImage[92];
        this.name = new String[92];
        this.canMove = new boolean[92];
        this.moveName = new String[92];
        this.direction = new String[92];
        int i = 0;
        this.nextDirection = new String[92];
        this.currentName = input.nextLine();
        this.currentDirection = input.next();
        while(i < 93){
            this.name[i] = input.next();
            for (int j = 0; j < 4; j++) {
                direction[i+j] = input.next();
                try {
                    String filename = "images/" + this.imageName[i];
                    this.image[i] = ImageIO.read(new File(filename));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                canMove[i+j] = input.nextBoolean();
                if (canMove[i+j] == false) {
                    moveName[i+j] = input.next();
                    nextDirection[i+j] = input.nextLine().trim();
                } else {
                    input.nextLine().trim();
                }
            }
            i = i + 4;
        }
    }

    public String getName(int i) {
        return this.name[i];
    }

    public BufferedImage getImage(int roomDirection) {
        return this.image[roomDirection];
    }

    public boolean canMove(int roomDirection) {
        return this.canMove[roomDirection];
    }

    public String getNextRoomName(int roomDirection) {
        return this.moveName[roomDirection];
    }
    public String getDirection(int roomDirection) {
        return this.direction[roomDirection];
    }
}
