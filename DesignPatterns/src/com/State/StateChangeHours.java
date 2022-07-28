package com.State;

public class StateChangeHours extends AbstractState {

	public void modeButton(Watch watch) {
		watch.setState(new StateChangeMinutes());
	}
	
	public void incrementButton(Watch watch) {
		watch.incrementHours();
	}
	
	public String toString() {
		return "Hours modification mode";
	}
}
