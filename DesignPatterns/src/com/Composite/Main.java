package com.Composite;

public class Main {

	public static void main(String[] args) {	
		PieceComposite roue = new PieceComposite("roue");
		Piece pneu = new PieceSimple("pneu", 40);
		Piece enjoliveur = new PieceSimple("enjoliveur", 100);
		Piece jantes = new PieceSimple("jantes", 250);
		roue.ajouter(pneu);
		roue.ajouter(enjoliveur);
		roue.ajouter(jantes);
		
		PieceComposite voiture = new PieceComposite("voiture");
		Piece volant = new PieceSimple("volant", 30.00);
		Piece porte = new PieceSimple("porte", 89.99);
		voiture.ajouter(volant);
		voiture.ajouter(porte);
		voiture.ajouter(porte);
		voiture.ajouter(porte);
		voiture.ajouter(porte);
		voiture.ajouter(porte);
		voiture.ajouter(roue);
		voiture.ajouter(roue);
		voiture.ajouter(roue);
		voiture.ajouter(roue);
		System.out.println("voiture.getPrix() = " + voiture.getPrix());		
	}
}
