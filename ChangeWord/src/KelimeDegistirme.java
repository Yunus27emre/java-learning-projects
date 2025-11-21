package algo2gun;

public class KelimeDegistirme {

	public static void main(String[] args) {

		String deger = tersCevir("abuzer");
		System.out.print(deger);
	}

	public static String tersCevir(String kelime) {
		String tkelime = "";

		for (int i = kelime.length() - 1; i >= 0; i--) {
			char gecici = kelime.charAt(i);
			tkelime += gecici;

		}

		return tkelime;
	}
}
