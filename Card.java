/**
* Card defined as
* @param {int} cardNum - card number
* @param {int} suit - the suit of the card.
*					the integer define the shape:
* 					0 - clubs 		2- hearts 
* 					1 -	diamonds 	3- spades 
* @author  Idan Abergel & Hen Hess
*/

public class Card {

	private int cardNum;
	private int suit; // 0 clubs 1 diamonds 2 hearts 3 spades
	/*
	 * Contractor of Cards (int,int)
	 * @param card number
	 * @param suit
	 */
	public Card(int num, int suit) {
		this.cardNum = num;
		this.suit = suit;
	}

	public int getNum() {
		return this.cardNum;
	}

	public int getSuit() {
		return this.suit;
	}

	/*
	 * Card to String
	 * @return card number and the letter of the card as string.
	 */
	public String toString() {
		String Letter = null;
		switch (this.suit) {
		case 0:
			Letter = "C";
			break;
		case 1:
			Letter = "D";
			break;
		case 2:
			Letter = "H";
			break;
		case 3:
			Letter = "S";
			break;
		default:
			Letter = "Error";
			System.out.println("Error - public String toString()");
			break;
		}
		return cardNum + "" + Letter;
	}

	/*
	 * compare a card to another one.
	 * @param Object Card
	 * @return 0 if equal , -1 if a<b , 1 a>b
	 */
	public int compareTo(Card other) {
		if (this.cardNum == other.cardNum && this.suit == other.suit)
			return 0;
		if (this.cardNum == other.cardNum) // if they are equal we need to check the suit
		{
			if (this.suit > other.suit)
				return 1; // this.suit bigger than other.suit
			else
				return -1;// this.suit smaller than other.suit
		}
		if (this.cardNum > other.cardNum)
			return 1;
		else
			return -1;
	}

}
