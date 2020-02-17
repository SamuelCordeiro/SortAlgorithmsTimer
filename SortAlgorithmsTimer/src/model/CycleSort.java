package model;

public class CycleSort<T extends Comparable<? super T>> {
	public static <T extends Comparable<T>> void sort(T[] array) {
		
		for (int currentIndex = 0; currentIndex < array.length - 1; currentIndex++) {
			
			T item = array[currentIndex];
			int currentIndexCopy = currentIndex;

			for (int i = currentIndex + 1; i < array.length; i++)
				if (array[i].compareTo(item) < 0)
					currentIndexCopy++;

			if (currentIndexCopy == currentIndex)
				continue;


			while (item == array[currentIndexCopy])
				currentIndexCopy++;


			T temp = array[currentIndexCopy];
			array[currentIndexCopy] = item;
			item = temp;


			while (currentIndexCopy != currentIndex) {
				
				currentIndexCopy = currentIndex;

				for (int i = currentIndex + 1; i < array.length; i++)
					if (array[i].compareTo(item) < 0)
						currentIndexCopy++;

				while (item == array[currentIndexCopy])
					currentIndexCopy++;

				temp = array[currentIndexCopy];
				array[currentIndexCopy] = item;
				item = temp;
			}
		}
	}
}
