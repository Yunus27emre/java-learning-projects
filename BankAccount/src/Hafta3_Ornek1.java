
public class Hafta3_Ornek1 {

	public static void main(String[] args) {
		Point p1 = new Point(6);
		Point p2 = new Point(7, 11);
		Point p3 = new Point(5);
		System.out.println("p1 =>" + p1.x + " " + p1.y);
		System.out.println("p2 =>" + p2.x + " " + p2.y);
		System.out.println("p3 =>" + p3.x + " " + p3.y);
		System.out.println(p3.toString());
		System.out.println(p1);
		Hafta3_Ornek1 obje = new Hafta3_Ornek1();
		int toplam = obje.topla(5, 7);
		System.out.println(toplam);
	}

	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
}
