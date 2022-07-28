package com.Strategy;

public class DiscountStrategyFactory {
	
	private static DiscountStrategyFactory instance;
	
	protected DiscountStrategyFactory() {};
	
	public static synchronized DiscountStrategyFactory getInstance() {
		if (instance == null) {
			instance = new DiscountStrategyFactory();
		}
		return instance;
	}
	
	public I_DiscountStrategy createDiscountPercentage() {
		double externalData = 0.2;
		return new DiscountPercentage(externalData);
	}
	
	public I_DiscountStrategy createDiscountAmount() {
		double externalData = 5000;
		return new DiscountAmount(externalData);
	}

}
