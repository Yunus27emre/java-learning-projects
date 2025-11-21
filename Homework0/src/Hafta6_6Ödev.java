import java.util.Scanner;

public class Hafta6_6Ödev {

	public static void main(String[] args) {
//Girilen iki sayının çarpım sonucunu çarpma işlemini kullanmadan bulan
//Java kodunu while döngü yapısı kullanarak yazınız.
		Scanner taskesen = new Scanner(System.in);
		System.out.print("Lütfen Birinci Sayıyı Giriniz.");
		int sayi1 = taskesen.nextInt();
		System.out.print("Lütfen İkinci Sayıyı Giriniz.");
		int sayi2 = taskesen.nextInt();
		int sonuc = sayi1 * sayi2;
		while (sayi2 > 0) {
			sayi2--;
			System.out.print("(" + sayi1 + ")");
			if (sayi2 > 0) {
				
				System.out.print("+");}
				

		}
        
		while (sayi2 < 0) {
			
			if (sayi1 < 0) {
				System.out.print("+");
				System.out.print(-sayi1);
				

			} else {
				System.out.print("-");
				System.out.print("("+sayi1+")");
				
			}
			sayi2++;
		}
		System.out.print("=" + sonuc);
	}
}
