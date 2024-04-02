package JavaAssigment1;
import java.util.Arrays;
public class Ques2 {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 23, 45, 2, 1, 38, 16, 4 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = sum / arr.length;
		System.out.println("Maximum Element: " + max);
		System.out.println("Average of Elements: " + avg);

	}

}
