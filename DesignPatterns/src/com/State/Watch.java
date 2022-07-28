package com.State;

public class Watch {
	
	private AbstractState state;
	private int hours;
	private int minutes;
	
	public AbstractState getState() {
		return state;
	}

	public void setState(AbstractState state) {
		this.state = state;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public Watch() {
		setState(new StateDisplay());
		setHours(0);
		setMinutes(0);
	}

	public void incrementMinutes() {
		setMinutes(incrementLoopBetween0andMax(getMinutes(), 59));
	}
	
	public void incrementHours() {
		setHours(incrementLoopBetween0andMax(getHours(), 23));
	}
	
	/**
	 * Increment the 'number' param value by one
	 * or reset it to 0 if the max is reached
	 * @param number
	 * @param max
	 * @return
	 */
	private int incrementLoopBetween0andMax(int number, int max) {
		if (number == max) {
			number = 0;
		}
		else {
			number ++;
		}
		return number;
	}
	
	public void modeButton() {
		getState().modeButton(this);
	}
	
	public void incrementButton() {
		getState().incrementButton(this);
	}
	
	public static void main(String[] args) {
		Watch w = new Watch();
		w.modeButton();
		for (int i = 0; i < 10; i++) {
			w.incrementButton();
		}
		w.modeButton();
		for (int i = 0; i < 15; i++) {
			w.incrementButton();
		}
		w.modeButton();
		System.out.println("State : "+w.getState().getClass().toString());
		System.out.println("Hours : "+w.getHours());
		System.out.println("Minutes : "+w.getMinutes());
	}
}
