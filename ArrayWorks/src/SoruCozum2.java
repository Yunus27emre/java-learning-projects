
public class SoruCozum2 {
	public static void main(String[] args) {
		int size = 5;
		for (int satir = 0; satir < size; satir++) {
			int toplam=1;
			for (int sutun = 0; sutun <= satir; sutun++) {
			System.out.print(toplam+" ");
		toplam=toplam*(satir-sutun)/(sutun+1);
			
			}System.out.println();

		}

	}
}
