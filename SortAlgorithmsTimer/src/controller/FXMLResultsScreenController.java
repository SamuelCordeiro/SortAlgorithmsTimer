package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.DataTypes;
import model.ResultData;
import resources.SortingTimeCalculator;

public class FXMLResultsScreenController implements Initializable {
	
	@FXML
    private TableView<ResultData> TVResultsScreen;

    @FXML
    private TableColumn<ResultData, String> TCSorters;

    @FXML
    private TableColumn<ResultData, String> TCTime;
    
    private ArrayList<ResultData> resultDataList = new ArrayList<>();
    private ObservableList<ResultData> obsResultData;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		loadTableView();
	}

	private void loadTableView() {
		TCSorters.setCellValueFactory(new PropertyValueFactory<>("sorter"));
		TCTime.setCellValueFactory(new PropertyValueFactory<>("time"));
		SortingTimeCalculator stc = new SortingTimeCalculator();
		stc.calculateTime(FXMLMainScreenController.selectedDataType.getDataType(), FXMLMainScreenController.size );
		ResultData  bubbleTime = new ResultData ("BubbleSort", "" + stc.getBubbleSortTime() +" seconds");
		ResultData  insertionTime = new ResultData ("InsertionSort", "" + stc.getInsertionSortTime() +" seconds");
		ResultData  mergeTime = new ResultData ("MergeSort", "" + stc.getMergeSortTime() +" seconds");
		ResultData  quickTime = new ResultData ("QuickSort", "" + stc.getQuickSortTime() +" seconds");
		ResultData  selectionTime = new ResultData ("SelectionSort", "" + stc.getSelectionSortTime() +" seconds");
		ResultData  shellTime = new ResultData ("ShellSort", "" + stc.getShellSortTime() +" seconds");
		resultDataList.add(bubbleTime);
		resultDataList.add(insertionTime);
		resultDataList.add(mergeTime);
		resultDataList.add(quickTime);
		resultDataList.add(selectionTime);
		resultDataList.add(shellTime);
		obsResultData = FXCollections.observableArrayList(resultDataList);
		TVResultsScreen.setItems(obsResultData);
		
	}

}
