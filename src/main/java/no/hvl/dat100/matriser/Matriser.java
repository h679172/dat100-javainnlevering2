package no.hvl.dat100.matriser;

public class Matriser {
	// a)
	public static void skrivUt(int[][] matrise) {
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.println(matrise[i][j]);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String streng = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				if (j == matrise[i].length - 1) {
					streng = streng + matrise[i][j] + " \n";
				} else {
					streng = streng + matrise[i][j] + " ";
				}
			}
		}
		return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int lb = 0;
		for (int a = 0; a < matrise.length; a++) {
			lb = matrise[a].length;
		}
		int[][] nyMatrise = new int[matrise.length][lb];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean erlik = false;
		if (a == b) {
			erlik = true;
		}
		return erlik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] tabell = new int[matrise.length][matrise.length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) { 
				tabell[i][j] = matrise[j][i];
			}
		}
		return tabell;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
	int[][] result = new int[a.length][b[0].length];
	for (int i = 0; i < result.length; i++) {
		for (int j = 0; j < result[i].length; j++) {
				result[i][j] = gangMatriseCelle(a, b, i, j);
			}
		}
		return result;
	}
	public static int gangMatriseCelle(int[][] a, int[][] b, int rad, int kol) {
		int celle = 0;
		for (int i = 0; i < b.length; i++) {
			celle += a[rad][i] * b[i][kol];
		}
		return celle;
	}
}
