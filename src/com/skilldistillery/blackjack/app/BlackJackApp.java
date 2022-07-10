package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;

public class BlackJackApp {
	private Deck deck = new Deck();
	private Dealer dealer = new Dealer();
	boolean loop = true;

	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.play();
		
	}
	public void play() {
		System.out.println("Lets play: ");
		
		while(loop) {
			deck.shuffle(); 
			for (int i = 0; i < 2; i++) {
			dealer.dealCardToDealer(); //Dealer
			dealer.dealCardToPlayer(); //Player
			}
			playersTurn();
		//	dealersTurn();
		//	results();
			
				
			
		}
	}
	
	public void playersTurn() {
		
//		System.out.println("Cards: ");
//		player.cardsInHand():
//			if ( player.valueOfCards() == 21) {
//				System.out.println("Blackjack");
//			}
//		System.out.println("Cards equal: " + player.valueOfCards());
//		
	}
	
	
	
	

}
