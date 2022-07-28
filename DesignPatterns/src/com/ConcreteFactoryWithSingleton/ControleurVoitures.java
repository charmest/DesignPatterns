package com.ConcreteFactoryWithSingleton;

public class ControleurVoitures {
	
	public static void main(String[] args) {
		InterfaceVoiture newCar = ConcreteFabriqueVoiture.getInstance().createVoiture("THOMASSTODONTE");
		System.out.println(newCar.toString());
	}

}
