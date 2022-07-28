package com.Facade;

public class Roue {
	
	private int niveauGonflage;
	
	public Roue() {
		this.setNiveauGonflage(100);
	}
	
	public void gonflerRoue() {
		this.setNiveauGonflage(100);
	}

	public int getNiveauGonflage() {
		return niveauGonflage;
	}

	public void setNiveauGonflage(int niveauGonflage) {
		this.niveauGonflage = niveauGonflage;
	}
}
