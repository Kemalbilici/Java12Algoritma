package lesson004;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		
		// Hesap makinesi
		// + - * /
		
		//switch case
		
		//veya
		
		//toplam için 1i tuşla
		//çıkarma için 2yi tuşla
		
		Scanner scanner = new Scanner(System.in);

        

        System.out.println("İşlem türünü giriniz ( * / - + ).");

        String islemTuru = scanner.next();

        

        System.out.println("1. Sayıyı giriniz");

        int userNum1 = scanner.nextInt();

        System.out.println("2. Sayıyı giriniz");

        int userNum2 = scanner.nextInt();

        

        double sonuc = switch (islemTuru) {

        case "+" -> {

            yield userNum1 + userNum2;

        }case "-" -> {

            yield userNum1 - userNum2;

        }case "*" -> {

            yield userNum1 * userNum2;

        }case "/" -> {

            yield userNum1 / userNum2;

        }

        default -> 0;

        };

        System.out.println(userNum1 + " " + islemTuru + " " + userNum2 + " = " + sonuc);
	}

}
