
public class Apart {
	private String dairesahip;
	private static int daireno = 0;
	private int dairekat;

	Apart(int dairekat, String dairesahip) {
		this.dairekat = dairekat;
		//this.daireno = daireno;
		this.dairesahip = dairesahip;
	}

	Apart() {
		this(0, "Bodrum");
	}

	public  int getDaireno() {
		daireno++;
		int daireNo = daireno;
		return daireNo;
	}

	public int getDairekat() {
		return dairekat;
	}

	public String getDairesahip() {
		return dairesahip;
	}

	public String toString() {
		return "Kat:" + dairekat + " Daire:" + daireno + " de/da oturan " + dairesahip;

	}
	

}
