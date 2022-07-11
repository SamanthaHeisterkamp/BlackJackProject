package com.skilldistillery.blackjack.entities;

public class BlackjackHand extends Hand {

	//BlackjackHand()
	BlackjackHand() {
		
	}
	//getHandValue(): int
	
	//isBlackjack(): boolean
	public boolean isBlackjack() {
		if(this.valueOfHand() == 21) {
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
		for (int i = 0; i < cards.size(); i++) {
			for (int h =1; h < cards.size(); h++) {
				dealersHandValue = h;
				
				System.out.println(dealersHandValue);
			}
		}
	}
	@Override
	public int valueOfHand() {
		int handValue = 0;
		
		for (Card card : cards) {
			handValue += card.getValue();
			
		}
		return handValue;
		
}
}
