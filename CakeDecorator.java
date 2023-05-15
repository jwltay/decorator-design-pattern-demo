package com.decoratordesignpattern;

public class CakeDecorator implements Cake {
	protected Cake cake;
	
	public CakeDecorator(Cake cake) {
		this.cake = cake;
	}
	
	public void bake() {
		this.cake.bake();
	}
}
