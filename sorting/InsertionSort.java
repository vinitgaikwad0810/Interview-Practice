package sorting;

public class InsertionSort implements Sorting<Integer> {

	@Override
	public void sort(Integer[] array) {
		int i, j, temp;

		for (i = 1; i < array.length; i++) {

			temp = array[i];
			j = i - 1;
			while (j >= 0 && temp < array[j]) {

				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
			Utils.print(array);
			System.out.println("---");
		}

	}

}
