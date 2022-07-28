package com.Facade;

public class FacadeConducteur {
	
	private Voiture voiture;
	
	public FacadeConducteur() {
		this.voiture = new Voiture();
	}
	
	public Voiture getVoiture() {
		return this.voiture;
	}
	
	public int getVitesse() {
		return this.voiture.getVitesse();
	}
	
	public int getAllure() {
		return this.voiture.getAllure();
	}
	
	public void accelerer() throws CalerException, EngineExplosionException, PneuCreveException {
		this.voiture.accelerer();
	}
	
	public void ralentir() throws CalerException, EngineExplosionException, PneuCreveException {
		this.voiture.ralentir();
	}
	
	public void tournerVolantDroite() {
		voiture.tournerVolant();
	}
	
	public void tournerVolantGauche() {
		voiture.tournerVolant();
	}
	
	public void passerVitesseSup() throws EngineExplosionException, CalerException {
		if (voiture.getVitesse() == 0) {
			voiture.passerPremiere();
			return;
		}
		if (voiture.getVitesse() == 1) {
			voiture.passerSeconde();
			return;
		}
		if (voiture.getVitesse() == 2) {
			voiture.passerTroisieme();
			return;
		}
		if (voiture.getVitesse() == 3) {
			voiture.passerQuatrieme();
			return;
		}
		if (voiture.getVitesse() == 4) {
			voiture.passerCinquieme();
			return;
		}
	}
	
	public void passerVitesseInf() throws EngineExplosionException, CalerException {
		if (voiture.getVitesse() == 2) {
			voiture.passerPremiere();
			return;
		}
		if (voiture.getVitesse() == 3) {
			voiture.passerSeconde();
			return;
		}
		if (voiture.getVitesse() == 4) {
			voiture.passerTroisieme();
			return;
		}
		if (voiture.getVitesse() == 5) {
			voiture.passerQuatrieme();
			return;
		}
		if (voiture.getVitesse() == 1) {
			voiture.passerPointMort();
			return;
		}
	}
	
}
