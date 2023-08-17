package lesson003;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
	
		//Girilen sayi hangi basamakta ve hangi sayi
		//372
		//birler bas --> 2
		//10lar bas --> 7
		//100ler bas --> 3
		
		//while
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi girin: ");
		int sayi = scanner.nextInt();
		
		int basamakSayisi = 1;
		int basamak;
		
		while (sayi != 0) {
			basamak = sayi % 10;
			sayi = sayi/10;
			System.out.println(basamakSayisi + "ler basamagi" + basamak);
			basamakSayisi = basamakSayisi * 10;
			
		}

	}

}
