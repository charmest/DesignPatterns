package com.ConcreteFactoryWithSingleton;

public class ConcreteFabriqueVoiture {
	
	private static ConcreteFabriqueVoiture instance = null;
	
	protected ConcreteFabriqueVoiture() {}
	
	public synchronized static ConcreteFabriqueVoiture getInstance() {
		if (instance == null) {
			instance = new ConcreteFabriqueVoiture();
		}
		return instance;
	}
	
	public InterfaceVoiture createVoiture(String nom) {
		return new VoitureThomas(nom);
	}
}
