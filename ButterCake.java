package com.decoratordesignpattern;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;

public class ButterCake implements Cake {

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Baked a butter sponge cake.");
	}
}
