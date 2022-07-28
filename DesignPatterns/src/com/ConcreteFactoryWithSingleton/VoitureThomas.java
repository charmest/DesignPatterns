package com.ConcreteFactoryWithSingleton;

public class VoitureThomas implements InterfaceVoiture {
	
	// Attributs
	private String nom;
	
	// Constructeur
	public VoitureThomas(String nouveauNom) {
		this.setNom(nouveauNom);
	}
	
	// Méthodes
	public void setNom(String leNom) {
		this.nom = leNom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String toString() {
		return "Objet de type VoitureThomas qui a pour nom " + this.getNom();
	}
}
