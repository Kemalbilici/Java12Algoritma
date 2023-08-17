package lesson002;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {

		//Girilen ortalamanin harf notuna göre geçip geçmediğini bulan program
		
		//90 üstü AA
		//80 ile 90 arasi BB
		//70 ile 80 arasi CC
		//60 ile 70 arasi DD
		//60 dan küçükse FF kaldi olsun

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ortalamayi giriniz: ");
		double ortalama = scanner.nextDouble();
		
		if (ortalama > 100 || ortalama < 0) {
			System.out.println("Lütfen geçerli bir not giriniz. ");
		}else {
			if (ortalama >= 90 && ortalama < 101) {
				System.out.println("AA ");		
			}else if (ortalama >= 80) {
				System.out.println("BB");
			}else if (ortalama >=70) {
				System.out.println("CC ");
			}else if (ortalama >=60) {
				System.out.println("DD");
			}else {
				System.out.println("FF");
			}
			
		}
	}

}
