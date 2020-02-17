package model;

public class InsertionSort {
	public static <T extends Comparable<T>> void sort(T vector[]){
		T temp;
		int j;
		for (int i = 1; i < vector.length; i++) {
			temp = vector[i];
			j = i-1;
			while((j >= 0) && (vector[j].compareTo(temp) > 0)) {
				vector[j + 1] = vector[j];
				j--;
			}
			vector[j+1] = temp;
		}
		
	}
}
