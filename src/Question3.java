import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		/*
		 * Verilen ürün satış fiyatının içinde %20 kdv ve %25 kar olduğunu biliyoruz
		 * verilen ürün fiyatının ham fiyatını bulan programı yazalım.
		 */
		Scanner scanner = new Scanner(System.in);
		
		int fiyat ;
		
		double hamfiyat;
		
		double vergiOrani = 1.20;
		
		double karOrani = 1.25;
		
		System.out.println("Ürün fiyatını girin: ");
		fiyat = scanner.nextInt();
		
		hamfiyat = fiyat / (vergiOrani * karOrani);
		System.out.println("Ürünün Hamfiyatı :" + hamfiyat);
	}

}
