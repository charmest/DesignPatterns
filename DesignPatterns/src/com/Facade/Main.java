package com.Facade;

public class Main {

	public static void main(String[] args) {
		FacadeGaragiste garagiste = new FacadeGaragiste();
		FacadeConducteur pilote = new FacadeConducteur();
		try {
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.passerVitesseSup();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.passerVitesseSup();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.tournerVolantDroite();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.tournerVolantGauche();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.ralentir();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.passerVitesseSup();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.passerVitesseSup();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			garagiste.gonflerRoue(pilote.getVoiture(), 0);
			garagiste.gonflerRoue(pilote.getVoiture(), 1);
			garagiste.gonflerRoue(pilote.getVoiture(), 2);
			garagiste.gonflerRoue(pilote.getVoiture(), 3);
			System.out.println(garagiste.getStockRoues().getStock());
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			pilote.accelerer();
			System.out.println("vitesse n°" + pilote.getVitesse() + " à " + pilote.getAllure() + " km/h");
			garagiste.changerRoue(pilote.getVoiture(), 3);
			System.out.println(garagiste.getStockRoues().getStock());
		} catch (EngineExplosionException | CalerException | PneuCreveException | OutOfStockException | UnhandledWheelNumberException e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Fin du trajet avec succès");
	}
}
