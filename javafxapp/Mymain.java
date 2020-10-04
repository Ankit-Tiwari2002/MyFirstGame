package com.internshala.connectfour.javafxapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class Mymain extends Application
{
	public static void main(String[] args)
	{
		System.out.println("main");
		launch(args);
	}

	@Override
	public void init() throws Exception {
		System.out.println("init");
		super.init();
	}



	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("start");
		FXMLLoader loader =new FXMLLoader(getClass().getResource("app_layout.fxml"));
		VBox rootNode =loader.load();

	//	MenuBar menuBar = createMenu();
	//	rootNode.getChildren().add(0,menuBar);
		Scene scene = new Scene(rootNode);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Temperature Converter Tool");
		primaryStage.show();


	}
	private MenuBar createMenu(){//file menu
		Menu fileMenu= new Menu("File");
		MenuItem newMenuItem = new MenuItem("New");
		newMenuItem.setOnAction(event -> System.out.println("new menu item clicked"));

		SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();//Help Menu
		MenuItem quitMenuItem = new MenuItem("quit");
		quitMenuItem.setOnAction(event-> {
			Platform.exit();
			System.exit(0);
		});



		fileMenu.getItems().addAll(newMenuItem,separatorMenuItem,quitMenuItem);
		Menu helpMenu = new Menu("Help");
		MenuItem aboutMenuItem = new MenuItem("About");
		aboutMenuItem.setOnAction(event -> aboutApp());
		helpMenu.getItems().addAll(aboutMenuItem);
		//The above two Menus will togetherly form the menu bar
		//So lets define the Menu bar
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu,helpMenu);
		return menuBar;
	}

	private void aboutApp(){

		Alert alertDialog = new Alert(Alert.AlertType.INFORMATION);
		alertDialog.setTitle("My First Desktop Application");
		alertDialog.setHeaderText("Learning JavaFx ");
		alertDialog.setContentText("I am just a Beginner but soon I will be a pro and will start developing awesome java games");
		ButtonType yesBtn = new ButtonType("Yes");
		ButtonType noBtn = new ButtonType("no");
		alertDialog.getButtonTypes().setAll(yesBtn,noBtn);

		Optional<ButtonType> clickedBtn = alertDialog.showAndWait();
		if (clickedBtn.isPresent() && clickedBtn.get() == yesBtn){
			System.out.println("Yes button is clicked ");
		}
		else{
			System.out.println("No button was clicked ");
		}


	}

}