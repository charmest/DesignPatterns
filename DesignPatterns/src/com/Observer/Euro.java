package com.Observer;

/**
 * 
 * @author Thomas CHARMES
 *
 */
public class Euro implements I_Observer {

	@Override
	public void update(Price price) {
		double priceEuro = price.getValue();
		System.out.println("Price in euros : " + priceEuro);
	}

}
