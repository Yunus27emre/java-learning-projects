package algo2gun;

import java.util.Scanner;

public class basamakDegistirme {

	public static void main(String[] args) {
		Scanner yunus=new Scanner(System.in);
		System.out.print("Basamakları Değiştirilecek Sayıyı Giriniz : ");
		int alıs=yunus.nextInt();
		int yenisayi=swapDigitPairs(alıs);
		System.out.print(yenisayi);
	}

	public static int swapDigitPairs(int sayi) {
		int basdeg = 1;
		int sonuc = 0;
		while ((sayi/10) != 0) {
			int bir = sayi % 10;//123-->3
			int iki = (sayi / 10) % 10;//
			sayi/=100;
			sonuc += iki * basdeg + bir * basdeg * 10;
			basdeg *= 100;
		}sonuc+=sayi*basdeg;
		
		return sonuc;
	}
}
