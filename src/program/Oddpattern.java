package program;

import java.util.Scanner;

class Oddpattern {

	private static Scanner scr;

	public static void main(String arg[]) {

		scr = new Scanner(System.in);
		String name = scr.nextLine();
		int length = name.length();
		int space = length - 1;
		int odd = 1;
		for (int i = 0; i < length; i++) {

			for (int j = 1; j < space; j++) {
				System.out.print(" ");
			}
			space = space - 2;
			for (int k = 0; k <= i; k++) {
				System.out.print(" " + name.charAt(k));
			}
			System.out.println("");
			i++;

		}

		for (int a = 4; a <= 7; a++) {
			for (int b = 0; b < odd; b++) {
				System.out.print(" ");
			}
			odd = odd + 2;
			length = length - 2;
			for (int c = 0; c < length; c++) {
				System.out.print(" " + name.charAt(c));
			}
			System.out.println("");
		}
	}

}
