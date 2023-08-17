package lesson002;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		//Verilen iki sayıdan hangisinin büyük oldugunu bulan program
		
		Scanner scanner = new Scanner(System.in);
		
		int sayi1, sayi2 ;
		
		System.out.println("Ilk sayiyi girin: ");
		sayi1 = scanner.nextInt();
		
		System.out.println("Ikinci sayiyi girin: ");
		sayi2 = scanner.nextInt();
		
		if (sayi1> sayi2) {
			System.out.println("Büyük Sayi = " + sayi1);
		}
		else if (sayi1 == sayi2) {
			System.out.println("Sayilar eşittir " );
		}
		else {
			System.out.println("Büyük Sayi = " + sayi2);
		
		}
	
	}

}
