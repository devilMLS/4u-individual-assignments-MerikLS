/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
/**
 *
 * @author lalim6488
 */
public class MappingNew {
    
    public static final int N = 0;
    public static final int E = 1;
    public static final int S = 2;
    public static final int W = 3;
    
    private String name;
    private String[] imageName;
    private BufferedImage[] image;
    private boolean[] canMove;
    private String[] moveName;
    private String[] direction;
    
    public MappingNew(Scanner input) {
        this.image = new BufferedImage[4];
        this.canMove = new boolean[4];
        this.moveName = new String[4];
        this.direction = new String[4];
        this.name = input.nextLine();
        
        for(int i = 0; i < 4; i++){
            String direction = input.next();
            
            }
        }
    }
}
