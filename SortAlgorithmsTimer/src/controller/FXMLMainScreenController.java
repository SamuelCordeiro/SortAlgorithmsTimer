package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import model.DataTypes;

public class FXMLMainScreenController implements Initializable{
	@FXML
	private Button runButton;
	@FXML
    private ComboBox<DataTypes> cbDataType;
	private ArrayList<DataTypes> dataTypesList = new ArrayList<>();
	private ObservableList<DataTypes> obsDataTypes;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		loadComboBox();
	}
	
	@FXML
	void runButtonEvent(ActionEvent event) {
		DataTypes selectedDataType = cbDataType.getSelectionModel().getSelectedItem();
		System.out.println("Id: " + selectedDataType.getId() + "Data type: " + selectedDataType.getDataType());
	}
	
	public void loadComboBox() {
		DataTypes character = new DataTypes(1,"Character");
		DataTypes doubleData = new DataTypes(2, "Double");
		DataTypes integerData = new DataTypes(3, "Integer");
		DataTypes stringData = new DataTypes(4, "String");
		dataTypesList.add(character);
		dataTypesList.add(doubleData);
		dataTypesList.add(integerData);
		dataTypesList.add(stringData);
		obsDataTypes =FXCollections.observableArrayList(dataTypesList);
		cbDataType.setItems(obsDataTypes);
		
	}
	
}
