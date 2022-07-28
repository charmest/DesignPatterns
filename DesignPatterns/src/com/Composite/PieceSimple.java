package com.Composite;

public class PieceSimple extends Piece {

	private double prix;
	
	public PieceSimple(String nom, double prix) {
		super(nom);
		this.prix = prix;
	}
	
	@Override
	public double getPrix() {
		return this.prix;
	}

}
