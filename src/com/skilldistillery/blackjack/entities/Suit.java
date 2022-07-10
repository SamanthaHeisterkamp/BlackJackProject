package com.skilldistillery.blackjack.entities;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");
	//name:String
	private String name;

	Suit() {

	}
	//Suit(name: String)
	Suit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}
	//toString(): String
	@Override
	public String toString() {
		return this.name;
	}
}
