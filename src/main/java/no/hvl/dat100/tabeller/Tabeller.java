package no.hvl.dat100.tabeller;

public class Tabeller {
	// a)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String streng = null;
		if (tabell.length > 0) {
			streng = "[";
			for (int i = 0; i < tabell.length; i++) {
				if (i == tabell.length - 1) {
					streng = streng + tabell[i];
				} else {
					streng = streng + tabell[i] + ",";
				}
			}
			streng = streng + "]";
		} else { streng = "[]"; }
		return streng;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i : tabell) {
			sum = sum + i;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i : tabell) {
			if (i == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int posisjon = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				posisjon = i;
			}
		}
		return posisjon;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int teller = 0;
		int[] rev = new int[tabell.length];
		for (int i = tabell.length - 1; i >= 0; i--) {
			rev[teller] = tabell[i];
			teller++;
		}
		return rev;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i+1]) {
				sortert = false;
			}
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int teller = 0;
		int lengde = (tabell1.length + tabell2.length);
		System.out.println(lengde);
		int[] tabell = new int[lengde];
		for (int i = 0; i < tabell1.length; i++) {
			tabell[i] = tabell1[i];
			teller++;
		}
		for (int j = 0; j < tabell2.length; j++) {
			tabell[j+teller] = tabell2[j];
		}
		return tabell;
		
	}
}
