package model;

public class BubbleSort {
	public static <T extends Comparable<T>> void sort(T[] vector) {
		T temp;
		for (int i = vector.length -1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(vector[j].compareTo(vector[j+1]) > 0) {
					temp = vector[j];
					vector[j] = vector[j+1];
					vector[j+1] = temp;
				}
			}
		}
	}
}
