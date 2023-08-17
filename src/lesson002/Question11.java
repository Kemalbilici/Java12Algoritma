package lesson002;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// Dairenin çevresini ve alanini hesaplayalim

		Scanner scanner = new Scanner(System.in);
		
		final double pi = 3.14;
		
		double alan;
		double cevre;
		
		System.out.println("Yari capi giriniz:");
		int r = scanner.nextInt();
		
		if (r <= 0) {
			System.out.println("Lütfen pozitif bir sayi giriniz: ");
		}
		alan =pi * r * r;
		cevre = 2 * pi * r;
		
		System.out.println("Alan: " + alan + "\n" + "Cevre: " + cevre);

	}

}
