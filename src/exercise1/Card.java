package exercise1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author Darshan
 * @Darshan Jagani Feb 2nd,2024
 */
public class Card {

  public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

  private String suit;
  private int value;

  public Card(String suit, int value) {
    this.suit = suit; 
    this.value = value;
  }

  public String getSuit() {  
    return suit;
  }

  public int getValue() {
    return value;
  }

  public void setSuit(String suit) {
    this.suit = suit;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public boolean equals(Card other) {
    return this.getSuit().equals(other.getSuit()) &&
           this.getValue() == other.getValue();
  }

  public void printCard() {
    String valueString = "";
    if (value == 11) {
      valueString = "J";
    } else if (value == 12) {
      valueString = "Q";
    } else if (value == 13) {
      valueString = "K"; 
    } else if (value == 14) {
      valueString = "A";
    } else {
      valueString = String.valueOf(value);
    }
    System.out.println(valueString + " of " + suit); 
  }

}