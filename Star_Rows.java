import java.util.Scanner;

public class Star_Rows {
	public static void main() {
		int rows;
		System.out.print("Enter Number of Rows You Want:");
		rows = STDIN_SCANNER.nextInt();
		for(int i = 1; i <= rows; ++i) {
			for(int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}