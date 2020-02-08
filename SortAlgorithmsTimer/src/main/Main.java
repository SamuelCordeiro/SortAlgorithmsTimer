package main;

import java.util.Arrays;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import resources.VectorFactory;

public class Main extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/view/FXMLMainScreen.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		System.out.println(Arrays.toString(VectorFactory.characterVectorFactory(10)));
	}
	
	public static void main(String[] args) {
		launch(args);

	}

	

}
