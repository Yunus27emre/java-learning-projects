
public class Hafta6_5Ödev {

	public static void main(String[] args) {
//Çarpım tablosunu ekrana yazan Java kodunu 
//while döngü yapısı kullanarak yazınız.
		
		int sayi1=0,sayi2=1,sonuc;
		while(sayi1<10) {
			
			sayi1++;
			sayi2=1;
			while(sayi2<=10) {
				sonuc=sayi1*sayi2;
				System.out.println(sayi1+"."+sayi2+"="+sonuc);
				sayi2++;
				
			}
			
				
			
			
		}
		

	}
}
