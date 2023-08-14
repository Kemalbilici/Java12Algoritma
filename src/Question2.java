import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// Kullanıcıdan aldıgımız 2 int değeri bir çarpıp sonucu yazdıralım
		
		Scanner scanner = new Scanner(System.in);
		
		int sayi1;
		int sayi2;
		int carp;
		
		System.out.println("1. Sayi: ");
		sayi1 = scanner.nextInt();
		
		System.out.println("2. Sayi: ");
		sayi2 = scanner.nextInt();
		
		carp = sayi1 * sayi2;
		
		System.out.println(carp);

	}

}
