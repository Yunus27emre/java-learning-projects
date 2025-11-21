import java.util.Scanner;
public class SoruCozum4 {
	public static void main(String[] args) {
//3 elemanlı bir dizinin elemanlarını klavyeden alan
//bu dizinin elemanlarının toplamını bulan java kodu
		Scanner yunus=new Scanner(System.in);
		int size=3;
		int[] dizi=new int [size];
		int toplam=0;
		for(int index=0;index<size;index++) {
			
			System.out.print("Lütfen "+index+". Diziyi Giriniz.");
			dizi[index]=yunus.nextInt();
			toplam=toplam+dizi[index];
			
		}System.out.println("Yazdığın Sayılar");
		for(int index=0;index<dizi.length;index++) {
			System.out.print(dizi[index]+" ");
			
		}System.out.println();
		System.out.println("Toplamları ----> "+toplam);
	
	
	}
}
