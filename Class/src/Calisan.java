
public class Calisan {
	public int no;
	public String isim;
	public String soyisim;
	public int tecrube;
	public int maas;
	public String gobekisim;

	public Calisan(int no, String isim,String soyisim, String gobekisim,  int tecrube, int maas) {
		this.no = no;
		this.isim = isim;
		this.maas = maas;
		this.soyisim = soyisim;
		this.gobekisim = gobekisim;
		this.maas = maas;
		this.tecrube = tecrube;
	}

	public Calisan() {

	}

	public void maasArtim(int artim) {
		System.out.println("Maaşınıza " + artim + " TL zam gelmiştir.");
		System.out.println("Güncel maasşınız " + (artim + maas) + "TL'dir.");
	}

	public void CalisanBilgileri() {
		System.out.println("*****ÇALIŞAN BİLGİSİ*****");
		System.out.println("No     :" + no);
		System.out.print("İsim   :" + isim + " ");

		if (gobekisim != null) {
			System.out.println(gobekisim);
		} else {
			System.out.println();
		}
		System.out.println("Soyisim:" + soyisim);
		System.out.println("Tecrübe:" + tecrube);

	}

}
