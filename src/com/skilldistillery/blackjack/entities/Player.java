package com.skilldistillery.blackjack.entities;

public class Player {
	 Player player = new Player();
	private BlackjackHand blackjackhand = new BlackjackHand();
	
//hand: Hand
	private Hand hand;
	
// card: Card
	private Card card;

public void addCardToHand(Card card) {
	player.addCardToHand(card);
}
public void valueOfPlayersCards() {
	//return player.valueOfHand();
}


public void cardsInHand() {
	player.cardsInHand();
	
}

}
	
	//Player()
	//getHand()
	//hit()
	//Stand()
	//win()
	//bust()

