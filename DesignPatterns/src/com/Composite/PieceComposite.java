package com.Composite;

import java.util.List;
import java.util.ArrayList;

public class PieceComposite extends Piece {
	
	private List<Piece> liste;

	public PieceComposite(String nom) {
		super(nom);
		this.liste = new ArrayList<Piece>();
	}
	
	public void ajouter(Piece p) {
		liste.add(p);
	}

	@Override
	public double getPrix() {
		double somme = 0;
		for (int i=0; i < this.liste.size(); i++) {
			somme = somme + this.liste.get(i).getPrix();
		}
		return somme;
	}

}
