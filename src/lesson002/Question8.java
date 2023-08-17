package lesson002;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {

		//kenarlari girilen üçgenin nasıl bir üçgen olduğunu söyleyen program
		//kenarlari kullanicidan alicaz.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. kenari giriniz: ");
		int kenar1 = scanner.nextInt();
				
		System.out.println("2. kenari giriniz: ");
		int kenar2 = scanner.nextInt();
		
		System.out.println("3. kenari giriniz: ");
		int kenar3 = scanner.nextInt();
		
		if (kenar1 > 0 && kenar2 > 0 && kenar3 > 0) {	
			if (kenar1 == kenar2 && kenar1 == kenar3) {
				System.out.println("Eşkenar üçgendir.");		
			}else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
				System.out.println("İkiz kenardır.");		
			}else {
				System.out.println("Çeşit kenar.");
			}
		} else {
			System.out.println("Kenarlari pozitif olmalidir.");
		}
	}
}
