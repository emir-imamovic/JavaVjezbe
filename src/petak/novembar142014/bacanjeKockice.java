package petak.novembar142014;

public class bacanjeKockice {
	public static void main(String[] args) {

		int kockica1 = (int) (1 + Math.random() * 6);

		int kockica2 = (int) (1 + Math.random() * 6);

		System.out.print("Broj na prvoj kockici je: ");

		System.out.println(kockica1);

		System.out.print("Broj na drugoj kockici je: ");

		System.out.println(kockica2);

		System.out.print("Ukupna vrijednost brojeva na obe kockice je: ");

		System.out.print(kockica1 + kockica2);

	}
}
