/*
 * JavaFx Examples
 *
 * Copyright (c) 2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package kr.pe.elex.examples.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class FxmlApplication extends Application {
	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello!");
		primaryStage.setWidth(800);
		primaryStage.setHeight(600);
		//GridPane root = new GridPane();
		Parent root = FXMLLoader.load(Objects.requireNonNull(getClass()
				.getResource("/fxml/root.fxml")));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
