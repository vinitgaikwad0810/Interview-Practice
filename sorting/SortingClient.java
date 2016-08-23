package sorting;

public class SortingClient {

	public static void main(String[] args) {
		Sorting sorting = new SelectionSort();
		Integer[] a = { 9, 33, 42, 6, 7, 8, 9 };
		// bubbleSort.sort(a);
		sorting.sort(a);
	}

}
