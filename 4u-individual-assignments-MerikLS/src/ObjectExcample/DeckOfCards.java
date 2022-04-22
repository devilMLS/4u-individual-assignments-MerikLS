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
public class DeckOfCards {

    //Instance varibles
    private Card[] cards;
    private int numCards;

    //Constructor
    public DeckOfCards() {
        //initialize array
        this.cards = new Card[52];
        this.numCards = 0;
        //create cards
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                Card c = new Card(suit, rank);
                //put card in array
                this.cards[this.numCards] = c;
                this.numCards++;
            }
        }
    }

    //accessor methods
    public int getNumberOfCard() {
        return this.numCards;
    }

    public boolean isEmpty() {
        return this.numCards == 0;
    }

    //mutators
    public Card drawCard() {
        //save value 
        Card c = this.cards[this.numCards - 1];
        //decrease card amount
        this.cards[this.numCards - 1] = null;
        this.numCards--;
        return c;
    }

    public void addCard(Card c) {
        this.cards[this.numCards] = c;
        this.numCards++;
    }
    
    public void shuffle(){
        for(int i = 0; i < this.numCards; i++){
            //random spot 
            int spot = (int)(Math.random()*(51-i+1) + i);
            Card temp = this.cards[spot];
            this.cards[spot] = temp;
        }
    }
}
