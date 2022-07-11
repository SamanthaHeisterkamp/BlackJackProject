package com.skilldistillery.blackjack.entities;

public class Dealer extends Player{
	private Deck deck = new Deck();
	private BlackjackHand blackjackhand = new BlackjackHand();
	private Player player = new Player();
//deck : Deck

	//Dealer
public Dealer() {
	
}
public void shuffle() {
	deck.shuffle();
	
}
	//dealCardToPlayer()
public void dealCard(Player player) {
	Card card = deck.dealCard();
//	player.addCard(card);
	player.addCard(card);
}
	//dealCardToDealer()


	//dealerPeek();

public void cardsInHand() {
	super.cardsInHand();
}
public int valueDH() {
	return valueOfPH();
}

}
