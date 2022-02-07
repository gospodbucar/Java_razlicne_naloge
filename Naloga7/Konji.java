public class Konji extends Zival {
	
	
	//SPREMENLJIVKE PODRAZREDA
	private double hitrost;
	private double teza;
	
	public Konji() {
		this(0.0 , 0.0); // klice konstruktor tega razreda
		
	}
	
	public Konji(double hitrost, double teza) {
		this.hitrost = hitrost;
		this.teza = teza;
	}
	
	public Konji(String ime, double starost, boolean mesojeda, double hitrost, double teza) {
		super(ime, starost, mesojeda);//  SPREMENLJIVKE NADRAZREDA ZIVAL
		this.hitrost = hitrost;
		this.teza = teza;
	}
	
	// METODA SET
	public void setHitrost(double hitrost) {
		this.hitrost = hitrost;
	}
	
	public void setTeza(double teza) {
		this.teza = teza;
	}
	//METODA GET
	public double getHitrost() {
		return this.hitrost;
	}
	
	public double getTeza() {
		return this.teza;
	}
	
	//IZPIS
	public void izpis() {
		super.izpis();
		System.out.println("Hitrost: " + this.getHitrost() + "km/h");
		System.out.println("Teza: " + this.getTeza() + " kg");
	}
	
}