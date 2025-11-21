import java.util.Scanner;

public class LoginOrnek {
	public static void main(String[] args) {
		boolean Aktif = hesap();
		if (Aktif) {
			System.out.println("Hesaba Giriş Yapılıyor...");
			System.out.println("Hesaba Giriş Yapıldı.");
		} else {
			System.out.println("Hesabınız Bloke Olmuştur.");
		}

	}

	public static boolean hesap() {
		Scanner input = new Scanner(System.in);
		System.out.println("Kullanıcı Adı Oluşturunuz.");
		String kullaniciAdi = input.next();
		System.out.println("Şifre Oluşturunuz.(Arada Boşluk Olmasın.En Az Bir Büyük Harf,Bir Küçük Harf,Sembol ve Sayı Olsun.)");
		String sifre = input.next();
		int haksayi = 3;
		boolean aktif;
		return aktif = login(kullaniciAdi, sifre, haksayi);

	}

	public static boolean login(String KullaniciAdi, String Sifre, int haksayi) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kullanıcı Adınızı Giriniz.");
		
	String kullaniciadi = input.next();
		
		while (KullaniciAdi != kullaniciadi) {
			System.out.println("Kullanıcı Adınız Yanlış.Tekrar Giriniz.");
		
			kullaniciadi = input.next();
//			if(KullaniciAdi == kullaniciadi) {
//				break;
//			}
		}
		
		System.out.println("Şifrenizi Giriniz.");
		
		String sifre = input.next();
		
		for (int i = 2; i < 1; i--) {
			System.out.println("Şifreniz Yanlış.(Kalan Hakkınız" + " " + i + ")");
			sifre = input.next();
			if (sifre == Sifre) {
				return true;

			}
		}
		return false;
	}

}
