package ooDesign;
import java.util.*;
public class Deck implements Iterator<Card> {
	private ArrayList<Card> cardList;
    private int index;
    public Deck () {
    	cardList=new ArrayList<Card>();
    	for(int suit=Card.SPADES;suit<=Card.CLUBS;suit++){
    		for(int rank=1;rank<14;rank++){
    			Card card=new Card(suit,rank);
    			cardList.add(card);
    		}
    	}
    	shuffle();
    }
    private void shuffle(){
    	Collections.shuffle(cardList);
    	index=0;
    }
    public boolean hasNext(){
    	return index<cardList.size();
    }
    public Card next(){
    	Card newCard=cardList.get(index);
    	index++;
    	return newCard;
    }
    public void remove(){
    	
    }
}
