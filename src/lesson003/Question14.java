package lesson003;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// Girilen 3 sayıyı büyükten küçüğe sıralayalım
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		String sayiSiralama;
		
		System.out.println("1. sayıyı giriniz");
		num1 = scanner.nextInt();
		
		System.out.println("2. sayıyı giriniz");
		num2 = scanner.nextInt();
		
		System.out.println("3. sayıyı giriniz");
		num3 = scanner.nextInt();
		
		if(num1 >= num2 && num1>=num3) {
			if(num2 >= num3) {
				sayiSiralama = num1 + ">" + num2 + ">" + num3;
			}else {
				sayiSiralama = num1 + ">" + num3 + ">" + num2;
			}
		}else if(num2 >= num1 && num2>=num3) {
			if(num1 >= num3) {
				sayiSiralama = num2 + ">" + num1 + ">" + num3;
			}else {
				sayiSiralama = num2 + ">" + num3 + ">" + num1;
			}
		}else {
			if(num1 >= num2) {
				sayiSiralama = num3 + ">" + num1 + ">" + num2;
			}else {
				sayiSiralama = num3 + ">" + num2 + ">" + num1;
				//System.out.println("num3 > num2 > num1");
			}
		}
		System.out.println(sayiSiralama);	
	}
}