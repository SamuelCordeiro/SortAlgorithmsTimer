package model;

public class ShellSort {
	public static <T extends Comparable<T>> void sort(T[] vector) {
		
		for (int gapSize = vector.length / 2; gapSize > 0; gapSize /= 2)
        {
            for (int currentIndex = gapSize; currentIndex < vector.length; currentIndex++)
            {
                int currentIndexCopy = currentIndex;
                T temp = vector[currentIndex];
                while (currentIndexCopy >= gapSize && vector[currentIndexCopy - gapSize].compareTo(temp) > 0)
                {
                    vector[currentIndexCopy] = vector[currentIndexCopy - gapSize];
                    currentIndexCopy -= gapSize;
                }
                vector[currentIndexCopy] = temp;
            }
        }
    }
}
