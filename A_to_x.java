import java.util.Scanner;
public class A_to_x {
	public static void main() {
		int x;
		System.out.print("Enter the Alphabet Number of the last Alphabet You want to Use:");
		x = STDIN_SCANNER.nextInt();
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print((char)Byte.toUnsignedInt((byte)('A' + j - 1)));
			}
			System.out.println();
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}