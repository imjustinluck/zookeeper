package com.jda.zoo;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla();
		
		Gorilla gogo = new Gorilla(200);
		
		gogo.displayEnergy();
		gogo.throwSomething();
		
		gorilla.displayEnergy();
		
		gorilla.throwSomething();
//		gorilla.throwSomething();
//		gorilla.throwSomething();
//
//		gorilla.eatBananas();
//		gorilla.eatBananas();
//		
//		gorilla.climb();
	}

}
