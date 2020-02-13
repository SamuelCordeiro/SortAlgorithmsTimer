package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	private static Stage stage;
	private static Scene FXMLMainScreen;
	private static Scene FXMLResultsScreen;

	@Override
	public void start(Stage currentStage) throws Exception {
		stage = currentStage;
		Parent fxmlMainScreen = FXMLLoader.load(getClass().getResource("/view/FXMLMainScreen.fxml"));
		FXMLMainScreen = new Scene(fxmlMainScreen);
		Parent fxmlResultsScreen = FXMLLoader.load(getClass().getResource("/view/FXMLResultsScreen.fxml"));
		FXMLResultsScreen = new Scene(fxmlResultsScreen);
		currentStage.setTitle("Sort Algorithms Timer");
		currentStage.setScene(FXMLMainScreen);
		currentStage.show();
	}
	
	public static void changeScreen(String Screen) {
		switch (Screen) {
		case "FXMLMainScreen": {
			stage.setScene(FXMLMainScreen);
		}
		case "FXMLResultsScreen":{
			stage.setScene(FXMLResultsScreen);
		}
		}
	}
	
	public static void main(String[] args) {
		launch(args);

	}

	

}
