import java.util.Scanner;

public class Hafta6_3Ödev {

	public static void main(String[] args) {
		//long un sınırı 65,integer in sınırı 33
// Girilen sayının faktöriyelini bulan Java kodunu 
//while döngü yapısı kullanarak yazınız.
		Scanner yunus=new Scanner(System.in);
		long  faktoriyel=1;
		System.out.print("Lütfen Doğal Sayı Giriniz.");
		long sayi=yunus.nextLong();
		while(sayi<0) {
			System.out.println("Doğal Sayı Tanımı : Doğal sayılar sıfırdan başlayarak sonsuza kadar devam eden sayılar kümesidir.");
			System.out.print("Lütfen Doğal Sayı Giriniz(Doğal Sayı'nın Tanımı Üst Satırdadır.).");
			 sayi=yunus.nextInt();
			
		}
		
		while(sayi>0) {
			faktoriyel=sayi*faktoriyel;
			sayi--;
			
		}
	    System.out.print("Girdiğiniz Sayınızın Faktoriyel Sonucu = "+faktoriyel);
		
		
	}

}
