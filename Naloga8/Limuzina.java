public class Limuzina extends Avto {
	
	private double dolzina;
	private boolean miniBar;
	
	public Limuzina() {
		//this(5.5, true); // klice konstruktor tega razreda
		super(1, 0, "neznana"); // klice konstruktor nadrazreda
	}
	
	public Limuzina(double dolzina, boolean miniBar) {
		this.dolzina = dolzina;
		this.miniBar = miniBar;
	}
	
	public Limuzina(int prestava, double hitrost, String registracija, double dolzina, boolean miniBar) {
		super(prestava, hitrost, registracija);
		this.dolzina = dolzina;
		this.miniBar = miniBar;
	}
	
	public void setDolzina(double dolzina) {
		this.dolzina = dolzina;
	}
	
	public void setMiniBar(boolean miniBar) {
		this.miniBar = miniBar;
	}
	
	public double getDolzina() {
		return this.dolzina;
	}
	
	public boolean getMiniBar() {
		return this.miniBar;
	}
	
	public void izpis() {
		super.izpis();
		System.out.println("Dolzina: " + this.getDolzina() + " metrov");
		System.out.println("Mini bar: " + this.getMiniBar());
	}
	
}