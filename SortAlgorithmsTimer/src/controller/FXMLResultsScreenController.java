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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.ResultData;
import resources.SortingTimeCalculator;


public class FXMLResultsScreenController implements Initializable {
	@FXML
    private TableView<ResultData> TVResultsScreen;

    @FXML
    private TableColumn<ResultData, String> TCSorters;

    @FXML
    private TableColumn<ResultData, String> TCTime;
    
    @FXML
    private Button showResultsButton;

    static SortingTimeCalculator stc = new SortingTimeCalculator();
    private ArrayList<ResultData> resultDataList = new ArrayList<>();
    private ObservableList<ResultData> obsResultData;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	
	@FXML
	void showResultsButtonEvent(ActionEvent event) {
		loadTableView();
	}

	private void loadTableView() {
		
		TCSorters.setCellValueFactory(new PropertyValueFactory<>("sorter"));
		TCTime.setCellValueFactory(new PropertyValueFactory<>("time"));
		ResultData  bubbleTime = new ResultData ("BubbleSort", String.valueOf(stc.getBubbleSortTime()) + " milliseconds");
		ResultData  cycleTime = new ResultData ("CycleSort", String.valueOf(stc.getCycleSortTime()) + " milliseconds");
		ResultData  heapTime = new ResultData ("HeapSort", String.valueOf(stc.getHeapSortTime()) + " milliseconds");
		ResultData  insertionTime = new ResultData ("InsertionSort", String.valueOf(stc.getInsertionSortTime()) +" milliseconds");
		ResultData  mergeTime = new ResultData ("MergeSort", String.valueOf(stc.getMergeSortTime()) +" milliseconds");
		ResultData  quickTime = new ResultData ("QuickSort", String.valueOf(stc.getQuickSortTime()) +" milliseconds");
		ResultData  selectionTime = new ResultData ("SelectionSort", String.valueOf(stc.getSelectionSortTime()) +" milliseconds");
		ResultData  shellTime = new ResultData ("ShellSort", String.valueOf(stc.getShellSortTime()) +" milliseconds");
		resultDataList.add(bubbleTime);
		resultDataList.add(cycleTime);
		resultDataList.add(heapTime);
		resultDataList.add(insertionTime);
		resultDataList.add(mergeTime);
		resultDataList.add(quickTime);
		resultDataList.add(selectionTime); 
		resultDataList.add(shellTime);
		obsResultData = FXCollections.observableArrayList(resultDataList);
		TVResultsScreen.setItems(obsResultData);
		
	}
}
