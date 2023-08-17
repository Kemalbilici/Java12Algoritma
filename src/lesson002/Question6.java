package lesson002;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		
		//Kullanıcıdan alınan vize ve final notlarını hesaplayarak
		//geçip geçmediğini hesaplayalım
		
		//vize %40
		//final %60
		//50 den büyük ve eşitse geçsin
		//50den küçükse kalsın
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vize notunu giriniz: ");
		double vizeNotu = scanner.nextDouble();
		
		System.out.println("Final notunu giriniz: ");
		double finalNotu = scanner.nextDouble();
		
		double toplamNotu = (finalNotu*0.60) + (vizeNotu*0.40);
		
		if (toplamNotu>= 50) {
			System.out.println("Dersi geçtiniz" );
		}
		else {
			System.out.println("Dersten kaldınız");
		}

		
		// (-) kontrolü yapalım
		//
	}

}
