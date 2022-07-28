package com.Strategy;

/**
 * 
 * @author Thomas CHARMES
 *
 */
public class DiscountAmount implements I_DiscountStrategy {
	
	private double discountAmount;
	
	public DiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	@Override
	public double getDiscountedPrice(Car car) {
		return car.getPrice() - this.discountAmount;
	}

}
