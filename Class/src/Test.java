import java.util.Scanner;

public class Test {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String isim = ismi();
		String gobekisim=gobekismi();
		String soyisim = soyismi();
		int tecrube = tecrubeyil();
		int no = ozelno();
		int maas = maasbeklenti();
		int zam=maaszammi();
		Calisan calisan1=new Calisan(no, isim, soyisim,gobekisim, tecrube, maas);
		calisan1.CalisanBilgileri();
		calisan1.maasArtim(zam);
	}

	public static String ismi() {
		System.out.print("İsminiz?");
		String isim = input.next();
		return isim;
	}

	public static String soyismi() {
		System.out.print("Soyisminiz?");
		String soyisim = input.next();
		return soyisim;
	}

	public static int tecrubeyil() {
		System.out.print("Tecrübe yılınız ne kadar?");
		int tecrube = input.nextInt();
		return tecrube;
	}

	public static int ozelno() {
		System.out.print("Özel numara belirleyiniz?");
		int no = input.nextInt();
		return no;
	}

	public static int maasbeklenti() {
		System.out.print("Maaş beklentiniz ne kadar?");
		int maasbeklentisi = input.nextInt();
		return maasbeklentisi;
	}
	public static int maaszammi() {
		System.out.print("Ne kadar zam istersiniz?");
		int zam=input.nextInt();
		return zam;
	}
	public static String gobekismi() {
		System.out.print("2. bir isminiz varsa giriniz yoksa boş bırakınız?");
		String göbekismi=input.next();
		return göbekismi;
	}

}
