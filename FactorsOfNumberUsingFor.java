import java.util.*;
public class FactorsOfNumberUsingFor {
	private static Scanner sc;
	
	public static void main() {
		int Number, i;
		sc = new Scanner(System.in);
		
		System.out.println("Please Enter any number to Find Factors: ");
		Number = sc.nextInt();
		
		for(i = 1; i <= Number; i++) {
			if(Number%i == 0) {
				System.out.format(" %d  ", i);
			}
		}
	}
}