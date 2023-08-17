package lesson003;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// 
		//
		//
		//
		
		int telefonKod = 123;
		int mailKod = 456;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Telefonunuza gelen kodu girin: ");
		int kullaniciTelefon = scanner.nextInt();
		
		System.out.println("Mail gelen kodu girin: ");
		int kullaniciMail = scanner.nextInt();
		
		if (telefonKod != kullaniciTelefon) {
			System.out.println("Telefon kodu yanlış.");
		}else if (mailKod != kullaniciMail) {
			System.out.println("Mail kodu yanlış.");
		}else {
			System.out.println("Kayit oldunuz.");
		}
	}

}
