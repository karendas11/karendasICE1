/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 * @modifier Karen Das
 * @Student ID number:991609562
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] mHand = new Card[7];
        
        for (int i=0; i< mHand.length; i++)
        {
            Card cd = new Card();
            
            //insert call to random number generator here
            cd.setValue((int)Math.floor(Math.random() * 13+1)); 
            //insert call to random number between 0-3 here
            cd.setSuit(Card.SUITS[(int)(Math.random()*4)]); 
           
            mHand[i] = cd;
           
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        Card rancard = new Card();
        System.out.println("Enter a card between 1 and 13: ");
        
        int gVal = input.nextInt();
        rancard.setValue(gVal);
        System.out.println("Enter a suit: 1(Hearts), 2(Diamonds), 3(Spades), 4(Clubs)");
        
        int gSuits = input.nextInt();
        rancard.setSuit(Card.SUITS[gSuits-1]);
        
        // mHand search is here
        boolean match = true;
        for(int i=0; i< mHand.length; i++)
       {
            if(rancard.getValue() == mHand[i].getValue() && rancard.getSuit() == mHand[i].getSuit())
            {
                match = true;
                break;
            }
            else 
            {
                match = false;
            }
       }   
        //The result is reported here
        if(match)
        {
            System.out.println("Congratulations YOU WON !!!");
        } else 
        {
            System.out.println("YOU LOST, Better Luck Next Time!");
        }
    }   
}
       
    
