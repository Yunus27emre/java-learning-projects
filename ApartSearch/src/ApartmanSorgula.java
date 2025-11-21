
public class ApartmanSorgula {

	public static void main(String[] args) {
		Apart d0=new Apart();
		System.out.println(d0.toString());
		Apart[] d=new Apart[8];
		String[] apasahi= {"Ali","Ayşe","Gül","Ragıp","Ayten","Safiye","Kamil","Yunus"};
		int j=0;
		for(int i=0;i<d.length;i++) {
			if(i%2==0) {
				j++;
			}
			d[i]=new Apart(j,apasahi[i]);
			System.out.println("Kat:" +d[i].getDairekat()+ " Daire:" +d[i].getDaireno()+  " de/da oturan " +d[i].getDairesahip());
		}
		
		
	}

}
