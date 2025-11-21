
public class Hafta6_2Ödev {

	public static void main(String[] args) {

		// 1'den 100'e kadar olan sayılarının karelerinin toplamını bulan
		// ve toplamı ekrana yazan Java kodunu while döngü yapısı kullanarak yazınız.
		int sayi = 1, toplam = 0;
		int deger ;
		while (sayi <= 100) {
			deger=sayi*sayi;
			toplam+=deger;
			sayi++;

		}
		System.out.println("1'den 100'e Kadar Olan Sayıların (100'de Dahil) Karelerin Toplamının Sonucu = "+toplam);

	}

}
