package exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks
 * the user to pick a card. It then searches the array of cards for the match to
 * the user's card. To be used as starting code in Exercise
 *
 * @author Darshan
 * @author Darshan Jagani, Feb 6th, 2024.
 */
public class CardTrick {

  public static void main(String[] args) throws IOException {

    Card[] hand = new Card[7];
    Random random = new Random();

    for(int i = 0; i < hand.length; i++) {
      int value = random.nextInt(13) + 2;
      int suitIndex = random.nextInt(4);
      String suit = Card.SUITS[suitIndex];
      
      Card card = new Card(suit, value);
      hand[i] = card;
    }   
        //card.setValue(insert call to random number generator here)
        // 
        //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
        //       Don't worry about duplicates at this point
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter a card value (2-14): ");
    int valueGuess = Integer.parseInt(reader.readLine());

    System.out.print("Enter a card suit (1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Club.): ");
    int suitGuess = Integer.parseInt(reader.readLine());
    
    Card userGuessCard = new Card(Card.SUITS[suitGuess-1], valueGuess);

    boolean match = false;

    for(Card c : hand) {
      if(c.equals(userGuessCard)) {
        match = true;
        break;
      }
    }

    if(match) {
      printInfo();  
    }

  }

    // insert code to ask the user for Card value and suit, create their card
    // and search the hand here. 
    // Hint: You can ask for values 1 to 10, and then
    //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
    //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
    // 
    // Then loop through the cards in the array to see if there's a match.
    // If the guess is successful, invoke the printInfo() method below.

/**
 * A simple method to print out personal information. Follow the instructions to
 * replace this information with your own.
 *
 * @author Darshan Jagani Feb 6th, 2024.
 */
private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Darshan, You can call me DJ!!");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println("-- To become a cloude engineer!");	
	System.out.println();	


        System.out.println("My hobbies:");
        System.out.println("-- Gaming");
        System.out.println("-- Coding");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Driftingggggg!!!!");

        System.out.println();
        
    
    }

}
