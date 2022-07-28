package com.Adaptator;

public class Main {
	
	public static void main(String[] args) {
		Vehicule adaptatorAvion = new AdaptatorAvion("EasyJet");
		System.out.println("adaptatorAvion distance initiale = " + adaptatorAvion.getDistanceParcourue());
		adaptatorAvion.avancer();
		adaptatorAvion.avancer();
		adaptatorAvion.avancer();
		System.out.println("adaptatorAvion distance finale = " + adaptatorAvion.getDistanceParcourue());
		System.out.println("\n");
		Vehicule train = new Train("SNCF");
		System.out.println("Train distance initiale = " + train.getDistanceParcourue());
		train.avancer();
		train.avancer();
		train.avancer();
		System.out.println("Train distance finale = " + train.getDistanceParcourue());
		System.out.println("\n");
		
		Vehicule voiture = new Voiture("Opel Corsa");
		System.out.println("Voiture distance initiale = " + voiture.getDistanceParcourue());
		voiture.avancer();
		voiture.avancer();
		voiture.avancer();
		System.out.println("Voiture distance finale = " + voiture.getDistanceParcourue());
	}

}
