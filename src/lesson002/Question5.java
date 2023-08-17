package lesson002;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		// Girilen TL değerini USD çeviren program
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dolar Kurunu Giriniz: ");
		double guncelDolarDegeri = scanner.nextDouble();
		
		System.out.println("Tl miktarini giriniz: ");
		double tlDegeri = scanner.nextDouble();
		
		double hesaplananDolarDegeri = tlDegeri / (guncelDolarDegeri);
			
		System.out.println("Dolar Miktari " + hesaplananDolarDegeri);
	}

}
