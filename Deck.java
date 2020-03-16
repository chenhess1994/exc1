/**
* Deck is a array of object Card
* defined as
* @param {Card} cards - array of Card object
* @param {int} amount - the real cards amount in the Deck
* 
* @author  Idan Abergel & Hen Hess
*/

import java.util.Arrays;

public class Deck {

	private Card[] cards;
	private int amount = 0;

	/*
	 * Contractor of Deck (integer)
	 * create a new deck object
	 * create a new Deck of object Card
	 * [0C, 0D, 0H, 0S, 1C .......]
	 * @param num as an integer
	 */ 
	public Deck(int num) {
		// Constructor
		cards = new Card[(num) * 4];
		int c = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 4; j++) {
				cards[c] = new Card(i, j);
				c++;
			} // j
		} // i
		amount = (num) * 4;

	}
	/*
	 * Contractor of Deck (Deck, int)
	 * create a new deck object
	 * create a new Deck from existing Deck.
	 * take num Cards from input deck into the new one.
	 * @param Deck source
	 * @param num as an integer - minimum cards amount
	 */ 
	public Deck(Deck from, int num) {
		int k;
		Card took;

		if (num > from.amount)
			k = from.amount;
		else
			k = num;

		amount = k;
		cards = new Card[k];

		for (int i = 0; i < k; i++) {
			took = from.takeOne();
			cards[i] = took;
		}


	}
	/*
	 * Contractor of Deck (Deck, Deck)
	 * create a new deck object
	 * merge between two decks.
	 * @param Deck source1
	 * @param Deck source2
	 */ 
	public Deck(Deck first, Deck second) {
		int d1 = first.amount;
		int d2 = second.amount;
		int k = d1 + d2;
		;

		cards = new Card[k];
		Card took;
		for (int i = 0; i < k; i++) {

			if (i % 2 == 0) {
				took = first.takeOne();
			} else {
				took = second.takeOne();
			}

			// in case that one of the Decks got empty
			// take the next card from the other Deck.
			if (i % 2 == 0 && took == null)
				took = second.takeOne();
			if (i % 2 == 1 && took == null)
				took = first.takeOne();

			cards[i] = took;
		} // for

		amount = k;
	}

	public int getNumCards() {
		return this.amount;
	}

	/*
	 * take a card from the top of the deck
	 * @return the Card was in the top of the deck.
	 */ 
	public Card takeOne() {
		if (amount == 0)
			return null;
		return cards[--amount];
	}

	public String toString() {

		if (this.amount == 0)
			return "[]";

		return Arrays.toString(cards);
	}
	/*
	 * Sort a Deck object (bubble sort)
	 * according to cards.compareTo
	 */ 
	public void sort() {
		// Doing Bubble sort on object array, according to 'num'
	    int n = cards.length; 
	    Card temp;;
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (cards[j].compareTo(cards[j+1])==1) 
                { //arr[j] > arr[j+1]
                    // swap arr[j+1] and arr[i] 
                	temp = cards[j]; 
                    cards[j] = cards[j+1]; 
                    cards[j+1] = temp; 
                } 
        
	}// sort
}
