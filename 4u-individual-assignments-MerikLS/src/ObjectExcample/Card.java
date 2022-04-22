/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectExcample;

/**
 *
 * @author lalim6488
 */
public class Card {
    
    //some constants
    public static final int CLUBS = 1;
    public static final int DIAMONDS = 2;
    public static final int HEARTS = 3;
    public static final int SPADES = 4;
    
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    
    //instance varibles/fields
    private int suit;
    private int rank;
    private boolean faceUp;
    
    //Constructer - called when you make an Object
    public Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
        this.faceUp = false;
    }
    
    //Accesor method aka Getters
    //Allow access to private varible information
    public int getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }

    public boolean isFaceUp() {
        return this.faceUp;
    }
    
    //mutator method aka Setters
    public void flip(){
        //toggle a boolean value
        this.faceUp = !this.faceUp;
    }
}

