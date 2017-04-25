package draw.triangle;

import java.util.Scanner;

public class Triangle {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc = new Scanner(System.in);
		int size = sc.nextInt();
		String res = "";
		
		// start
		for (int i = 1; i < size; i++) {
			for (int j = 1; j < size - i; j ++) {
				res += "♧";
			}
			for (int  j = size - i + 1; j < size + i; j++) {
				res += "♣";
			}
			for (int j = 1; j < size - i; j ++) {
				res += "♧";
			}
			res +="\n";
		}
		
		res +="\n";
		System.out.println(res);
	}
}
