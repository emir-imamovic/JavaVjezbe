package petak.novembar142014;

public class kredit {
	public static void main(String[] args) {

		int iznos = 9000;

		double kamata = (Math.random() * 16);

		double ukupanDug = iznos + kamata;

		System.out.println("Iznos: " + iznos);
				System.out.println("Kamata: " + kamata);
				System.out.println("Ukupan dug: " + ukupanDug);
	}
}
