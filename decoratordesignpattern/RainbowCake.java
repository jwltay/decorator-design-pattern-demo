package com.decoratordesignpattern;

public class RainbowCake extends CakeDecorator {
	private String topping = "rainbow sprinkles";
	
	public RainbowCake(Cake cake) {
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
