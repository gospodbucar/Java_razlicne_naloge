public class Jezi extends Zival {
	
	//SPREMENLJIVKE PODRAZREDA
	private double velikost;
	private boolean bodice;
	
	public Jezi() {
		this(0.0 , false); // klice konstruktor tega razreda
		
	}
	
	public Jezi(double velikost, boolean bodice) {
		this.velikost = velikost;
		this.bodice = bodice;
	}
	
	public Jezi(String ime, double starost, boolean mesojeda, double velikost, boolean bodice) {
		super(ime, starost, mesojeda);//SPREMENLJIVKE NADRAZREDA ZIVAL
		this.velikost = velikost;
		this.bodice = bodice;
	}
	//METODA SET
	
	public void setVelikost(double velikost) {
		this.velikost = velikost;
	}
	
	public void setBodice(boolean bodice) {
		this.bodice = bodice;
	}
	
	//METODA GET
	public double getVelikost() {
		return this.velikost;
	}
	
	public boolean getBodice() {
		return this.bodice;
	}
	
	//IZPIS
	public void izpis() {
		super.izpis();
		System.out.println("Velikost: " + this.getVelikost());
		System.out.println("Bodice: " + this.getBodice());
	}
	
}