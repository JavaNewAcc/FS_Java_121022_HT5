package fifthlesson;

import java.util.Scanner;
import java.util.Arrays;

public class TaskTwo {

	public static void main(String[] args) {
		int arrLength = -1;
		int[] arr;
		Scanner scan = new Scanner(System.in);

		while (arrLength <= 0) {
			System.out.println("Введіть довжину масиву: ");
			arrLength = scan.nextInt();
			if (arrLength <= 0) {
				System.out.println("Довжина масиву має бути більше 0");
			}
		}

		arr = new int[arrLength];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Введіть " + (i + 1) + "-й елемент масиву:");
			arr[i] = scan.nextInt();
		}
		System.out.println("Довжина свореного масиву: " + arr.length + "; елементи масиву: " + Arrays.toString(arr));
	}
}
