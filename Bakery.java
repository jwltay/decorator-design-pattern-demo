package com.decoratordesignpattern;

public class Bakery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cake rainbowCake = new RainbowCake(new ButterCake());
		rainbowCake.bake();
		
		System.out.println("----------");
		
		Cake specialCake = (new RainbowCake(new ChocolateCake(new ButterCake())));
		specialCake.bake();
	}

}
