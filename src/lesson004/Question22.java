package lesson004;

import java.util.Iterator;
import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {

		//Girilen sayının asal olup olmadığını bulalım
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayi girin: ");
		int sayi = scanner.nextInt();
		
		boolean isPrime = true;
		for (int i =2; i< sayi; i++) {
			if (sayi % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Asal");
		} else {
			System.out.println("Asal Degildir");
		}
	}

}
