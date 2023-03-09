package fifthlesson;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class AddTaskOne {

	public static void main(String[] args) {
		int arrLength = -1;
		int[] arr;
		int tempElement;
		int midElement;
		int swapIndex;

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		while (arrLength <= 0) {
			System.out.println("Введіть бажану довжину масива:");
			arrLength = scan.nextInt();
			if (arrLength <= 0) {
				System.out.println("Довжина массива має бути більше 0.");
			}
		}
		arr = new int[arrLength];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(-100, 100);
		}
		System.out.println("Початковий массив: " + Arrays.toString(arr));

		midElement = (arr.length - 1) / 2;

		for (int i = 0; i <= midElement; i++) {
			swapIndex = arr.length - 1 - i;
			tempElement = arr[i];
			arr[i] = arr[swapIndex];
			arr[swapIndex] = tempElement;
		}
		System.out.println("Реверс початкового масиву: " + Arrays.toString(arr));
	}
}
