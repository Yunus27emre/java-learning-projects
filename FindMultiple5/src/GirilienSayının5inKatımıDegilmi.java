import java.util.Scanner;
public class GirilienSayının5inKatımıDegilmi {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sayi,mod;
		System.out.print("Sayı Giriniz.");
		sayi=input.nextInt();
		mod=sayi%5;
		if(mod==0) {
			System.out.print(sayi+" 5'in Kuvvetidir.");
		}else {
			System.out.print(sayi+" 5'in Kuvveti Değildir.");
		}
			
		
		
		
		
	}

}
