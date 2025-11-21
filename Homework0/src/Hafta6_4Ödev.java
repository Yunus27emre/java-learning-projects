import java.util.Scanner;

public class Hafta6_4Ödev {

	public static void main(String[] args) {

	// Girilen sayının kaç basamaklı olduğunu söyleyen Java kodunu 
	// while döngü yapısı kullanarak yazınız.
		
		Scanner emre=new Scanner(System.in);
		System.out.print("Lütfen Doğal Sayı Giriniz.");
	   int sayi=emre.nextInt();
	   while(sayi<0) {
		System.out.print("Doğal Sayı Giriniz,Uğraşmayınız.");
	    sayi=emre.nextInt();
		   
	   }
	   int basamak=1;
	   while(sayi>9) {
		   sayi=sayi/10;
		   basamak++;
	   }
		System.out.print("Girdiğiniz Sayi "+basamak+" Basamaklıdır.");
		
		
		
	}

}
