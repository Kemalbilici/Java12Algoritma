package lesson003;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// Girilen sayının basamaklarının toplamını bulalım
		//127 --> 1+2+7 = output --> 10
		//while
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayi girin: ");
		int sayi = scanner.nextInt();
		
		//int sayac =0;
		int toplam =0;
		
		while(sayi != 0){
			toplam = (sayi % 10) + toplam;
			sayi /= 10;
			//sayac ++;
		}
		System.out.println(toplam);
	}
}