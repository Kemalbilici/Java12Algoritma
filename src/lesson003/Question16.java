package lesson003;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// kullanıcıdan 1-7 arası sayı alalım
		// günün hafta içi mi dışı mı oldugunu söylesin
		// 1-5 hafta içi 6-7 hafta sonu
		// Switch case

		Scanner scanner = new Scanner(System.in);

		System.out.println("Gün girin: ");
		int gun = scanner.nextInt();

		switch (gun) {
		case 1,2,3,4,5:
			System.out.println(gun + "Hafta içi");
			break;
		case 6,7:
			System.out.println(gun + "Hafta sonu");
			break;
		default:
			 System.out.println("Hatalı değer girdiniz. ");
			break;
		}
	}

}