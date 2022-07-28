package com.Adaptator;

public class AdaptatorAvion implements Vehicule {
	
	private Avion avion;
	
	public AdaptatorAvion(String marque) {
		avion = new Avion(marque);
	}
	
	public String getMarque() {
		return avion.getCompagnie();
	}

	public Integer getDistanceParcourue() {
		return avion.getDistanceVol();
	}
	
	@Override
	public void avancer() {
		avion.volerVersAvant();
	}

	@Override
	public void reculer() {
		avion.volerVersArriere();
	}
}
