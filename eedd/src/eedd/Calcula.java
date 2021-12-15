package eedd;

public class Calcula {

	public static void main(String[] args) {
		int c = suma(1,2);
		int d = resta(1,3);
		String e = devuelve();
	}

	public static int suma(int a, int b) {
		return a+b;
	}
	
	public static int resta(int a, int b) {
		return a-b;
	}
	
	public static String devuelve() {
		String finl = null;
		String a = "Ayuda";
		String b = "No";
		String c = "Tengo";
		String d = "Imaginacion";
		String e = "Jaja";
		String[] ab = {a,b,c,d,e};
		String[] aa = new String[5];
		for (int i = 0; i < ab.length; i++) {
			aa[i] = ab[i];
		}
		for (int i = 0; i < aa.length; i++) {
			finl += aa[i];
		}
		return finl;
	}
	
	public static boolean de() {
		boolean a = true;
		return a;
	}
}
