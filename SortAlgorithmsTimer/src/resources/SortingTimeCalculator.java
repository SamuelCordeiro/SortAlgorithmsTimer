package resources;

import model.BubbleSort;
import model.CycleSort;
import model.HeapSort;
import model.InsertionSort;
import model.MergeSort;
import model.QuickSort;
import model.SelectionSort;
import model.ShellSort;

public class SortingTimeCalculator {
	private long startTime;
	private long finalTime;
	private long bubbleSortTime;
	private long cycleSortTime;
	private long heapSortTime;
	private long insertionSortTime;
	private long mergeSortTime;
	private long quickSortTime;
	private long selectionSortTime;
	private long shellSortTime;

	public void calculateTime(String dataType, int size) {
		switch (dataType) {
		case "Character": {
			Character[] baseVector = VectorFactory.characterVectorFactory(size);
			
			Character[] vector = baseVector;
			startTime = System.nanoTime();
			BubbleSort.sort(vector);
			finalTime = System.nanoTime();
			bubbleSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			CycleSort.sort(vector);
			finalTime = System.currentTimeMillis();
			cycleSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			HeapSort.sort(vector);
			finalTime = System.currentTimeMillis();
			heapSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			InsertionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			insertionSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			MergeSort.sort(vector);
			finalTime = System.currentTimeMillis();
			mergeSortTime = finalTime - startTime;

			vector = baseVector;
			startTime = System.currentTimeMillis();
			QuickSort.sort(vector);
			finalTime = System.currentTimeMillis();
			quickSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			SelectionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			selectionSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			ShellSort.sort(vector);
			finalTime = System.currentTimeMillis();
			shellSortTime = finalTime - startTime;
			break;
		}
		case "Double":{
			Double[] baseVector = VectorFactory.doubleVectorFactory(size);
			
			Double[] vector = baseVector;
			startTime = System.nanoTime();
			BubbleSort.sort(vector);
			finalTime = System.nanoTime();
			bubbleSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			CycleSort.sort(vector);
			finalTime = System.currentTimeMillis();
			cycleSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			HeapSort.sort(vector);
			finalTime = System.currentTimeMillis();
			heapSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			InsertionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			insertionSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			MergeSort.sort(vector);
			finalTime = System.currentTimeMillis();
			mergeSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			QuickSort.sort(vector);
			finalTime = System.currentTimeMillis();
			quickSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			SelectionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			selectionSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			ShellSort.sort(vector);
			finalTime = System.currentTimeMillis();
			shellSortTime = finalTime - startTime;
			break;
		}
		case "Integer":{
			Integer[] baseVector = VectorFactory.integerVectorFactory(size);
			
			Integer[] vector = baseVector;
			startTime = System.nanoTime();
			BubbleSort.sort(vector);
			finalTime = System.nanoTime();
			bubbleSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			CycleSort.sort(vector);
			finalTime = System.currentTimeMillis();
			cycleSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			HeapSort.sort(vector);
			finalTime = System.currentTimeMillis();
			heapSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			InsertionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			insertionSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			MergeSort.sort(vector);
			finalTime = System.currentTimeMillis();
			mergeSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			QuickSort.sort(vector);
			finalTime = System.currentTimeMillis();
			quickSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			SelectionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			selectionSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			ShellSort.sort(vector);
			finalTime = System.currentTimeMillis();
			shellSortTime = finalTime - startTime;
			break;
		}
		case "String":{
			String[] baseVector = VectorFactory.stringVectorFactory(size);
			
			String[] vector = baseVector;
			startTime = System.nanoTime();
			BubbleSort.sort(vector);
			finalTime = System.nanoTime();
			bubbleSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			CycleSort.sort(vector);
			finalTime = System.currentTimeMillis();
			cycleSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			HeapSort.sort(vector);
			finalTime = System.currentTimeMillis();
			heapSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			InsertionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			insertionSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			MergeSort.sort(vector);
			finalTime = System.currentTimeMillis();
			mergeSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			QuickSort.sort(vector);
			finalTime = System.currentTimeMillis();
			quickSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			SelectionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			selectionSortTime = finalTime - startTime;
			
			vector = baseVector;
			startTime = System.currentTimeMillis();
			ShellSort.sort(vector);
			finalTime = System.currentTimeMillis();
			shellSortTime = finalTime - startTime;
			break;
		}
		}
	}

	public long getBubbleSortTime() {
		return bubbleSortTime;
	}
	public long getCycleSortTime() {
		return cycleSortTime;
	}
	public long getHeapSortTime() {
		return heapSortTime;
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
