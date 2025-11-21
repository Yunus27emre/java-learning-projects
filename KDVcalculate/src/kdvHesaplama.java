import java.util.Scanner;
public class kdvHesaplama {
	public static void main(String[] args) {
		double sayi,kdvli;
		Scanner abuzer=new Scanner(System.in);
		System.out.print("Fiyat Giriniz.");
		sayi=abuzer.nextDouble();
		kdvli=sayi*1.18;
		System.out.print(kdvli);
		
		
		
		
	}

}
