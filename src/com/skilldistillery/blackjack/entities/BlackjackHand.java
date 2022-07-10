package com.skilldistillery.blackjack.entities;

public class BlackjackHand extends Hand {
	BlackjackHand blackjackhand = new BlackjackHand();

	//BlackjackHand()
	BlackjackHand() {
		
	}
	//getHandValue(): int
	
	//isBlackjack(): boolean
	public boolean isBlackjack() {
		int value = this.valueOfHand();
		if(value == 21) {
			return true;
		}
		return false;
	}
	
	//isBust(); boolean
	public boolean isBust() {
	int value = this.valueOfHand();
	if (value > 21) { 
		return true;
	}
		return false;
	}
	
	
	public void valueOfDealersHand() {
		int dealersHandValue = 0;
		for (int i = 0; i < hand.size(); i++) {
			for (int h =1; h < hand.size(); h++) {
				dealersHandValue = h;
				
				System.out.println(dealersHandValue);
			}
		}
	}
	@Override
	public int valueOfHand() {
		int handValue = 0;
		
		for (Card card : hand) {
			handValue += card.getValue();
			
		}
		return handValue;
		
}
}
