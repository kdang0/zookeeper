package com.models;

public class Bat extends Mammal {
	 public Bat() {
		 this.energyLevel = 300;
	 }
	public void fly() {
		System.out.println("CAH CAH CAH");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("MY LEHHG");
		this.energyLevel -= 100;
	}
	
}
