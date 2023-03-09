package fifthlesson;

import java.util.Random;
import java.util.Arrays;

public class ClassworkOne {

	public static void main(String[] args) {
		int salary[] = new int[12];
		int annualSalary = 0;

		Random rand = new Random();

		for (int i = 0; i < salary.length; i++) {
			salary[i] = rand.nextInt(30000, 40000);
			annualSalary += salary[i];
		}
		int averageSalary = annualSalary / 12;

		System.out.println("Average salary of this worker is: " + averageSalary + " per month");
		System.out.println("Salary for each month is: " + Arrays.toString(salary));
	}

}
