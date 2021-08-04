package com.jda.zoo;

public class Mammal {

	private int energy;
	
	public Mammal() {
		this.setEnergy(100);
	}
	
	public Mammal(int num) {
		this.setEnergy(num);
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public int displayEnergy() {
		
		int energy = this.getEnergy();
		
		System.out.println(energy);
		return energy;
	}
}
