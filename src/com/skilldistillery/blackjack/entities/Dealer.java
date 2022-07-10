package com.skilldistillery.blackjack.entities;

public class Dealer {
	Dealer dealer = new Dealer();
	public Player player = new Player();
//deck : Deck
private Deck deck;

	//Dealer
public Dealer() {
	
}
	//dealCardToPlayer()
public void dealCardToPlayer() {
	Card card = deck.deal();
//	player.addCard(card);
	player.addCardToHand(card);
}
	//dealCardToDealer()
public void dealCardToDealer() {
	
}
	//dealerPeek();
}
