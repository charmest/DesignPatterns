package com.Facade;

public class FacadeGaragiste {
	
	private Voiture voiture;
	private StockRoues stock;
	
	public FacadeGaragiste() {
		this.setVoiture(new Voiture());
		this.stock = new StockRoues();
	}
	
	public StockRoues getStockRoues() {
		return this.stock;
	}
	
	public void changerBougies(Voiture voiture) {
		voiture.changerBougies();
	}
	
	public void vidanger(Voiture voiture) {
		voiture.vidanger();
	}
	
	public void changerRoue(Voiture voiture, int numero) throws OutOfStockException, UnhandledWheelNumberException {
		if (this.stock.getStock() <= 0) {
			throw new OutOfStockException("Il n'y a plus de roues, il faut en recommander !");
		}
		voiture.changerRoue(numero);
		stock.setStock(stock.getStock() - 1);
	}
	
	public void gonflerRoue(Voiture voiture, int numero) throws UnhandledWheelNumberException {
		voiture.gonflerRoue(numero);
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	
}
