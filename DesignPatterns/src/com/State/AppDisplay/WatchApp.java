package com.State.AppDisplay;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Launch the watch application
 * @author Thomas CHARMES
 */
public class WatchApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
		Scene scene = new Scene(root, 575, 300);
		primaryStage.setTitle("Watch application");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
