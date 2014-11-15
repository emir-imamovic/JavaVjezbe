package petak.novembar142014;

public class kvadratKrugValjak {
	public static void main(String[] args) {
		double nekiBroj = 7;

		double povrsinaKvadrata = nekiBroj * nekiBroj;

		double obimKvadrata = 4 * nekiBroj;

		double povrsinaKruga = nekiBroj * nekiBroj * Math.PI;

		double obimKruga = 2 * nekiBroj * Math.PI;

		int kvadratUkrugu = (int) (povrsinaKvadrata / povrsinaKruga);

		double valjak = povrsinaKruga * (0.5 + (Math.random() * 36.7 - 0.5 + 1));

		System.out.println("povrsina kvadrata je: " + povrsinaKvadrata);

		System.out.println("obimKvadrata je:  " + obimKvadrata);

		System.out.println("povrsina kruga je: " + povrsinaKruga);

		System.out.println("obim kruga je: " + obimKruga);

		System.out.println("povrsina kvadrata moze stat u povrsinu kruga "
				+ kvadratUkrugu + " puta");

		System.out.println("zapremina valjka je: " + valjak);
	}
}
