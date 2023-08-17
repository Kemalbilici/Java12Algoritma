package lesson002;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		// Girilen 3 sayidan en büyük olani yazdiralim

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("1. sayiyi giriniz");
		int sayi1 =scanner.nextInt();
		
		System.out.println("2. sayiyi giriniz");
		int sayi2 =scanner.nextInt();
		
		System.out.println("3. sayiyi giriniz");
		int sayi3 =scanner.nextInt();
		
		int enBuyuk = sayi1;
		
		if (sayi2 > enBuyuk) {
			enBuyuk= sayi2;
		}else if (sayi3 > enBuyuk) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük sayi: " + enBuyuk);
	}

}
