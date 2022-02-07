public class Limuzina extends Avto {
	
	private double dolzina;
	private boolean miniBar;
	
	public Limuzina() {
		this(5.5, true); // klice konstruktor tega razreda
		// super(1, 0, "neznana") // klice konstruktor nadrazreda
	}
	
	public Limuzina(double dolzina, boolean miniBar) {
		this.dolzina = dolzina;
		this.miniBar = miniBar;
	}
	
	public Limuzina(int prestava, double hitrost, String registracija, boolean miniBar, double dolzina) {
		super(prestava, hitrost, registracija);
		this.dolzina = dolzina;
		this.miniBar = miniBar;
	}
	
	public void setDolzina(double dolzina) {
		this.dolzina = dolzina;
	}
	
	public void setminiBar(boolean miniBar) {
		this.miniBar = miniBar;
	}
	
	public double getdolzina() {
		return this.dolzina;
	}
	
	public boolean getminiBar() {
		return this.miniBar;
	}
	
	public void izpis() {
		super.izpis();
		System.out.println("Dolzina: " + this.getdolzina() + " metrov" );
		System.out.println("Mini bari: " + this.getminiBar());
	}
	
}