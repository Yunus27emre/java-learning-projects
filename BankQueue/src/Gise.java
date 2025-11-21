import java.util.*;
import java.util.concurrent.*;
public class Gise implements Runnable{
	
	private final int giseNumarasi;
    private final BlockingQueue<Musteri> musteriKuyrugu;

    public Gise(int giseNumarasi, BlockingQueue<Musteri> musteriKuyrugu) {
        this.giseNumarasi = giseNumarasi;
        this.musteriKuyrugu = musteriKuyrugu;
    }

    
    public void run() {
        try {
            while (true) {
                Musteri musteri = musteriKuyrugu.poll(3, TimeUnit.SECONDS);
                if (musteri == null) break;

                System.out.println("Gişe " + giseNumarasi + " - Müşteri " + musteri.getSiraNumarasi() +
                                   " işlemi başladı. Süre: " + musteri.getIslemSuresi() + " sn");
                Thread.sleep(musteri.getIslemSuresi() * 1000L);
                System.out.println("Gişe " + giseNumarasi + " - Müşteri " + musteri.getSiraNumarasi() +
                                   " işlemi tamamlandı.");
            }
        } catch (InterruptedException e) {
            System.out.println("Gişe " + giseNumarasi + " kesildi.");
        }
    }
}
