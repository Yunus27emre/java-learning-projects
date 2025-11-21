import java.util.concurrent.*;
import java.util.*;
public class _23010310067 {

	public static void main(String[] args) {
		
		BlockingQueue<Musteri> musteriKuyrugu = new LinkedBlockingQueue<>();
        Random rand = new Random();

        for (int i = 1; i <= 10; i++) {
            int islemSuresi = 2 + rand.nextInt(4); 
            musteriKuyrugu.add(new Musteri(i, islemSuresi));
        }

        int giseSayisi = 3;
        for (int i = 1; i <= giseSayisi; i++) {
            Thread giseThread = new Thread(new Gise(i, musteriKuyrugu));
            giseThread.start();
        }
	}

}
