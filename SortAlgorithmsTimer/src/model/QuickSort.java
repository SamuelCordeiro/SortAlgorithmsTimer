package model;

public class QuickSort<T> {
	public static <T extends Comparable<T>> void sort(T vector[]) {
		quickSort(vector, 0, vector.length -1);
	}
	
	private static<T extends Comparable<T>> void quickSort(T vector[], int startIndex, int endIndex){
        if (startIndex < endIndex)
        {
            int pivotIndex = partition(vector, startIndex, endIndex);
            quickSort(vector, startIndex, pivotIndex);
            quickSort(vector, pivotIndex + 1, endIndex);
        }
    }

    private static <T extends Comparable<T>> int partition(T vector[], int startIndex, int endIndex){
        int pivotIndex = (startIndex + endIndex) / 2;
        T pivotValue = vector[pivotIndex];
        startIndex--;
        endIndex++;
        
        while (true){
            do {
            	startIndex++; 
            }while (vector[startIndex].compareTo(pivotValue) < 0) ;
            do { 
            	endIndex--; 
            }while (vector[endIndex].compareTo(pivotValue) > 0) ;
            
            if (startIndex >= endIndex) { 
            	return endIndex;
            }
            T temp = vector[startIndex];
            vector[startIndex] = vector[endIndex];
            vector[endIndex] = temp;
        }
    }
}
