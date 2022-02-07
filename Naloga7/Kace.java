public class Kace extends Zival {
	
	
	//SPREMENJLIVKE RAZREDA
	private double dolzina;
	private boolean strupena;
	private static final boolean mesojeda = true;
	
	public Kace() {
		this(0.0 , false); // klice konstruktor tega razreda
		
	}
	
	public Kace(double dolzina, boolean strupena) {
		this.dolzina = dolzina;
		this.strupena = strupena;
	}
	
	public Kace(String ime, double starost, boolean mesojeda, double dolzina, boolean strupena) {
		super(ime, starost, true);// SPREMENJLJIVKE NADRAZREDA
		this.dolzina = dolzina;
		this.strupena = strupena;
	}
	
	//METODA SET
	public void setDolzina(double dolzina) {
		this.dolzina = dolzina;
	}

	
	public void setStrupena(boolean strupena) {
		this.strupena = strupena;
	}
	
	
	//METODA GET
	public double getDolzina() {
		return this.dolzina;
	}
	
	public boolean getStrupena() {
		return this.strupena;
	}
	
	//IZPIS
	
	
	public void izpis() {
		super.izpis();
		System.out.println("Dolzina: " + this.getDolzina() + "cm");
		System.out.println("Strupena: " + this.getStrupena());
	}
	
}