package JavaAssigment1;

public class Ques1B {

	public static void main(String[] args) {
		for (int r = 1; r <= 3; r++) {
			for (int c = 1; c <= 5; c++) {
				if (r == 1 || r == 3 || c == 1 || c == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
