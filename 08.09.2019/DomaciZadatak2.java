package domaci08092019;

import java.util.Scanner;

public class DomaciZadatak2 {

	static String najduziPodstring(String s) {
		String najduziPodstring = "";
		String najduzi = "";
		String[] podNizovi = s.split(" ");
		for (int i = 0; i < podNizovi.length; i++) {
			for (int j = 0; j < podNizovi[i].length(); j++) {
				char znak = podNizovi[i].charAt(j);
				if (znak == 'a' || znak == 'e' || znak == 'i' || znak == 'o' || znak == 'u')
					najduziPodstring = podNizovi[i];
			}
			if (najduziPodstring.length() > najduzi.length())
				najduzi = najduziPodstring;
			najduziPodstring = "";
		}
		return najduzi;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Unesite String: ");
		str = sc.nextLine();
		str = str.toLowerCase();
		System.out.println("Najduzi podstring samoglasnika je: " + najduziPodstring(str));

	}

}
