import java.util.Scanner;
public class MükemmelSayi {
	public static void main(String[] args) {
		Scanner zula=new Scanner(System.in);
		int sayi1,sayi2=1,top=0,deger;
		System.out.print("Bir Sayı Giriniz");
		sayi1=zula.nextInt();
		while(sayi1>=sayi2) {
			deger=sayi1%sayi2;
			
			if(deger==0)
				top+=sayi2;
			sayi2++;
		}
		if(top==sayi1*2)
		System.out.print(sayi1+" Mükemmel Sayıdır.");
		else
			System.out.print(sayi1+" Mükemmel Sayı Değildir.");
	}

}
