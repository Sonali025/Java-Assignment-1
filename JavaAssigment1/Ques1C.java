package JavaAssigment1;

import java.util.Scanner;

public class Ques1C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter value of n:");
		n = sc.nextInt();
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
