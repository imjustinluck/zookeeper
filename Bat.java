package com.jda.zoo;

public class Bat extends Mammal {

	public Bat() {
	}

	public Bat(int num) {
		super(num);
	}

	public void fly() {
		System.out.println("Yeehaw!");
		this.setEnergy(this.getEnergy()-50);
		this.displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("Yummy humans");
		this.setEnergy(this.getEnergy()+25);
		this.displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("I'm gonna kill your whole family!");
		this.setEnergy(this.getEnergy()-100);
		this.displayEnergy();
	}
}
