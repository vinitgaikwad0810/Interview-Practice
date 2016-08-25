package sorting;

public class QuickSort implements Sorting<Integer> {

	@Override
	public void sort(Integer[] array) {

		quickSort(array, 0, array.length - 1);
	}

	public void quickSort(Integer[] array, Integer p, Integer r) {
		if (p < r) {
			Integer pivot = partition(array, p, r);
			Utils.print(array);
			quickSort(array, p, pivot - 1);
			quickSort(array, pivot + 1, r);
		}
	}

	public Integer partition(Integer[] array, Integer low, Integer high) {
		int i, j, pivot, temp;

		pivot = low;
		i = low;
		j = high;

		while (true) {
			while (i < array.length && array[i] <= array[pivot])
				i++;
			while (j > 0 && array[j] > array[pivot])
				j--;

			if (i < j) {
				Utils.swap(array, i, j);

			} else {
				Utils.swap(array, pivot, j);
				break;

			}

		}
		return j;
	}

}
