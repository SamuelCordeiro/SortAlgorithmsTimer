package model;

public class SelectionSort {
	public static < T extends Comparable<T>> void sort(T vector[]) {
		int minIndex;
		T temp;
		for (int i = 0; i < vector.length; i++) {
			minIndex = i;
			for (int j = i+1; j < vector.length; j++) {
				if(vector[j].compareTo(vector[minIndex]) < 0) {
					minIndex = j;
				}
			}
			temp = vector[i];
			vector[i] = vector[minIndex];
			vector[minIndex] = temp;
		}
	}
}
