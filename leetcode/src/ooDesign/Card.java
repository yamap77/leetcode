package ooDesign;

public class Card {
	public static final int SPADES=0;
	public static final int HEARTS=1;
	public static final int DIAMONDS=2;
	public static final int CLUBS=3;
	private int suit,rank;
	public Card(int suit, int rank){
		this.suit=suit;
		this.rank=rank;
	}
	public int getSuit(){
		return this.suit;
	}
	public int getRank(){
		return this.rank;
	}

	

}
