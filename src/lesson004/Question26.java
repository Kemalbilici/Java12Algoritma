package lesson004;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		
		// taban alcaz
		//üs
		
		//2 üzeri 5 i hesaplayacak
		//while for, do while
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Taban girin");
		int taban = scanner.nextInt();
		
		System.out.println("Us girin");
		int us= scanner.nextInt();
		
		int carpim = 1;
		
		for(int i =1; i <= us; i++) {
			carpim=taban*carpim;
		}
		System.out.println(taban + "üzeri" + us + ":" + carpim);
	}

}
