package no.hvl.dat100.matriser;

public class Matriser {
	
	public static void main(String[] args) {
		int[][] matrise = {{1,2,3}, {4,5,6},{7,8,9}};
		int[][] matrise3 = {{1,2,3}, {7,3,9}, {6,3,9}};
		skrivUt(matrise);
		System.out.println(tilStreng(matrise));
		int[][] matrise1 = skaler(5, matrise);
		skrivUt(matrise1);
		System.out.println(erLik(matrise, matrise3));
		skrivUt(multipliser(matrise, matrise3));
	}
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
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == b[i][j]) {
					erlik = true;
				}
			}
		}
		return erlik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int lengde = 0;
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				lengde++;
			}
		}
		int[][] tabellNy = new int[matrise.length][lengde];	
		for (int a = 0; a < matrise.length; a++) {
			for (int b = 0; b < matrise[a].length; b++) {
				tabellNy[a][b] = matrise[a][b];
			}
		}
		return tabellNy;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int la = 0;
		int lb = 0;
		for (int i = 0; i < a.length; i++) {
			la = a[i].length;
		}
		for (int j = 0; j < b.length; j++) {
			lb = b[j].length;
		}
		int[][] multiplisert = new int[a.length][lb];
		if (a.length == b.length && la == lb) {
			for (int f = 0; f < a.length; f++) {
				for (int k = 0; k < la; k++) {
					multiplisert[f][k] = (a[f][k] * b[f][k]);
				}
			}
		}
		return multiplisert;
	}
}
