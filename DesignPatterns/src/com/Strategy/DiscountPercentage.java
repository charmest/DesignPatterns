package com.Strategy;

/**
 * 
 * @author Thomas CHARMES
 *
 */
public class DiscountPercentage implements I_DiscountStrategy {
	
	private double discountPercentage;
	
	public DiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	@Override
	public double getDiscountedPrice(Car car) {
		return car.getPrice() * (1 - this.discountPercentage);
	}

}