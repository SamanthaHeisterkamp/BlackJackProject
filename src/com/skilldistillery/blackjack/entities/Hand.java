package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	List<Card> cards; //#cards: List<Card>
	
	public Hand() {
		super();
		this.cards = new ArrayList<>();
	}
	// Hand()
	public void addCard(Card card) {
		this.cards.add(card);
	}
	
	public void cardsInHand() {
		for (Card card : cards) {
			
				System.out.println(card.toString());
			}
		}
	
	public List<Card> getHand() {
		return cards;
	}
	
	public String showCard1() {
		return "" + cards.get(0);
	}
	
	//+ addCard(card:Card); void
	//clear(): void
	public void clearHand() {
		cards.clear();
	}
	//getHandValue(): int//abstract
	public abstract int valueOfHand();
	
	
	
	//toString(): String
public String showCard2() {
	return "" + cards.get(1);
}
@Override
public String toString() {
	return "Hand [cards=" + cards + ", valueOfHand()=" + valueOfHand() + "]";
}

}
