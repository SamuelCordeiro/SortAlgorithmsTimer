package resources;

import model.BubbleSort;
import model.InsertionSort;
import model.MergeSort;
import model.QuickSort;
import model.SelectionSort;
import model.ShellSort;

public class SortingTimeCalculator {
	private long startTime;
	private long finalTime;
	private long bubbleSortTime;
	private long insertionSortTime;
	private long mergeSortTime;
	private long quickSortTime;
	private long selectionSortTime;
	private long shellSortTime;
	

	public void calculateTime(String dataType, int size) {
		switch (dataType) {
		case "Character": {
			startTime = System.currentTimeMillis();
			BubbleSort.sort(VectorFactory.characterVectorFactory(size));
			finalTime = System.currentTimeMillis();
			bubbleSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			InsertionSort.sort(VectorFactory.characterVectorFactory(size));
			finalTime = System.currentTimeMillis();
			insertionSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			MergeSort.sort(VectorFactory.characterVectorFactory(size));
			finalTime = System.currentTimeMillis();
			mergeSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			QuickSort.sort(VectorFactory.characterVectorFactory(size));
			finalTime = System.currentTimeMillis();
			quickSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			SelectionSort.sort(VectorFactory.characterVectorFactory(size));
			finalTime = System.currentTimeMillis();
			selectionSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			ShellSort.sort(VectorFactory.characterVectorFactory(size));
			finalTime = System.currentTimeMillis();
			shellSortTime = startTime - finalTime/ 1000;
		}
		case "Double":{
			startTime = System.currentTimeMillis();
			BubbleSort.sort(VectorFactory.doubleVectorFactory(size));
			finalTime = System.currentTimeMillis();
			bubbleSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			InsertionSort.sort(VectorFactory.doubleVectorFactory(size));
			finalTime = System.currentTimeMillis();
			insertionSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			MergeSort.sort(VectorFactory.doubleVectorFactory(size));
			finalTime = System.currentTimeMillis();
			mergeSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			QuickSort.sort(VectorFactory.doubleVectorFactory(size));
			finalTime = System.currentTimeMillis();
			quickSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			SelectionSort.sort(VectorFactory.doubleVectorFactory(size));
			finalTime = System.currentTimeMillis();
			selectionSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			ShellSort.sort(VectorFactory.doubleVectorFactory(size));
			finalTime = System.currentTimeMillis();
			shellSortTime = startTime - finalTime/ 1000;
		}
		case "Integer":{
			startTime = System.currentTimeMillis();
			BubbleSort.sort(VectorFactory.integerVectorFactory(size));
			finalTime = System.currentTimeMillis();
			bubbleSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			InsertionSort.sort(VectorFactory.integerVectorFactory(size));
			finalTime = System.currentTimeMillis();
			insertionSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			MergeSort.sort(VectorFactory.integerVectorFactory(size));
			finalTime = System.currentTimeMillis();
			mergeSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			QuickSort.sort(VectorFactory.integerVectorFactory(size));
			finalTime = System.currentTimeMillis();
			quickSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			SelectionSort.sort(VectorFactory.integerVectorFactory(size));
			finalTime = System.currentTimeMillis();
			selectionSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			ShellSort.sort(VectorFactory.integerVectorFactory(size));
			finalTime = System.currentTimeMillis();
			shellSortTime = startTime - finalTime/ 1000;
		}
		case "String":{
			startTime = System.currentTimeMillis();
			BubbleSort.sort(VectorFactory.stringVectorFactory(size));
			finalTime = System.currentTimeMillis();
			bubbleSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			InsertionSort.sort(VectorFactory.stringVectorFactory(size));
			finalTime = System.currentTimeMillis();
			insertionSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			MergeSort.sort(VectorFactory.stringVectorFactory(size));
			finalTime = System.currentTimeMillis();
			mergeSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			QuickSort.sort(VectorFactory.stringVectorFactory(size));
			finalTime = System.currentTimeMillis();
			quickSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			SelectionSort.sort(VectorFactory.stringVectorFactory(size));
			finalTime = System.currentTimeMillis();
			selectionSortTime = startTime - finalTime/ 1000;

			startTime = System.currentTimeMillis();
			ShellSort.sort(VectorFactory.stringVectorFactory(size));
			finalTime = System.currentTimeMillis();
			shellSortTime = startTime - finalTime/ 1000;
		}
		}
	}
	
	public long getBubbleSortTime() {
		return bubbleSortTime;
	}
	public long getInsertionSortTime() {
		return insertionSortTime;
	}
	public long getMergeSortTime() {
		return mergeSortTime;
	}
	public long getQuickSortTime() {
		return quickSortTime;
	}
	public long getSelectionSortTime() {
		return selectionSortTime;
	}
	public long getShellSortTime() {
		return shellSortTime;
	}
}
