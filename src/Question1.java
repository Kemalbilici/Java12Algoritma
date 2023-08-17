import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
	
		//Verilen isim ve soyisim değerlerini
		
		//Hoşgeldiniz isim + soyisim yazdıralım
		
		
		Scanner scanner = new Scanner(System.in);
		
		String isim = null;
		
		String soyIsim;
		
		System.out.println("İsim Giriniz");
		isim = scanner.next();
		
		System.out.println("Soy Isim Giriniz");
		soyIsim = scanner.next();
		
		System.out.println("Hoşgeldiniz:" + isim + " " + soyIsim);
							

	}

}
