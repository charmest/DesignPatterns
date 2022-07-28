package com.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Thomas CHARMES
 *
 */
public class Price {
	
	private Double value;
	private List<I_Observer> listeners = new ArrayList<I_Observer>();
	
	public void bound(I_Observer o) {
		listeners.add(o);
	}
	
	public void warning() {
		for (I_Observer observers : listeners) {
			observers.update(this);
		}
	}

	public List<I_Observer> getListeners() {
		return listeners;
	}

	public void setListeners(List<I_Observer> listeners) {
		this.listeners = listeners;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
		warning();
	}
	
	/**
	 * print in console the given value in multiple currencies
	 * @param args
	 */
	public static void main(String[] args) {
		Price p = new Price();
		I_Observer euro = new Euro();
		I_Observer pesos = new Pesos();
		I_Observer yen = new Yen();
		List<I_Observer> listeners = new ArrayList<I_Observer>();
		listeners.add(euro);
		listeners.add(pesos);
		listeners.add(yen);
		p.setListeners(listeners);
		p.setValue(Double.parseDouble("35"));
		p.setValue(Double.parseDouble("5"));
		p.setValue(Double.parseDouble("109.99"));
	}

}
