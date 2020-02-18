package model;

public class InsertionSort {
	public static <T extends Comparable<T>> void sort(T vector[]){
		for (int i = 1; i < vector.length; i++) {
			int currentIndex = i;

			while (currentIndex > 0 && vector[currentIndex - 1].compareTo(vector[currentIndex]) > 0) {
				T temp = vector[currentIndex];
				vector[currentIndex] = vector[currentIndex - 1];
				vector[currentIndex - 1] = temp;
				currentIndex--;
			}
		}
	}
}
