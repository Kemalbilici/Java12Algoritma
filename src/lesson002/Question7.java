package lesson002;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		//Girilen sayının tek mi çift mi olduğunu söyleyen program

		Scanner scanner = new Scanner(System.in);
		
		int sayi;
		
		System.out.println("Sayi giriniz: ");
		sayi = scanner.nextInt();
		
		if (sayi % 2 == 0) {
			System.out.println("Çift sayidir " + sayi);
		}else {
			System.out.println("Tek sayidir " + sayi);
		}
			
	}

}
