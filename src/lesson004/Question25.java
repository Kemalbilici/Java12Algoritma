package lesson004;

import java.util.Iterator;
import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		
		// Girilen sayinin mükemmel sayi olup olmadığını bulalım

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayi giriniz");
		int sayi = scanner.nextInt();
		int toplam = 0;
		
		for (int bolen = 1; bolen < sayi; bolen++) {
			if (sayi% bolen ==0) {
				toplam+= bolen;
			}
		}
		if (toplam ==sayi) {
			System.out.println(sayi + "Mükemmel sayidir");
		} else {
			System.out.println(sayi + "Mükemmel sayi değildir");
		}
	}

}
