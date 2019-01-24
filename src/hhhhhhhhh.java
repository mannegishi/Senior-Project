import java.util.Scanner;

public class hhhhhhhhh {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // Reading from System.in
		int starstart = input.nextInt();
		int starend = input.nextInt();
		int starincrement = input.nextInt();

		int lineNumber = (starend / starincrement);
		System.out.println(lineNumber);
		int staramount = starstart;
		
		for(int i = 0; i < starstart; i++) {
			System.out.print("*");
		}
		System.out.println("");

		for (int i = 0; i < lineNumber; i++) {
			for(int j = 0; j < (staramount+starincrement); j++) {
				System.out.print("*");
			}
			staramount = staramount + starincrement;
			System.out.println();

		}

	}
}
