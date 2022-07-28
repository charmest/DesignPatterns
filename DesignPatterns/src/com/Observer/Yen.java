package com.Observer;

/**
 * 
 * @author Thomas CHARMES
 *
 */
public class Yen implements I_Observer {

	@Override
	public void update(Price price) {
		double priceYen = price.getValue()*136.75;
		System.out.println("Price in yen : " + priceYen);
	}

}