package domaci08092019;

import java.util.Scanner;

public class DomaciZadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite string");
		String s = sc.nextLine();
		s = s.toLowerCase();
		
		if (palindrom(s)) {
			System.out.println("String je palindrom!");
		}
		else 
			System.out.println("String nije palindrom!");
	}
	static boolean palindrom(String s) {
		char[] niz = s.toCharArray();
		for (int i=0; i<niz.length/2; i++) {
			if (niz[i] != niz[niz.length-i-1]) {
				return false;
			}
		}
		return true;

	}

}
