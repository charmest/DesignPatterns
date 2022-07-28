package com.Strategy;

/**
 * 
 * @author Thomas CHARMES
 *
 */
public class Car {
	
	private String name;
	private Double price;
	private I_DiscountStrategy strategy;
	
	public Car(String name, Double price) {
		this.setName(name);
		this.setPrice(price);
		this.strategy = DiscountStrategyFactory.getInstance().createDiscountPercentage();
	}
	
	public double getOriginalPrice() {
		return this.getPrice();
	}
	
	public double getDiscountedPrice() {
		return strategy.getDiscountedPrice(this);
	}
	
	public void setDiscountStrategy(I_DiscountStrategy newStrategy) {
		strategy = newStrategy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * print in console the different discounted car prices
	 * @param args
	 */
	public static void main(String[] args) {
		Car c = new Car("Totomobile", Double.parseDouble("100000"));
		System.out.println("original price = " + c.getOriginalPrice());
		System.out.println("discounted price with percentage = " + c.getDiscountedPrice());
		c.setDiscountStrategy(DiscountStrategyFactory.getInstance().createDiscountAmount());
		System.out.println("original price = " + c.getOriginalPrice());
		System.out.println("discounted price with amount = " + c.getDiscountedPrice());
	}
}
