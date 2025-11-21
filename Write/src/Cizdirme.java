import java.util.Scanner;
public class Cizdirme {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Yükseklik gir:");
		int height=scan.nextInt();
		for(int i=0;i<height;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
	}
}
