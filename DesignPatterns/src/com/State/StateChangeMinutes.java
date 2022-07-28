package com.State;

public class StateChangeMinutes extends AbstractState {

	public void modeButton(Watch watch) {
		watch.setState(new StateDisplay());
	}
	
	public void incrementButton(Watch watch) {
		watch.incrementMinutes();
	}
	
	public String toString() {
		return "Minutes modification mode";
	}
}
