package lesson003;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		// Girilen sayıya kadar tek olan sayıların toplamını yazdıralım
		
		//i değişkeni kullanma!!
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayi girin:");	
		int sayi = scanner.nextInt();
		
		int toplam =0;
		
		while(sayi != 0) {
			if(sayi % 2 != 0) {
				toplam = toplam + sayi;
			}
			sayi --;
		}
		System.out.println(toplam);
	}

}