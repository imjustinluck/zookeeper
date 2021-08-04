package com.jda.zoo;

public class Gorilla extends Mammal {
	
	public Gorilla() {
	}
	
	public Gorilla(int num) {
		this.setEnergy(num);
	}

	public void throwSomething() {
		System.out.println("Gorilla threw a fit!");
		this.setEnergy(this.getEnergy()-5);
		this.displayEnergy();
	}
	public void eatBananas() {
		System.out.println("Gorilla ate a banana!");
		this.setEnergy(this.getEnergy()+10);
		this.displayEnergy();
	}
	public void climb() {
		System.out.println("Gorilla climbed!");
		this.setEnergy(this.getEnergy()-10);
		this.displayEnergy();
	}
}
