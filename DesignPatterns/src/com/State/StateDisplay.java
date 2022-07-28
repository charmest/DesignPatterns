package com.State;

public class StateDisplay extends AbstractState {
	
	public void modeButton(Watch watch) {
		watch.setState(new StateChangeHours());
	}
	
	public boolean isDisplayState() {
		return true;
	}
	
	public String toString() {
		return "Display mode, please click the mode button to set the time";
	}
}
