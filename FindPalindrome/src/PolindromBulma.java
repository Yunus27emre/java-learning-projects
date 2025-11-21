package algo2gun;
import java.util.Scanner;
public class PolindromBulma {
	public static void main(String[] args) {
		Scanner yunus=new Scanner(System.in);
		System.out.print("Lütfen Bir Kelime Giriniz : ");
		String sozcuk =yunus.next();
		System.out.print(isPolindrome(sozcuk));
	}

	public static boolean isPolindrome(String kelime) {
		int baslangıc = 0;
		int bitis = kelime.length() - 1;
		while (baslangıc < bitis) {
			if (kelime.charAt(baslangıc) != kelime.charAt(bitis)) {

				return false;
			}

			baslangıc++;
			bitis--;

		}

		return true;
	}

}
