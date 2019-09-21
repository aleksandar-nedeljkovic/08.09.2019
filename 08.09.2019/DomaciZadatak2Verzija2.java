package domaci08092019;

import java.util.Scanner;

public class DomaciZadatak2Verzija2 {
	
	static String najduziPodstring(String str) {
		String[] reci = str.split(" ");
		int brojSamoglasnika = 0;
		String najduziPodstring = "";

		// iteracija kroz niz reci
		for (String rec : reci) {
			int treutniBrojSamoglasnika;
			treutniBrojSamoglasnika = rec.split("[aeiou]", -1).length;

			if (treutniBrojSamoglasnika > brojSamoglasnika) {
				najduziPodstring = rec;
				brojSamoglasnika = treutniBrojSamoglasnika;
			}
		}

		return najduziPodstring;

	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Unesite neki string: ");
		str = sc.nextLine();
		str = str.toLowerCase();
		System.out.println("Najduzi podstring samoglasnika je: " + najduziPodstring(str));

	}

}
