package com.Observer;

/**
 * 
 * @author Thomas CHARMES
 *
 */
public class Pesos implements I_Observer {

	@Override
	public void update(Price price) {
		double pricePesos = price.getValue()*20.72;
		System.out.println("Price in pesos : " + pricePesos);
	}

}
