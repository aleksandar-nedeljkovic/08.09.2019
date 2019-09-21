package domaci08092019;

import java.util.Scanner;

public class DomaciZadatak3 {
	
	static String kompresovaniString(String s) {
		String kompresija = "";
		int br = 1;

		for (int i = 1; i < s.length(); i++) {

			if (s.charAt(i - 1) == s.charAt(i)) {
				for (int j = i; j < s.length(); j++) {
					if (s.charAt(i - 1) == s.charAt(j)) {
						br++;
						i++;
					} else {
						kompresija += s.charAt(i - 1) + "(" + br + ")";
						br = 1;
						break;
					}
				}

			} else
				kompresija += s.charAt(i - 1);
		}
		if (br > 1)
			kompresija += s.charAt(s.length() - 1) + "(" + br + ")";
		else
			kompresija += s.charAt(s.length() - 1);
		return kompresija;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Unesite string: ");
		str = sc.nextLine();
		str = str.toLowerCase();

		System.out.println(kompresovaniString(str));
		
	}

}
