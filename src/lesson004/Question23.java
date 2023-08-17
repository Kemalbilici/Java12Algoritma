package lesson004;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {

		//Girilen sayi için çarpim tablosunu veren program
		//input --> 6
		//6x1 =6
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz.");
		int sayi = scanner.nextInt();
		
		for(int i = 1; i<=10; i++) {
			System.out.println(sayi+"x"+i+"="+i*sayi);
			
		}
	}

}
