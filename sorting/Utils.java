package sorting;

public class Utils {

	static void print(Integer[] toBePrinted) {
		for (int i = 0; i < toBePrinted.length; i++) {
			System.out.print(toBePrinted[i]);
			System.out.print(" ");
		}
		System.out.println("---");
	}

	static void swap(Integer[] array, Integer p, Integer q) {

		Integer temp;
		temp = array[q];
		array[q] = array[p];
		array[p] = temp;
	}
}
