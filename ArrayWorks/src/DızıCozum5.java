import java.util.Scanner;

public class DızıCozum5 {
	public static void main(String[] args) {
//		int[] array= {5,8,1,2,6,4,9,53,4};
//		int enbuyuk1;
//		int enbuyuk2;
//		for(int index=0;index<array.length;index++) {
//			if()
System.out.println("Saniye cinsinden bir tam sayi giriniz: ");
		
		Scanner klavye = new Scanner(System.in);
		
		int saniye = klavye.nextInt();
		
		int dakika = saniye / 60;
		
		int kalanSaniye = saniye % 60;
		
		System.out.println(saniye + " saniye " + dakika + " dakika ve " + kalanSaniye + " saniyedir");
	
			
		}

	
	
	
	}

