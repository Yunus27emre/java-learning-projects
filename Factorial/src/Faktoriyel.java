import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Faktoriyel hesaplanacak sayı :");
		int x=scan.nextInt();
		System.out.print(faktoriyel(x));
		
		
	}
	public static int faktoriyel(int n) {
		 if(n!=1)return n*faktoriyel(n-1);
		else return n;
	}

}
