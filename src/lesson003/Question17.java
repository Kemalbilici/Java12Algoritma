package lesson003;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// 1- 100 e kadar olan sayıları yazdıralım
		//girilen sayıya kadar
		
		Scanner scanner = new Scanner(System.in);
		
		int sart = scanner.nextInt();
		int sayac = 1;
		
	
		while(sayac <= sart) {
			System.out.print(sayac+ ", ");
			sayac ++;
		}
	}

}