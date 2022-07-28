package com.Facade;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Voiture {

	private Map<Integer,Roue> roues;
	private int allure;
	private int vitesse;
	
	public int getVitesse() {
		return this.vitesse;
	}
	
	public Map<Integer, Roue> getRoues() {
		return this.roues;
	}
	
	public Voiture() {
		this.roues = new HashMap<Integer,Roue>();
		this.roues.put(0, new Roue());
		this.roues.put(1, new Roue());
		this.roues.put(2, new Roue());
		this.roues.put(3, new Roue());
		this.allure = 0;
		this.vitesse = 0;
	}
	
	public void ralentir() throws CalerException, EngineExplosionException, PneuCreveException {
		if (this.allure > 0) {
			this.allure = this.allure - 5;
			System.out.println("ralentissement ! Nouvelle allure = " + this.allure);
		}
		checkAllureEtVitesse(this.allure, this.vitesse);
		degonfleRoues();
		checkNiveauGonflageRoues();
	}
	
	private void checkNiveauGonflageRoues() {
		for (Entry<Integer, Roue> roue : getRoues().entrySet()) {
			System.out.println("Niveau de gonflage de la roue : " + roue.getValue().getNiveauGonflage());
			if (roue.getValue().getNiveauGonflage() < 60) {
				System.out.println("Attention, penser � regonfler la roue num�ro " + roue.getKey());
			}
		}
		
	}

	private void degonfleRoues() throws PneuCreveException {
		for (Entry<Integer, Roue> roue : getRoues().entrySet()) {
			roue.getValue().setNiveauGonflage(roue.getValue().getNiveauGonflage() - 5);
			System.out.println("d�gonflage des roues, nouveau niveau = " + roue.getValue().getNiveauGonflage());
			if (roue.getValue().getNiveauGonflage() < 20) {
				throw new PneuCreveException("Pneu crev� pour la roue num�ro " + roue.getKey());
			}
		}
	}

	/**
	 * Lance une exception si l'allure n'est pas dans la tranche autoris�e pour cette vitesse
	 * @param allure
	 * @param vitesse
	 */
	private void checkAllureEtVitesse(int allure, int vitesse) throws CalerException, EngineExplosionException {
		if (vitesse == 0) {
			if (allure >= 5) {
				System.out.println("Vous voulez exploser votre moteur ? On ne d�marre pas au point mort !");
			}
			if (allure >= 10) {
				throw new EngineExplosionException("Vous avez explos� votre moteur !!!");
			}
		}
		if (vitesse == 1) {
			if (allure > 20) {
				throw new EngineExplosionException("Vous avez explos� votre moteur !!!");
			}
		}
		if (vitesse == 2) {
			if (allure < 10) {
				throw new CalerException("Vous avez cal�... La honte");
			}
			if (allure > 50) {
				throw new EngineExplosionException("Vous avez explos� votre moteur !!!");
			}
		}
		if (vitesse == 3) {
			if (allure < 20) {
				throw new CalerException("Vous avez cal�... La honte");
			}
			if (allure > 70) {
				throw new EngineExplosionException("Vous avez explos� votre moteur !!!");
			}
		}
		if (vitesse == 4) {
			if (allure < 40) {
				throw new CalerException("Vous avez cal�... La honte");
			}
			if (allure > 85) {
				throw new EngineExplosionException("Vous avez explos� votre moteur !!!");
			}
		}
		if (vitesse == 5) {
			if (allure < 55) {
				throw new CalerException("Vous avez cal�... La honte");
			}
		}
		
	}

	public void accelerer() throws CalerException, EngineExplosionException, PneuCreveException {
		this.allure = this.allure + 5;
		System.out.println("acc�l�ration ! Nouvelle allure = " + this.allure);
		checkAllureEtVitesse(this.allure, this.vitesse);
		degonfleRoues();
		checkNiveauGonflageRoues();
	}
	
	public void changerBougies() {
		System.out.println("changement des bougies");
	}
	
	public void changerVitesse() {
		System.out.println("changement de vitesse");
	}
	
	public void tournerVolant() {
		System.out.println("tourner le volant");
	}
	
	public void vidanger() {
		System.out.println("vidange en cours");
	}
	
	public void changerRoue(int numero) throws UnhandledWheelNumberException {
		if (numero < 0 || numero > 3) {
			throw new UnhandledWheelNumberException("Le num�ro de la roue � changer est incorrect, "
					+ "merci de renseigner un num�ro entre 0 et 3.");
		}
		System.out.println("changement de la roue num�ro " + numero);
		this.roues.remove(numero);
		this.roues.put(numero, new Roue());
	}
	
	public void gonflerRoue(int numero) throws UnhandledWheelNumberException {
		if (numero < 0 || numero > 3) {
			throw new UnhandledWheelNumberException("Le num�ro de la roue � gonfler est incorrect, "
					+ "merci de renseigner un num�ro entre 0 et 3.");
		}
		System.out.println("gonflage de la roue num�ro " + numero);
		this.roues.get(numero).setNiveauGonflage(100);
	}
	
	public void passerPremiere() throws EngineExplosionException, CalerException {
		this.vitesse = 1;
		checkAllureEtVitesse(this.allure, this.vitesse);
	}
	
	public void passerSeconde() throws EngineExplosionException, CalerException {
		this.vitesse = 2;
		checkAllureEtVitesse(this.allure, this.vitesse);
	}
	
	public void passerTroisieme() throws EngineExplosionException, CalerException {
		this.vitesse = 3;
		checkAllureEtVitesse(this.allure, this.vitesse);
	}
	
	public void passerQuatrieme() throws EngineExplosionException, CalerException {
		this.vitesse = 4;
		checkAllureEtVitesse(this.allure, this.vitesse);
		
	}
	
	public void passerCinquieme() throws EngineExplosionException, CalerException {
		this.vitesse = 5;
		checkAllureEtVitesse(this.allure, this.vitesse);
	}
	
	public void passerPointMort() {
		this.vitesse = 0;
	}

	public int getAllure() {
		return this.allure;
	}
}
