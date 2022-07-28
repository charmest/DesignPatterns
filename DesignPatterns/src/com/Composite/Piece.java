package com.Composite;

public abstract class Piece {

	@SuppressWarnings("unused")
	private String nom;
	
	public Piece(String nom) {
		this.nom = nom;
	}
	
	public abstract double getPrix();
}
