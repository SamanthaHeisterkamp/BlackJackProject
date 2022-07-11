package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	// cards: List<Card>
	private List<Card> deck = new ArrayList<>();

	// Deck()
	public Deck() {
		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();

		for (Suit suit : suits) {
			for (Rank rank : ranks) {
				Card card = new Card(suit, rank);
				deck.add(card);

			}
		}
			return;
		}
	

	public Card dealCard() {
		return deck.remove(0);

	}

	// shuffle(): void
	public void shuffle() {
		Collections.shuffle(deck);
	}

	// size(): int
	public int checkDeckSize() {
		return deck.size();
}
}
