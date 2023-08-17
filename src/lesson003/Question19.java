package lesson003;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// Girilen sayının 5in kuvveti olup olmadıgını bulalım
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayi girin:");
		
		int sayi = scanner.nextInt();
		
		boolean kontrol = true;
		
		while(kontrol) {
			if(sayi % 5 == 0) {
				sayi = sayi / 5;
				if(sayi == 1) {
					System.out.println("5 in kuvvetidir. ");
					kontrol = false;
				}
			}else {
				System.out.println("5 n kuvveti değildir");
				kontrol = false;
			}
		}
		//125
		//sayi --> 25
		//sayi --> 5
		//sayi --> 1
		
		/*
		String besinKatimi = "5 in Kuvveti değildir";
		
		while(sayi != 1) {
			if(sayi % 5 != 0 ) {
				besinKatimi = "5 in Kuvveti değildir";
				sayi = 1;
			}else {
				besinKatimi = "Beşin katıdır";
				sayi /= 5;
			}
		}
		System.out.println(besinKatimi);
		*/
			
	}
}