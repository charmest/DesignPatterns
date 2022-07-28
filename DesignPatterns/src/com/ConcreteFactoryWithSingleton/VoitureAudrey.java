package com.ConcreteFactoryWithSingleton;

public class VoitureAudrey implements InterfaceVoiture {
	
	// Attributs
	private String leNom;

	// Constructeur
	public VoitureAudrey(String nouveauNom) {
		this.setNom(nouveauNom);
	}

	// Méthodes
	public void setNom(String leNom) {
		this.leNom = leNom;
	}

	public String getNom() {
		return this.leNom;
	}
	
	public String toString() {
		return "Objet de type VoitureAudrey qui a pour nom " + this.getNom();
	}
}
