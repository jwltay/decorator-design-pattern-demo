package com.decoratordesignpattern;

public class ChocolateCake extends CakeDecorator {
	private String topping = "chocolate ganache";
	
	public ChocolateCake(Cake cake) {
		super(cake);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void bake() {
		// TODO Auto-generated method stub
		super.bake();
		System.out.println("Added " + topping);
		}
}
