package com.State.AppDisplay;

import java.util.Calendar;

import com.State.Watch;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Controller linked to the FXML layout
 * @author Thomas CHARMES
 */
public class FXMLController {

	@FXML
	private Label hours;
	@FXML
	private Label minutes;
	@FXML
	private Label timeLabel;
	@FXML
	private Label textLabel;
	@FXML
	private Label stateLabel;
	@FXML
	private VBox vbox;
	@FXML
	private HBox hbox;
	@FXML
	private Button modeButton;
	@FXML
	private Button incrementButton;
	
	private Watch watch;
	
	public FXMLController() {
		this.setWatch(new Watch());
	}
	
	@FXML
	private void colorModeButton() {
		this.modeButton.setStyle("-fx-background-color:#FFE4D0;");
	}
	
	@FXML
	private void colorIncrementButton() {
		this.incrementButton.setStyle("-fx-background-color:#FFE4D0;");
	}
	
	@FXML
	private void uncolorModeButton() {
		this.modeButton.setStyle("-fx-background-color:#ECF9FF;");
	}
	
	@FXML
	private void uncolorIncrementButton() {
		this.incrementButton.setStyle("-fx-background-color:#ECF9FF;");
	}
	
	@FXML
	private void modeButton() {
		getWatch().modeButton();
		updateStateLabel();
		this.incrementButton.setDisable(getWatch().getState().isDisplayState());
		if (getWatch().getState().isDisplayState()) {
			if (selectedTimesMatchesLocalTime()) {
				timeLabel.setText("I'M ON TIME !!!");
				timeLabel.setStyle("-fx-font-color:#008000;");
				stateLabel.setText("");
				textLabel.setText("");
				modeButton.setDisable(true);
			}
		}
	}

	private boolean selectedTimesMatchesLocalTime() {
		Calendar rightNow = Calendar.getInstance();
		String currentHour = integerToStringTimeFormat(rightNow.get(Calendar.HOUR_OF_DAY));
		String currentMinute = integerToStringTimeFormat(rightNow.get(Calendar.MINUTE));
		String myHour = integerToStringTimeFormat(getWatch().getHours());
		String myMinute = integerToStringTimeFormat(getWatch().getMinutes());
		return myHour.equals(currentHour) && myMinute.equals(currentMinute);
	}

	@FXML
	private void incrementButton() {
		getWatch().incrementButton();
		updateTimeLabel();
	}

	void updateStateLabel() {
		stateLabel.setText(getWatch().getState().toString());
	}
	
	void updateTimeLabel() {
		hours.setText(integerToStringTimeFormat(getWatch().getHours()));
		minutes.setText(integerToStringTimeFormat(getWatch().getMinutes()));
	}

	/**
	 * integerToStringTimeFormat(1)  --> "01"
	 * integerToStringTimeFormat(14) --> "14"
	 * @param time
	 * @return a string format of the time
	 */
	private String integerToStringTimeFormat(int time) {
		if (time < 10) {
			return "0"+time;
		}
		else {
			return ""+time;
		}
	}

	public Watch getWatch() {
		return watch;
	}

	public void setWatch(Watch watch) {
		this.watch = watch;
	}

}
