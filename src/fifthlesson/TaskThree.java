package fifthlesson;

import java.util.Arrays;
import java.util.Random;

public class TaskThree {

	public static void main(String[] args) {
		int[] arrInit = new int[15];
		int[] arrFinal;

		Random rand = new Random();

		for (int i = 0; i < arrInit.length; i++) {
			arrInit[i] = rand.nextInt(-100, 100);
		}

		arrFinal = Arrays.copyOf(arrInit, arrInit.length * 2);

		for (int i = arrInit.length; i < arrFinal.length; i++) {
			arrFinal[i] = arrInit[i - arrInit.length] * 2;
		}

		System.out.println("Початковий масив:");
		System.out.println(Arrays.toString(arrInit));
		System.out.println("Модифікований масив:");
		System.out.println(Arrays.toString(arrFinal));
	}
}
