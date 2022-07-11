package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackJackApp {
	private Player player = new Player();
	private Dealer dealer = new Dealer();
	
	
	boolean loop = true;
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		BlackJackApp app = new BlackJackApp();
		app.play();

	}

	public void play() {
		System.out.println(" _     _            _    _            _    \n"
				+ "| |   | |          | |  (_)          | |   \n" + "| |__ | | __ _  ___| | ___  __ _  ___| | __\n"
				+ "| '_ \\| |/ _` |/ __| |/ / |/ _` |/ __| |/ /\n" + "| |_) | | (_| | (__|   <| | (_| | (__|   < \n"
				+ "|_.__/|_|\\__,_|\\___|_|\\_\\ |\\__,_|\\___|_|\\_\\\n"
				+ "                       _/ |                \n" + "                      |__/       ");

		System.out.println("\n" + "  .------..------..------..------.     .------..------..------..------.\n"
				+ "  |A.--. ||C.--. ||E.--. ||S.--. |.-.  |H.--. ||I.--. ||G.--. ||H.--. |\n"
				+ "  | (\\/) || :/\\: || (\\/) || :/\\: ((5)) | :/\\: || (\\/) || :/\\: || :/\\: |\n"
				+ "  | :\\/: || :\\/: || :\\/: || :\\/: |'-.-.| (__) || :\\/: || :\\/: || (__) |\n"
				+ "  | '--'A|| '--'C|| '--'E|| '--'S| ((1)) '--'H|| '--'I|| '--'G|| '--'H|\n"
				+ "  `------'`------'`------'`------'  '-'`------'`------'`------'`------'\n" + " ");
		System.out.println(" ");
		System.out.println("**DEALER SHUFFLES**");
		System.out.println(" *[][][][][][][]*");
		System.out.println(" ");
		while (loop) {
			dealer.shuffle();
			// System.out.println("[][]Dealing Cards[][]");
			for (int i = 0; i < 2; i++) {
				dealer.dealCard(player); // Dealer
				dealer.dealCard(dealer); // Player
			}
			playersTurn();
			dealersTurn();
			winner();

		}
	}

	public void playersTurn() {

		System.out.println("[] [] Players Cards [] [] ");
		System.out.println(" ");
		player.cardsInHand();
		System.out.println(" ");
		if (player.valueOfPH() == dealer.valueDH() && player.valueOfPH() == 21) {
			System.out.println("Draw");
		}
		if (player.valueOfPH() == 21) {
			System.out.println("**BLACKJACK!**");
		}
		if (player.valueOfPH() > 21) {
			System.out.println("BUST!");
		}
		System.out.println("Players cards equal: " + player.valueOfPH());
		System.out.println(" ");
		// System.out.println("Dealers equal: " + dealer.valueDH());
		System.out.println("Dealers card is: " + dealer.showCard1());
		System.out.println(" ");

		while (player.valueOfPH() < 21) {
			System.out.println("Hit or Stand?");
			System.out.println("Enter (1) to Hit.");
			System.out.println("Enter (2) to Stand.");
			int input = sc.nextInt();
			sc.nextLine();
			if (input == 1) {
				System.out.println("You don't know when to quit, do ya Griswold?");
				dealer.dealCard(player);
				System.out.println("Players cards: ");
				player.cardsInHand();
				System.out.println(" ");
				System.out.println("Players hand value: " + player.valueOfPH());
				
				if (player.valueOfPH() == 21) {
					System.out.println("Blackjack!");
					winner();
				}
				dealer.valueDH();
				dealersTurn();
			}
			if (player.valueOfPH() > 21) {
				System.out.println("YOU Busted");

			}
			if (input == 2) {
				System.out.println("Player Stands.");
				System.out.println("");
				System.out.println("The value of players hand is: " + player.valueOfPH());
				System.out.println("");
				player.cardsInHand();
				System.out.println(" ");
				System.out.println("Dealers cards: ");
				dealer.cardsInHand();
				System.out.println(" ");
				System.out.println("Dealers value: " + dealer.valueDH());
				dealersTurn();
				break;
			}
		}

	}

	public void dealersTurn() {
		while (dealer.valueDH() < 17) {
			System.out.println("Dealer hits.");
			System.out.println("");
			dealer.dealCard(dealer);
			System.out.println("Dealers cards: ");
			dealer.cardsInHand();
			System.out.println(dealer.valueDH());

			if (dealer.valueDH() > 21) {
				System.out.println("Dealer busted. ");
				System.out.println(" ");
				System.out.println("Player wins. ");
				// results();
			}
			if (dealer.valueDH() == 21) {
				System.out.println("Dealer wins Blackjack.");
			}
		}
	}

	public void winner() {
		if (player.valueOfPH() > dealer.valueDH() && player.valueOfPH() < 22) {
			System.out.println("Player wins!");

		} else if (player.valueOfPH() == dealer.valueDH()) {
			System.out.println("Draw");
		} else {
			System.out.println("Dealer wins. ");
		}
		System.out.println("Would you like to play again? (1) Yes (2) No");
		int input = sc.nextInt();
		sc.nextLine();
		if (input == 1) {
			System.out.println("Let's play again! ");
			player.clearHand();
			dealer.clearHand();
			play();

		} else if (input == 2) {
			gameOver();
		} else {
			System.out.println("Please choose an option.");
		}
	}

	public void gameOver() {
		loop = false;
		System.out.println("\n"
				+ "     ___   __   _  _  ____     __   _  _  ____  ____      \n"
				+ "    / __) / _\\ ( \\/ )(  __)   /  \\ / )( \\(  __)(  _ \\     \n"
				+ "   ( (_ \\/    \\/ \\/ \\ ) _)   (  O )\\ \\/ / ) _)  )   / _   \n"
				+ "    \\___/\\_/\\_/\\_)(_/(____)   \\__/  \\__/ (____)(__\\_)(_)  \n"
				+ " ");
		System.out.println("Thank you for playing.");
		
	}

}
