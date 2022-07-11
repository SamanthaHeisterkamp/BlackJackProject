package com.skilldistillery.blackjack.entities;

public class Player {
	private BlackjackHand playersHand = new BlackjackHand();
//hand: Hand
	
// card: Card

public int valueOfPH() {
	return playersHand.valueOfHand();
}


public void cardsInHand() {
	 playersHand.cardsInHand();
	
}
public void addCard(Card card) {
	playersHand.addCard(card);
}
public void clearHand() {
	playersHand.clearHand();
}
public BlackjackHand getPlayersHand() {
	return playersHand;
}
public String showCard1() {
	return playersHand.showCard1();
}
public String showCard2() {
	return playersHand.showCard2();
}
}


	
	//Player()
	//getHand()
	//hit()
	//Stand()
	//win()
	//bust()

