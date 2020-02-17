package model;

public class HeapSort<T extends Comparable<? super T>> {
	
	public static <T extends Comparable<T>>  void sort(T[] array) {
		
        int size = array.length;
        
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(array, size, i);

        for (int i = size - 1; i >= 0; i--) {
        	
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

	private static <T extends Comparable<T>> void heapify(T[] array, int size, int i) {
    
        int max   = i;
        int left  = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && array[left].compareTo(array[max]) > 0)
            max = left;

        if (right < size && array[right].compareTo(array[max]) > 0)
            max = right;

        if (max != i) {
        	
            T temp = array[i];
            array[i] = array[max];
            array[max] = temp;
            heapify(array, size, max);
        }
    }
}
