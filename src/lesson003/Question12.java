package lesson003;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// girilen iki sayinin toplamı
		//çift ise true tek ise false yazdiralim
		//boolean yazdiralim
		//toplanan iki sayiyi da kullaniciya göster
		
		Scanner scanner = new Scanner(System.in);
		
		boolean ciftMi;
		
		System.out.println("1. Sayi: ");
		int sayi1 = scanner.nextInt();
		
		System.out.println("2. Sayi: ");
		int sayi2 = scanner.nextInt();
		
		int toplam = sayi1 + sayi2;
		
		if (toplam % 2 == 0) {
			ciftMi = true;
		}else {
			ciftMi = false;
		}
		System.out.println("1.Sayi:" +sayi1+ " 2.Sayi:"+sayi2 + " Sonuc: " +ciftMi);
	}

}
