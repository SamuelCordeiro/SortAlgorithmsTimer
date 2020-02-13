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
			Character[] vector = VectorFactory.characterVectorFactory(size);
			startTime = System.nanoTime();
			BubbleSort.sort(vector);
			finalTime = System.nanoTime();
			bubbleSortTime = finalTime - startTime;
			
			vector = VectorFactory.characterVectorFactory(size);
			startTime = System.currentTimeMillis();
			InsertionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			insertionSortTime = finalTime - startTime;
			
			vector = VectorFactory.characterVectorFactory(size);
			/*startTime = System.currentTimeMillis();
			MergeSort.sort(characterVector);
			finalTime = System.currentTimeMillis();
			mergeSortTime = ((startTime - finalTime)/ 1000);*/

			vector = VectorFactory.characterVectorFactory(size);
			startTime = System.currentTimeMillis();
			QuickSort.sort(vector);
			finalTime = System.currentTimeMillis();
			quickSortTime = finalTime - startTime;
			
			vector = VectorFactory.characterVectorFactory(size);
			startTime = System.currentTimeMillis();
			SelectionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			selectionSortTime = finalTime - startTime;
			
			vector = VectorFactory.characterVectorFactory(size);
			startTime = System.currentTimeMillis();
			ShellSort.sort(vector);
			finalTime = System.currentTimeMillis();
			shellSortTime = finalTime - startTime;
			break;
		}
		case "Double":{
			Double[] vector = VectorFactory.doubleVectorFactory(size);
			startTime = System.nanoTime();
			BubbleSort.sort(vector);
			finalTime = System.nanoTime();
			bubbleSortTime = finalTime - startTime;
			
			vector = VectorFactory.doubleVectorFactory(size);
			startTime = System.currentTimeMillis();
			InsertionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			insertionSortTime = finalTime - startTime;
			
			vector = VectorFactory.doubleVectorFactory(size);
			/*startTime = System.currentTimeMillis();
			MergeSort.sort(vector);
			finalTime = System.currentTimeMillis();*/
			
			vector = VectorFactory.doubleVectorFactory(size);
			startTime = System.currentTimeMillis();
			QuickSort.sort(vector);
			finalTime = System.currentTimeMillis();
			quickSortTime = finalTime - startTime;
			
			vector = VectorFactory.doubleVectorFactory(size);
			startTime = System.currentTimeMillis();
			SelectionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			selectionSortTime = finalTime - startTime;
			
			vector = VectorFactory.doubleVectorFactory(size);
			startTime = System.currentTimeMillis();
			ShellSort.sort(vector);
			finalTime = System.currentTimeMillis();
			shellSortTime = finalTime - startTime;
			break;
		}
		case "Integer":{
			Integer[] vector = VectorFactory.integerVectorFactory(size);
			startTime = System.nanoTime();
			BubbleSort.sort(vector);
			finalTime = System.nanoTime();
			bubbleSortTime = finalTime - startTime;
			
			vector = VectorFactory.integerVectorFactory(size);
			startTime = System.currentTimeMillis();
			InsertionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			insertionSortTime = finalTime - startTime;
			
			vector = VectorFactory.integerVectorFactory(size);
			/*startTime = System.currentTimeMillis();
			MergeSort.sort(vector);
			finalTime = System.currentTimeMillis();*/
			
			vector = VectorFactory.integerVectorFactory(size);
			startTime = System.currentTimeMillis();
			QuickSort.sort(vector);
			finalTime = System.currentTimeMillis();
			quickSortTime = finalTime - startTime;
			
			vector = VectorFactory.integerVectorFactory(size);
			startTime = System.currentTimeMillis();
			SelectionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			selectionSortTime = finalTime - startTime;
			
			vector = VectorFactory.integerVectorFactory(size);
			startTime = System.currentTimeMillis();
			ShellSort.sort(vector);
			finalTime = System.currentTimeMillis();
			shellSortTime = finalTime - startTime;
			break;
		}
		case "String":{
			String[] vector = VectorFactory.stringVectorFactory(size);
			startTime = System.nanoTime();
			BubbleSort.sort(vector);
			finalTime = System.nanoTime();
			bubbleSortTime = finalTime - startTime;
			
			vector = VectorFactory.stringVectorFactory(size);
			startTime = System.currentTimeMillis();
			InsertionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			insertionSortTime = finalTime - startTime;
			
			vector = VectorFactory.stringVectorFactory(size);
			/*startTime = System.currentTimeMillis();
			MergeSort.sort(vector);
			finalTime = System.currentTimeMillis();*/
			
			vector = VectorFactory.stringVectorFactory(size);
			startTime = System.currentTimeMillis();
			QuickSort.sort(vector);
			finalTime = System.currentTimeMillis();
			quickSortTime = finalTime - startTime;
			
			vector = VectorFactory.stringVectorFactory(size);
			startTime = System.currentTimeMillis();
			SelectionSort.sort(vector);
			finalTime = System.currentTimeMillis();
			selectionSortTime = finalTime - startTime;
			
			vector = VectorFactory.stringVectorFactory(size);
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
