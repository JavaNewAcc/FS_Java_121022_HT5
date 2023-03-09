package fifthlesson;

import java.util.Scanner;
import java.util.Arrays;

public class AddTaskTwo {

	public static void main(String[] args) {
		int turnAngle = 1;
		int[][] arr = new int[][] { { 1, 5, 1, 2, 4, 4, 1, 7 }, { 5, 1, 1, 4, 6, 9, 1, 3 }, { 8, 8, 4, 1, 9, 2, 3, 3, },
				{ 2, 6, 8, 7, 6, 0, 6, 9 }, { 2, 1, 5, 4, 0, 5, 6, 3 }, { 7, 1, 4, 9, 6, 3, 8, 9 },
				{ 9, 0, 2, 4, 9, 7, 4, 6 }, { 6, 3, 7, 7, 9, 3, 8, 9 } };
		int tempElem;
		Scanner scan = new Scanner(System.in);

		while (turnAngle != 90 && turnAngle != 180 && turnAngle != 270) {
			System.out.println("Введіть кут, на який треба повернути масив (90, 180 або 270 градусів):");
			turnAngle = scan.nextInt();
			if (turnAngle != 90 && turnAngle != 180 && turnAngle != 270) {
				System.out.println("Оберіть один з наступних варіантів: 90, 180 або 270 градусів");
			}
		}

		System.out.println("Початковий масив:");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(Arrays.toString(arr[i]));
			System.out.println();
		}
		System.out.println();
		switch (turnAngle) {
		case 90 -> {
			for (int i = 0; i < (arr.length / 2); i++) {
				for (int j = i; j < arr[i].length - 1 - i; j++) {
					tempElem = arr[i][j];
					int indexTemp1 = arr.length - 1 - i;
					int indexTemp2 = arr[i].length - 1 - j;

					arr[i][j] = arr[indexTemp2][i];
					arr[indexTemp2][i] = arr[indexTemp1][indexTemp2];
					arr[indexTemp1][indexTemp2] = arr[j][indexTemp1];
					arr[j][indexTemp1] = tempElem;
				}
			}
		}
		case 180 -> {
			for (int i = 0; i < arr.length / 2; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					tempElem = arr[i][j];
					int indexTemp1 = arr.length - 1 - i;
					int indexTemp2 = arr[i].length - 1 - j;

					arr[i][j] = arr[indexTemp1][indexTemp2];
					arr[indexTemp1][indexTemp2] = tempElem;
				}
			}
		}
		case 270 -> {
			for (int i = 0; i < (arr.length / 2); i++) {
				for (int j = i; j < arr[i].length - 1 - i; j++) {
					tempElem = arr[i][j];
					int indexTemp1 = arr.length - 1 - i;
					int indexTemp2 = arr[i].length - 1 - j;

					arr[i][j] = arr[j][indexTemp1];
					arr[j][indexTemp1] = arr[indexTemp1][indexTemp2];
					arr[indexTemp1][indexTemp2] = arr[indexTemp2][i];
					arr[indexTemp2][i] = tempElem;
				}
			}
		}
		}
		System.out.println("Модифікований масив:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(Arrays.toString(arr[i]));
			System.out.println();
		}
	}
}