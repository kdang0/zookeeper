package com.models;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("THROWING ASDJASD");
		this.energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("EATING BANANA");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("CLIMBING TREE");
		this.energyLevel -= 10;
	}
}
