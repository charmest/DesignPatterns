package com.Adaptator;

public class Avion {
	private String compagnie;
	private int distanceVol;
	
	public Avion(String compagnie) {
		setCompagnie(compagnie);
		setDistanceVol(0);
	}
	
	public String getCompagnie() {
		return this.compagnie;
	}
	
	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}

	public Integer getDistanceVol() {
		return this.distanceVol;
	}
	
	public void setDistanceVol(Integer distanceVol) {
		this.distanceVol = distanceVol;
	}
	
	public void volerVersAvant() {
		setDistanceVol(getDistanceVol() + 7);
	}

	public void volerVersArriere() {
		setDistanceVol(getDistanceVol() - 7);
	}
}
