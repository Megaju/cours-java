package suite.de.chiffre;

import java.util.Scanner;

public class Suite {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// instruction
		System.out.println("Entre un chiffre pour lançer la suite de Conway :");
		
		sc = new Scanner(System.in);
		String initLine = "1";
		int repetition = sc.nextInt();
		
		// start
		for (int i=0; i<repetition; i++) {
			initLine = resultLine(initLine);
			System.out.println(initLine);
		}
	} // end main
	
	public static String resultLine(String line) { 
		// init variables
		String result = "";
		
		// start
		for (int i=0; i<line.length(); i++) {
			char currentChar = line.charAt(i);
			int countOcc = 1;
			
			while ((i+1)<line.length() && line.charAt(i+1) == currentChar) {
				countOcc++;
				i++;
			}
			
			// résultat
			result += String.valueOf(countOcc) + String.valueOf(currentChar);
			
		} // end for
		return result;
	}
	
}
