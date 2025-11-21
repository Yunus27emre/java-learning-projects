package algo2gun;

import java.util.Scanner;

public class HedefBulma {

	public static void main(String[] args) {
		Scanner yunus = new Scanner(System.in);
		System.out.print("Kaç Tane Sayı Gireceğinizi Rakamsal Olarak Tuşlayınız : ");
		int diziboyut = yunus.nextInt();
		int[] diziler = new int[diziboyut];
		int[] bulmaca=new int[2];
		for (int i = 0; i < diziler.length; i++) {
			System.out.print((i + 1) + ". Sayıyı Giriniz : ");
			diziler[i] = yunus.nextInt();
		}
		System.out.print("Hedef Bir Sayı Giriniz : ");
		int Hedef = yunus.nextInt();
		boolean sonuc = twoSum(diziler, Hedef);
		System.out.println(sonuc);
		bulmaca=twoSum2(diziler,Hedef);
		for(int i=0;i<bulmaca.length;i++) {
			System.out.println(bulmaca[i]+". Girdiğiniz Sayı Alınmıştır.");
		}
	}

	public static int[] twoSum2(int[] dizi, int hedef) {
		int[] bulma=new int[2];
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[i] + dizi[j] == hedef) {
					bulma[0]=i+1;
					bulma[1]=j+1;
					return bulma;
				}

			}

		}

		return null;
	}

	public static boolean twoSum(int[] dizi, int hedef) {

		for (int i = 0; i < dizi.length; i++) {
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[i] + dizi[j] == hedef) {
					return true;
				}

			}

		}

		return false;
	}
}
