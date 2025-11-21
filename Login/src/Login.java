import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		boolean aktif = true;
		int haksayi = 3;
		aktif=giris();
		if (aktif) {

			if (haksayi > 0) {

			} else {
				System.out.println("Hak Sayınız Dolmuştur,Hesabınız Bloke Olmuştur");
			}
		} else {
			System.out.println("Hesabınız Aktif Değildir.Lütfen Bizimle İletişime Geçiniz.");
		}

	}

	public static boolean login(String Username, String Password) {
		
		if(Username.equals("YunusEmre")&&Password.equals("Yunusemre1")) {
			System.out.println("Hesaba giriş yapılıyor...");
			System.out.println("Hesaba giriş yapıldı.");
			return true;
		}else {
			System.out.println("Yanlış giriş yapıldı.Kalan hak 2");
		}
		giris();
		if(Username.equals("YunusEmre")&&Password.equals("Yunusemre1")) {
			System.out.println("Hesaba giriş yapılıyor...");
			System.out.println("Hesaba giriş yapıldı.");
			return true;
		}else {
			System.out.println("Yanlış giriş yapıldı.Kalan hak 1");
		}
		giris();
		if(Username.equals("YunusEmre")&&Password.equals("Yunusemre1")) {
			System.out.println("Hesaba giriş yapılıyor...");
			System.out.println("Hesaba giriş yapıldı.");
			return true;
		}else {
			System.out.println("Yanlış giriş yapıldı.Kalan hak 0");
		}
		return false;
	}
	
	public static boolean giris() {
		Scanner input=new Scanner(System.in);
		System.out.println("Kullanıcı adnı giriniz.");
		String username=input.next();
		boolean deger;
		System.out.print("Şifreyi giriniz.");
		String password=input.next();
		return deger=login(username,password);
		
	}
}
