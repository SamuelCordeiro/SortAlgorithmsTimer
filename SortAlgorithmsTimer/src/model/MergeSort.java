package model;

public class MergeSort<T extends Comparable<? super T>> {

	public static <T extends Comparable<T>> void sort(T[] vector) {
		int start = 0; 
		int end = vector.length -1;
		mergeSort(vector, start, end);
	}

	public static <T extends Comparable<T>> void mergeSort(T[] vector, int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			mergeSort(vector, start, middle); 
			mergeSort(vector, middle + 1, end);
			merge(vector, start, middle, end);
		}
	}

	public static <T extends Comparable<T>> void merge(T[] array, int start, int middle, int end) {
		T[] leftArray  = (T[]) new Comparable[middle - start + 1];
		T[] rightArray = (T[]) new Comparable[end - middle];

		for (int i = 0; i < leftArray.length; ++i) {
			leftArray[i] = array[start + i];
		}

		for (int i = 0; i < rightArray.length; ++i) {
			rightArray[i] = array[middle + 1 + i];
		}

		int leftIndex = 0, rightIndex = 0;
		int currentIndex = start;

		while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
			if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0) {
				array[currentIndex] = leftArray[leftIndex];
				leftIndex++;
			} else {
				array[currentIndex] = rightArray[rightIndex];
				rightIndex++;
			}
			currentIndex++;
		}
		while (leftIndex < leftArray.length) {
			array[currentIndex++] = leftArray[leftIndex++];
		}
		while (rightIndex < rightArray.length) {
			array[currentIndex++] = rightArray[rightIndex++];
		}
	}
}