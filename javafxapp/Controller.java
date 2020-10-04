package com.internshala.connectfour.javafxapp;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
	@FXML
	public Pane myPane;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Circle circle = new Circle();
		circle.setRadius(20);
		circle.setFill(Color.RED);

		myPane.getChildren().add(circle);



	}}