package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	List<Card> hand = new ArrayList<>(); //#cards: List<Card>
	
	// Hand()
	Hand() {
		
	}
	
	
	//+ addCard(card:Card); void
	public void addCardToHand(Card card) {
		hand.add(card);
	}
	//clear(): void
	public void clearCardsInHand() {
		hand.clear();
	}
	//getHandValue(): int//abstract
	public abstract int valueOfHand();
	
	
	//toString(): String
@Override
public String toString() {
	return "Hand [hand=" + hand + "]";

}
}
