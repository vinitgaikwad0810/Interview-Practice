package sorting;

class BubbleSort implements Sorting<Integer> {

	@Override
	public void sort(Integer[] t) {
		int i, j, temp;

		for (i = 0; i < t.length; i++) {

			for (j = 0; j < t.length - i - 1; j++) {

				if (t[j] > t[j + 1]) {
					temp = t[j];
					t[j] = t[j + 1];
					t[j + 1] = temp;

				}
			}
			Utils.print(t);
			System.out.println("---");
		}
		

	}

}