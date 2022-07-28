package com.Adaptator;

public class Train implements Vehicule {
	private String marque;
	private int distanceParcourue;
	
	public Train(String marque) {
		setMarque(marque);
		setDistanceParcourue(0);
	}
	
	public String getMarque() {
		return this.marque;
	}
	
	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Integer getDistanceParcourue() {
		return this.distanceParcourue;
	}
	
	public void setDistanceParcourue(Integer distanceParcourue) {
		this.distanceParcourue = distanceParcourue;
	}
	
	@Override
	public void avancer() {
		setDistanceParcourue(getDistanceParcourue() + 3);
	}

	@Override
	public void reculer() {
		setDistanceParcourue(getDistanceParcourue() - 3);
	}
}
